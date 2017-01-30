package com.company;
import java.util.*;
import java.text.*;
/**
 * Created by fs279 on 1/30/17.
 */
public class Message {
    public String personNumber;
    public String message;
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Date dateobj = new Date();
    public String timeRecieve = df.format(dateobj);
}
