package Lab_12;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExps {

    //1.Необходимо реализовать консольное приложение, позволяющее манипулировать строкой, разбив ее на
    // элементы путем использования регулярных выражений.
    ArrayList<String> split(String string, String pattern){
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(string, pattern);
        while (stringTokenizer.hasMoreTokens()) list.add(stringTokenizer.nextToken());
        return list;
    }

    //2.Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет
    boolean is_abcdefghijklmnopqrstuv18340(String s){
        return s.matches("abcdefghijklmnopqrstuv18340");
    }

    //Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
    void getPrice(String string) {
        Matcher m = Pattern.compile("(?:^|[^\\w\\d.])([1-9]\\d*(?:.\\d{0,2})?\\s*(?:USD|EU|RUB))")
                .matcher(string);
        while (m.find()) {
            String matched= m.group(1);
            System.out.println(matched);
        }
    }

    //Дан текст, необходимо проверить есть ли в тексте цифры, за которыми не стоит знак «+».
    boolean hasPlus(String string) {
        Matcher m = Pattern.compile("([0-9]{1,9} \\+)").matcher(string);
        return m.find();
    }

    //Написать регулярное выражение, определяющее является ли данная строчка датой в формате dd/mm/yyyy.
    // Начиная с 1900 года до 9999 года.

    boolean isData(String s){
        return s.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/(19[0-8][0-9]|199[0-9]|[2-9][0-9]{3})");
    }
    // Написать регулярное выражение, определяющее является ли данная строчка допустимым (корректным) е-mail адресом согласно RFC под номером 2822. 
    boolean isEmail(String s) {
        return s.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?");
    }

    //Проверить, надежно ли составлен пароль. Пароль считается надежным, если он состоит из 8 или более символов.
    // Где символом может быть цифр, английская буква, и знак подчеркивания.
    // Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
    boolean isPassword(String s) {
        return s.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}");
    }
}
