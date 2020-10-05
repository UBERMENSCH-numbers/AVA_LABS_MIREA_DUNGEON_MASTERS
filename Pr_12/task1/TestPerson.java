package Pr_12.task1;


public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("testname");
        System.out.println(p1);

        p1.setName("Abba");
        System.out.println(p1);

        p1.setPatronymic("Babba");
        System.out.println(p1);
    }
}
