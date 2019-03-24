package com.example.justjava;

public class Cat extends Animal {
        public Cat(int age, String name) {
            super(age, name);
        }
        public String Life(){
            WhatNumberI += 1;
            return("я знаю что меня зовут " + name + " а возраст мой "+ age+ " нормальных лет"+" при этом в этом мире животных уже "+WhatNumberI);
        }
    }


