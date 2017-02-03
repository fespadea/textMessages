package com.company;
import java.util.*;
import java.text.*;
/**
 * Created by fs279 on 1/30/17.
 */
public class Message {
    private String personNumber;
    private String message;
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Date dateobj = new Date();
    public final String timeRecieve = df.format(dateobj);
    public Message(String pN, String m){
        personNumber = pN;
        message = m + " " + timeRecieve;
    }
    public String getMessage(){
        return message;
    }
    public String getPersonNumber(){
        return personNumber;
    }
}
