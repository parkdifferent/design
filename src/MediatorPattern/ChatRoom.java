package MediatorPattern;

import java.util.Date;

/**
 * Created by tianf on 2016/8/18.
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
