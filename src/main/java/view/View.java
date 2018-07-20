package view;

/**
 * Created by Таня on 19.07.2018.
 */
public class View {
    public static String INPUT_NAME = "input your name";
    public static String INPUT_SURNAME = "input your surname";
    public static String INPUT_TELEPHONE = "input your telephone. begin with +380 ";
    public static String INPUT_EMAIL = "input your email";
    public static String WRONG_INPUT_DATA = "Wrong input data! repeat please";

    public void printMessage (String message) {
        System.out.println(message);
    }
}
