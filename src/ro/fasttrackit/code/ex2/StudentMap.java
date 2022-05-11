package ro.fasttrackit.code.ex2;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<String, Integer> studentHashMap = new HashMap<>();
        studentHashMap.put("Pop Andrei Marian", 10);
        studentHashMap.put("Apopei Adriana", 8);
        studentHashMap.put("Popescu Ana Maria", 5);
        studentHashMap.put("Radu Ana", 7);

        for (Map.Entry<String, Integer> stringIntegerEntry : studentHashMap.entrySet()) {
            System.out.println("Student " + stringIntegerEntry.getKey() + " has grade " + stringIntegerEntry.getValue());
        }

        int maxGrade = 0;
        String studentWithMaxGrade = "";
        for (Map.Entry<String, Integer> stringIntegerEntry : studentHashMap.entrySet()) {
            if (maxGrade < stringIntegerEntry.getValue()) {
                maxGrade = stringIntegerEntry.getValue();
                studentWithMaxGrade = stringIntegerEntry.getKey();
            }
        }
        System.out.println(studentWithMaxGrade + " has the highest grade. The grade is: " + maxGrade);

        List<Map.Entry<String, Integer>> studentList = new ArrayList<>(studentHashMap.entrySet());
        Collections.sort(studentList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> student : studentList) {
            System.out.println("Student name is " + student.getKey() + ". Grade is " + student.getValue());
        }

        Set<Integer> gradeSet = new HashSet<>(studentHashMap.values());
        System.out.println(gradeSet);

        Set<Character> firstLetters = new HashSet<>();
        Set<String> middleNames = new HashSet<>();
        for (String name : studentHashMap.keySet()) {
            firstLetters.add(name.charAt(0));
            middleNames.add(name.split(" ")[1]);
        }
        System.out.println(firstLetters);
        System.out.println(middleNames);
    }
}

