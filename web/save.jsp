<%@ page language="java" contentType=" application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="net.kang.dto.Person, net.kang.service.PersonService" %>
<%
Person person = PersonService.createPersonFromRequestParameter(request);
PersonService.save(person);
%>
{ "result" : "OK" }