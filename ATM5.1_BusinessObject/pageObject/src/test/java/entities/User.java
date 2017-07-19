package entities;

/**
 * Created by Sona_Gamaryan on 7/17/2017.
 */
public class User {
    private static final String PASSWORD ="epam1234.";
    private static final String LOGIN ="epam0333";

    public String getPassword(){
       return PASSWORD;
   }

    public static String getLogin() {
        return LOGIN;
    }
}
