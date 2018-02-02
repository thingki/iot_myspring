<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>사원정보 입력</h2>
<form:form commandName="empDTO" action="${root}/emp/insert" method="get">
이름 : <input type="text" name="emName" id="emName" value="${empDTO.emName}"><br>
월급 : <input type="text" name="emSal" id="emSal" value="${empDTO.emSal}"><br>
<button>사원정보 추가</button>
<a href="${root}/emp/list"><button type="button">리스트돌아가기</button></a>
</form:form>
</body>
</html>