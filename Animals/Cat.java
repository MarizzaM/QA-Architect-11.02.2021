package com.example;

import lombok.Getter;
import lombok.Setter;

public class Cat extends Animal {

    private @Getter @Setter String favoriteMilkName;

    public  void cuddle(){
        System.out.println(String.format("%s, come to me. I'll give you %s", getName(), favoriteMilkName));
    }
}
