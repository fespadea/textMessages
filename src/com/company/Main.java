package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // 215-328-4560
        ArrayList<MessageList> list = new ArrayList<>();
        System.out.println("Add a new contact.");
        System.out.println("Enter the number.");
        Scanner contact = new Scanner(System.in);
        MessageList m = new MessageList(contact.next());
        list.add(m);
        System.out.println("Send a message.");
        Scanner message = new Scanner(System.in);
        Message test = new Message(list.get(0).person, message.nextLine());
        list.get(0).add(test);
        System.out.println("Add another contact.");
        Scanner contacst = new Scanner(System.in);
        MessageList me = new MessageList(contacst.next());
        list.add(0, me);
        list.get(1).move(0, list.get(0));
        System.out.println("Moved a message.");
        System.out.println(list.get(0).person + ": " + list.get(0).contacts.get(0).getMessage());
    }
}
