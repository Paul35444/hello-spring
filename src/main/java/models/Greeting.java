package models;

/**
 * Created by paul3 on 3/6/2017.
 */
public class Greeting {

    public static String createMessage(String name) {

        if (name == null) {
            name = "World";
        }
        return "Hello " + name;

    }
}
