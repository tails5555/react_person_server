<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List, net.kang.dto.Person, net.kang.service.PersonService" %>
<%
List<Person> list = PersonService.getAll();
out.print("[");
for (int i = 0; i < list.size(); ++i) {
    Person person = list.get(i);
    String s = String.format( "{ \"id\":%d, \"name\":\"%s\", \"age\":%d }",
            person.getId(), person.getName(), person.getAge() );
    out.print(s);
    if (i != list.size() - 1)
        out.println(",");
}
out.println("]");
%>
