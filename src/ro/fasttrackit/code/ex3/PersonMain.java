package ro.fasttrackit.code.ex3;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Andrei", 21, "black"));
        personList.add(new Person("Maria", 30, "red"));
        personList.add(new Person("Ana", 30, "red"));
        personList.add(new Person("Aurel",30,"blown"));

        Map<String, Integer> nameToAgeMap = new HashMap<>();
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(person.getName());
            nameToAgeMap.put(person.getName(), person.getAge());
        }
        System.out.println(names);
        System.out.println(nameToAgeMap);

        System.out.println(getOlderPersons(personList, 25));
        System.out.println(getHairToPersons(personList));
        System.out.println(getAgeToPerson(personList));

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getHairColor().compareTo(o2.getHairColor());
                } else {
                    return o2.getAge() - o1.getAge();
                }
            }

        });

        System.out.println(personList);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().charAt(o2.getName().length() -1) - o1.getName().charAt(o1.getName().length() -1);
            }
        });

        System.out.println(personList);

    }

    public static List<Person> getOlderPersons(List<Person> personList, int age) {
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : personList) {
            if (age < person.getAge()) {
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }

    public static Map<String, List<String>> getHairToPersons(List<Person> personList) {
        Map<String, List<String>> hairToPersons = new HashMap<>();
        for (Person person : personList) {
            if (hairToPersons.containsKey(person.getHairColor())) {
                hairToPersons.get(person.getHairColor()).add(person.getName());
            } else {
                List<String> names = new ArrayList<>();
                names.add(person.getName());
                hairToPersons.put(person.getHairColor(), names);
            }
        }
        return hairToPersons;
    }

    public static Map<Integer, List<Person>> getAgeToPerson(List<Person> personList) {
        Map<Integer, List<Person>> ageToPerson = new HashMap<>();
        for (Person person : personList) {
            if (ageToPerson.containsKey(person.getAge())) {
                ageToPerson.get(person.getAge()).add(person);
            } else {
                List<Person> names = new ArrayList<>();
                names.add(person);
                ageToPerson.put(person.getAge(), names);
            }
        }
        return ageToPerson;
    }

}
