import java.util.HashMap;

public class Accounts {

    HashMap<String,String> userPassword = new HashMap<String,String>();

    Accounts(){
        userPassword.put("Nikita","qwerty");
        userPassword.put("Dugthedog","treats");
    }

    protected HashMap getUserPassword(){
        return userPassword;
    }
}
