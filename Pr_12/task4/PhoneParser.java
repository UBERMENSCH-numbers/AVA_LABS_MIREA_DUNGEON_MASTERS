package Pr_12.task4;

public class PhoneParser {
    public static String parsePhone(String str) {
        if(str.charAt(0) == '+'){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+")
                    .append(str.charAt(1))
                    .append(str, 2, 5)
                    .append('-')
                    .append(str, 5, 8)
                    .append('-')
                    .append(str, 8, 12);
            return stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+")
                    .append("7")
                    .append(str, 1, 4)
                    .append('-')
                    .append(str, 4, 7)
                    .append('-')
                    .append(str, 7, 11);
            return stringBuilder.toString();
        }
    }
}
