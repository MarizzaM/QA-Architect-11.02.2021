package com.example;

import lombok.Getter;
import lombok.Setter;

public class Animal {
    private @Getter @Setter String name;
    private @Getter @Setter int size;
    private @Getter @Setter String color;

    public void gotoVet(){
        System.out.println(String.format("%s, don't worry", name));
    }

}
