package home.leetcode.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();

        Employee emp1=new Employee(1,"Ankur",10);
        Employee emp2=new Employee(2,"Amit",22);
        Employee emp3=new Employee(2,"Amit",22);
        Employee emp4=new Employee(4,"Ajay",23);

        list.add(emp1);list.add(emp2);list.add(emp3);list.add(emp4);

        //list.stream().forEach(e-> System.out.println(e.getName()));

        Map<Integer,Employee> map= list.stream().distinct().collect(Collectors.toMap(e-> e.getId(), e-> e));
        System.out.println(map.entrySet().size());
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()));
    }


}

class Employee{
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}


