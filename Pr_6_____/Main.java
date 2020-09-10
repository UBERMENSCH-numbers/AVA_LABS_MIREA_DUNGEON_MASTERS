package Pr_6_____;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] ar = {new Student(1), new Student(2), new Student(3), new Student(4), new Student(5)};
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        System.out.println("Not sorted :" + Arrays.toString(ar));
        sortingStudentsByGPA.quickSort(ar, 0, ar.length - 1);
        System.out.println("Sorted :" + Arrays.toString(ar));

        TestClass testClass = new TestClass();
        System.out.println(Arrays.toString(testClass.sort()));


    }

}
