package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Student implements ID {

    public String name;
    private int ident;
    private String cell;
    private Address addy;

    public Student(int identification, String name, String number) {
        this.name = name;
        this.ident = identification;
       // this.addy = addy;
        this.cell = number;

    }

    public Student() {
    }

    @Override
    public String toString() {
        return String.valueOf(ident);
    }


    @Override
    public void returnFullInfo() {
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ ident);
        //System.out.println("Address: "+addy);
        System.out.println("Phone Number: "+cell);


    }
}

