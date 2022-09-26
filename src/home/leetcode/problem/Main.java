package home.leetcode.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Student student1=new Student(1,"",15,"Pune");
        Student student2=new Student(1,"",15,"Agra");
        Student student3=new Student(1,"",15,"Dun");

        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Map<String,Integer> marksMap1= new HashMap<>();
        Map<String,Integer> marksMap2= new HashMap<>();
        Map<String,Integer> marksMap3= new HashMap<>();

        marksMap1.put(Subject.PHYSICS.getSub(),44);
        marksMap1.put(Subject.CHEMISTRY.getSub(),55);
        marksMap1.put(Subject.ECO.getSub(),88);
        student1.setSubjectToMarks(marksMap1);

        marksMap2.put(Subject.PHYSICS.getSub(),67);
        marksMap2.put(Subject.CIVICS.getSub(),44);
        marksMap2.put(Subject.GEO.getSub(),88);
        student2.setSubjectToMarks(marksMap2);

        marksMap3.put(Subject.CHEMISTRY.getSub(),87);
        marksMap3.put(Subject.CIVICS.getSub(),66);
        marksMap3.put(Subject.ECO.getSub(),56);
        student3.setSubjectToMarks(marksMap3);

        double sum= studentList.get(0).getSubjectToMarks().
                entrySet().stream().mapToInt(Map.Entry::getValue).average().getAsDouble();
        System.out.println(sum);
    }
}




