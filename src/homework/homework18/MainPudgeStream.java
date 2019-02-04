package homework.homework18;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainPudgeStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {



        Pudge pudge = new Pudge("res/internalization/England.png", new Locale("en", "EN"));

        //DataStreamEngine.saveState(pudge);

//       Pudge pudge = DataStreamEngine.loadState();
//
//        System.out.println(pudge);
//
//        Locale locale = new Locale(pudge.getLang(), pudge.getCountry());
//
//
//        ResourceBundle text = ResourceBundle.getBundle("TextBundle", locale);
//
//        System.out.println(text.getString("save"));
//        System.out.println(text.getString("load"));
//
//        new GUIEngine(pudge);






    }




}
