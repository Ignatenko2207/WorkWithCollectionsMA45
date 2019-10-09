package com.mainacad.model;

public class User implements Comparable<User>{

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User user) {
        if (this.age > user.age){
            return 1;
        } else if (this.age < user.age) {
            return -1;
        }
        return 0;
    }
}
