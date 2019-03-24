package com.example.justjava;

public abstract class Animal {
    int age;
    String name;
    static int WhatNumberI;
    public Animal(int age,String name){
        this.age=age;
        this.name=name;

    }
    public abstract String Life ();
}
