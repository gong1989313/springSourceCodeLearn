<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>this is spring mvc demo page</h2>
<c:forEach items="${users}" var="user">
	<c:out value="${user.username}" /><br/>
	<c:out value="${user.age}" /><br/>
</c:forEach>