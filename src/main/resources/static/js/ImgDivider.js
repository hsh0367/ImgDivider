
var action = '';
var url = '';
var type = '';
var use_type = 0;

function img_click(img_no,img_use){
        url = '/img/'+img_no;
		if(img_use == 0){
			use_type = 1;
		}else{
		    use_type = 0;
		}

		var data = {
			"is_use" : use_type,
			"img_no" : img_no
		};

		$.ajax({
			url : url,
			type : "POST",
			data : data,
			success: function(){
                location.reload();
			}
		})
    }

    const selectElement = document.querySelector('.selectpicker');
    selectElement.addEventListener('change', (event) => {
      var selected_person = event.target.value;

           url = '/person/'+selected_person;
      		var data = {
      			"person_nm" : selected_person
      	  		};
        $.ajax({
        			url : url,
        			type : "GET",
        			data : data,
        			contentType: 'application/json',
        			success: function(){
                        window.location.href = 'http://localhost:8080/person/'+data.person_nm;
                    }
        		})
    });