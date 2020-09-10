package Lab_4;

import javax.naming.Name;

public class Test {
    public static void main(String[] args) {
        Nameable c = new Car("carname");
        System.out.println(c.getName());

        Nameable p = new Planet("planetname");
        System.out.println(p.getName());
    }
}
