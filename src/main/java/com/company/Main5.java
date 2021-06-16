package com.company;

import java.util.ArrayList;
import java.util.Iterator;


public class Main5 {


    public static void main(String[] args) {

        ArrayList<User>  users = new ArrayList<>();

        users.add(new User(1695, "alex", "a", 347913, "reg"));
        users.add(new User(3273, "oleg", "b", 347913, "reg"));
        users.add(new User(3244, "bob", "c", 347913, "ing"));
        users.add(new User(3257, "den", "d", 347913, "ing"));
        users.add(new User(3266, "alex", "g", 347913, "sbor"));


       /* Iterator iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = (User)iterator.next();*/
        for(User user  : users) {
            // User user = (User) users.get(i);
            System.out.println("id - " + user.getId() + " : name - "
                    + user.getFistName() + " : last name - "
                    + user.getLastName() + " : company ID - " +
                    + user.getCompanyId());
        }
    }
}