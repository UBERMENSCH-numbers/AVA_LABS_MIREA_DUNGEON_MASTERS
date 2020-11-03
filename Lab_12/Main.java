package Lab_12;

public class Main {
    public static void main(String[] args) {
        RegExps regExps = new RegExps();
//        System.out.println(regExps.split("dfs sffs  fsdf", " "));
        System.out.println(regExps.is_abcdefghijklmnopqrstuv18340("abcdefghijklmnopqrstuv18340"));
        System.out.println(regExps.is_abcdefghijklmnopqrstuv18340("a"));
        regExps.getPrice("this line contains 25.12 EU 12.10 RUB, 1.20 USD");
        System.out.println(regExps.hasPlus("1 + 8"));
        System.out.println(regExps.hasPlus("1 * 8"));
        System.out.println(regExps.isData("12/10/1999"));
        System.out.println(regExps.isData("12/00/1999"));
        System.out.println(regExps.isEmail("user@example.com"));
        System.out.println(regExps.isEmail("myhost@@@com.ru"));
        System.out.println(regExps.isPassword("F032_Password"));
        System.out.println(regExps.isPassword("smart_pass"));

    }
}
