package Pr_6_____;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
    Student[] sort () {
        Student[] arr1 = {new Student(1),new Student(12),new Student(54),new Student(56),new Student(78)};
        Student[] arr2 = {new Student(0),new Student(14),new Student(4),new Student(564),new Student(8)};

        return mergesort(arr1, arr2);
    }


    public static Student[] mergesort(Student[] array1, Student[] array2) {
        Student[] buffer1 = array1;
        Student[] buffer2 = array2;
        Student[] result = mergesortInner(buffer1, buffer2, 0, buffer1.length);
        return result;
    }

    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1].id < sorted2[index2].id
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }


}
