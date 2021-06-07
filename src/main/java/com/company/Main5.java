package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main5 {


    public static void main(String[] args) {

        ArrayList users = new ArrayList();

        users.add(new User(1695, "alex", "a", 347913, "reg"));
        users.add(new User(3273, "oleg", "b", 347913, "reg"));
        users.add(new User(3244, "bob", "c", 347913, "ing"));
        users.add(new User(3257, "den", "d", 347913, "ing"));
        users.add(new User(3266, "alex", "g", 347913, "sbor"));

        //ListIterator itr = users.listIterator();
        Iterator iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = (User)iterator.next();
            System.out.println("id - " + user.getId() + " : name - "
                    + user.getFistName() + " : last name - "
                    + user.getLastName() + " : company ID - " +
                    + user.getCompanyId());
        }
    }
}