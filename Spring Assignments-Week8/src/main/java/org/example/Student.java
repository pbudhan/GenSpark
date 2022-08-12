package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Student implements ID {

    private String name;
    private int iD;
    private List<String> cell;
    private Address addy;

    public Student(int iD, String name, Address addy, List<String> number) {
        this.name = name;
        this.iD = iD;
        this.addy = addy;
        this.cell = number;

    }

    public Student() {
    }

    @Override
    public String toString() {
        return String.valueOf(iD);
    }


    @Override
    public void returnFullInfo() {
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ iD);
        System.out.println("Address: "+addy);
        System.out.println("Phone Number: "+cell);


    }
}

