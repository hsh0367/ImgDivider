window.addEventListener('DOMContentLoaded', function(e) {

    var waterfall = new Waterfall({ minBoxWidth: 100 });

    // button click handle
    var btn = document.getElementById('add-btn');
    var boxHandle = newNode();
    btn.addEventListener('click', function() {
        waterfall.addBox(boxHandle());
    });

    var scaleUpbtn = document.getElementById('scaleup-btn');
    scaleUpbtn.addEventListener('click', function() {

        waterfall.minBoxWidth += 50;
        waterfall.compose(true);
    });

    var scaleDownbtn = document.getElementById('scaledown-btn');
    scaleDownbtn.addEventListener('click', function() {

        waterfall.minBoxWidth -= 50;
        waterfall.compose(true);
    });

    window.onscroll = function() {
        var i = waterfall.getHighestIndex();
        if(i > -1) {
            // get last box of the column
            var lastBox = Array.prototype.slice.call(waterfall.columns[i].children, -1)[0];
        }
    };

    function checkSlide(elem) {
        if(elem) {
            var screenHeight = (document.documentElement.scrollTop || document.body.scrollTop) +
                               (document.documentElement.clientHeight || document.body.clientHeight);
            var elemHeight = elem.offsetTop + elem.offsetHeight / 2;

            return elemHeight < screenHeight;
        }
    }

    function newNode() {
        return function() {

            var box = document.createElement('div');
            box.className = 'wf-box';
            var image = document.createElement('img');
            image.src = "/resources/img/initImage.png";
            box.appendChild(image);
            var content = document.createElement('div');
            return box;
        };
    }
});
