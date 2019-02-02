package lesson.Lesson18_020022019.p3_internalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LoM {

    public static void main(String[] args) {

        String lang = "de";
        String country = "DE";
        Locale locale = new Locale(lang, country);


        ResourceBundle messages = ResourceBundle.getBundle("MessageBundle", locale);

        System.out.println(messages.getString("hello"));
        System.out.println(messages.getString("sps"));



    }




}
