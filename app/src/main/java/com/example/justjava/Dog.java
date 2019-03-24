package com.example.justjava;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }
    @Override
    public String Life(){
        WhatNumberI += 1;
        age = age*8;
        return("я знаю что я живу уже "+ age +" собачьих лет и я " +name+ " при этом в этом мире животных уже "+WhatNumberI);
    }
}
