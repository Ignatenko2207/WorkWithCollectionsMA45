package com.mainacad;

import com.mainacad.model.User;

import java.util.*;

public class ApplicationRunner {

    public static void main(String[] args) {

        User user1 = new User("Alex", 37);
        User user2 = new User("Uriy", 25);
        User user3 = new User("Peter", 21);
        User user4 = new User("Nikita", 20);
        User user5 = new User("Mia", 25);
        User user6 = user1;
        User user7 = user2;

        Queue<User> queue = new PriorityQueue<>();
        queue.add(user4);
        queue.add(user5);
        queue.add(user1);
        queue.add(user2);
        queue.add(user3);
        queue.add(user6);
        queue.add(user7);
        queue.add(user3);

        System.out.println(
                "Queue has size " + queue.size());

        User firstElement = queue.peek();

        System.out.println(
                "Queue has size " + queue.size() + " after peek()");

        firstElement = queue.poll();

        System.out.println(
                "Queue has size " + queue.size() + " after poll()");

        List<User> list = new ArrayList<>(queue);

        System.out.println(
                "List has size " + list.size());

        list.add(user4);

        System.out.println(
                "List has size " + list.size() + " after add()");

        Set<User> set = new HashSet<>(list);

        System.out.println(
                "Set has size " + set.size());



    }
}
