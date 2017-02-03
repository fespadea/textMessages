package com.company;

import java.util.*;

/**
 * Created by fs279 on 1/30/17.
 */
public class MessageList {
    public MessageList(String personNumber){
        person = personNumber;
    }
    public ArrayList<Message> contacts = new ArrayList<>();
    public String person;
    public void add(Message m){
        contacts.add(0, m);
    }
    public void move(int position, MessageList ml){
        ml.add(contacts.get(position));
        contacts.remove(position);
    }
}
