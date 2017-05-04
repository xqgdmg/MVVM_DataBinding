package com.example.qhsj.myapplication.bean;

/**
 * Created by qhsj on 2017/5/4.
 */

public class MainViewModel {
    public  String firstName;
    public  String lastName;

    public MainViewModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
