package home.leetcode.problem;

import java.util.Map;

public class Student {
    int id;
    String name;
    int age;
    Address address;
    Map<String,Integer> subjectToMarks;

    public Student(int id, String name, int age, String address1) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = new Address(address1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Integer> getSubjectToMarks() {
        return subjectToMarks;
    }

    public void setSubjectToMarks(Map<String, Integer> subjectToMarks) {
        this.subjectToMarks = subjectToMarks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddres(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Address{

    String address1;

    public Address(String address1) {
        this.address1 = address1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
}