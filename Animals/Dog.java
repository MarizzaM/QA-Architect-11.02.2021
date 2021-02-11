package com.example;

import lombok.Getter;
import lombok.Setter;

public class Dog extends Animal{
    private @Getter @Setter boolean barkLength;

    public void guardHouse(){
        if (barkLength)
            System.out.println(String.format("%s, you are guardHouse! Good boy!", getName()));
    }
}
