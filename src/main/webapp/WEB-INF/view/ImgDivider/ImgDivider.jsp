<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/resources/css/ImgDivider.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.1/css/bootstrap-select.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.1/js/bootstrap-select.js"></script>

    <title>test2</title>
</head>
<body>
    <header class="header">


    </header>
    <div class="middle">
      <div class="content">
          <h1>Waterfall</h1>
          <select class="selectpicker" data-show-subtext="true" data-live-search="true">
                 <option selected disabled hidden>---SELECT---</option>
                <c:forEach var="person" items="${personlist}">
          		    <option value="${person.person_nm}">${person.person_nm}</option>
          		</c:forEach>
          </select>

          <div class="btn-group">
              <button id='add-btn' class="btn btn-primary">Add Box</button>
              <button id='scaleup-btn' class="btn btn-primary">Scale Up</button>
              <button id='scaledown-btn' class="btn btn-primary">Scale Down</button>
          </div>
      </div>
    </div>
    <section>

        <div class="wf-container">
           <c:forEach var="image" items="${imglist}">
            <c:choose>
                <c:when test= "${image.is_use == 0}">
                    <div class="wf-box">
                        <img src= ${image.img_path}; id = ${image.img_no} onclick=img_click(${image.img_no},${image.is_use})>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="wf-box">
                        <img src= ${image.img_path}; id = ${image.img_no} onclick=img_click(${image.img_no},${image.is_use}) style="opacity:0.5;">
                    </div>
                </c:otherwise>
            </c:choose>
            </c:forEach>
        </div>
    </section>
    <script src="/resources/js/responsive_grid.js"></script>
    <script src="/resources/js/waterfall.js"></script>
    <script src="/resources/js/ImgDivider.js"></script>

</body>
</html>
