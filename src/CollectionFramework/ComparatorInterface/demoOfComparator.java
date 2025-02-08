package CollectionFramework.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demoOfComparator {

    public static class Student{

        public int age;
        public String name;
        public int weight;

        Student(int age, String name, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(18, "Harsh", 69));
        students.add(new Student(17, "Harshit", 79));
        students.add(new Student(15, "Harsh", 65));
        students.add(new Student(19, "Mayank", 85));
        students.add(new Student(20, "Rohit", 90));

        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.weight - o2.weight;
            }
        });

        System.out.println(students);
    }
}
