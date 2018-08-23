<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="net.kang.service.PersonService" %>
<%
int id = Integer.parseInt(request.getParameter("id"));
PersonService.delete(id);
%>
{ "result" : "OK" }
