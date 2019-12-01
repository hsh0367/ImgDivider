<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<title>Test Read Data</title>
</head>
<body>

	<div class="container">

				<c:forEach var="board" items="${boardList}">
					<tr>
						<td>${board.image_no}</td>
						<td>${board.img_path}</td>
						<td>${board.person_nm}</td>
					</tr>
				</c:forEach>
	</div>
</body>
</html>