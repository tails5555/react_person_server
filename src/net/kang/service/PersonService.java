package net.kang.service;

import net.kang.dto.Person;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private static List<Person> list = null;

    public static void reset(){
        list = new ArrayList<Person>();
        list.add(new Person(1, "강인성", 25));
        list.add(new Person(2, "박병조", 25));
        list.add(new Person(3, "조민국", 27));
        list.add(new Person(4, "배다슬", 26));
        list.add(new Person(5, "서종현", 25));
        list.add(new Person(6, "장승훈", 25));
    }

    public static List<Person> getAll() {
        if (list == null) reset();
        return list;
    }

    public static void save(Person person) {
        if (list == null) reset();
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getId() == person.getId()) {
                list.set(i, person);
                return;
            }
        }
        list.add(person);
    }

    public static void delete(int id) {
        if (list == null) reset();
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return;
            }
        }
    }

    public static Person createPersonFromRequestParameter(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        return new Person(id, name, age);
    }
}
