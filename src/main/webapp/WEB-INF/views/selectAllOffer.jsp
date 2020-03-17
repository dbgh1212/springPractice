<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>eStore</title>
	</head>
	<body>
	<table>
		<tr>
			<th>
				상품명
			</th>
			<th>
				가격
			</th>
			<th>
				재고
			</th>
		</tr>
		<c:forEach var="product" items="${productList}">
			<tr>
				<td>
					<c:out value="${product.name}"/>
				</td>
				<td>
					<c:out value="${product.price}"/>
				</td>
				<td>
					<c:out value="${product.stock}"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	</body>
</html>