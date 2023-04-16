//package personal.controllers;
package personal.utils;
import personal.model.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//package personal.utils;
//public class Validate {
//    public void validate(User user) {
//        if (!pattern.matcher(user.getFirstName()).find()) {
//            throw new RuntimeException("Имя пользователя не может быть пустым");
//
//        }
//        if (!pattern.matcher(user.getLastName()).find()) {
//            throw new RuntimeException("Фамилия пользователя не может быть пустым");
//        }
//        if (!patternDigit.matcher(user.getPhone()).find()) {
//            throw new RuntimeException("Номер телефона пользователя не может быть пустым");
//        }
//    }
//    final String regex = "^\\S+$";
//    final String reDigit = "^\\d+$";
//    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//    final Pattern patternDigit = Pattern.compile((reDigit));








//package personal.utils;
//
public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new personal.utils.PhoneException("Номер начинается с плюса +");
        }

        else if(telephone.length() != 12) {
            throw new personal.utils.PhoneException("Длина телефона должна быть 11");
        }
    }
}