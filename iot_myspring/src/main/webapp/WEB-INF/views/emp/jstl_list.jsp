<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>월급</th>
		</tr>
		<c:forEach items="${empList}" var="emp">
			<tr>
				<td><a href="${root}/view/customer/list?order=customername&type=${type}">${emp.emNo}</td>
				<td>${emp.emName}</td>
				<td>${emp.emSal}</td>
			</tr>
		</c:forEach>
	</table>
<a href="${root}/path/emp/write"><button>사원정보 추가</button></a>

</body>
</html>