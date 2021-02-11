package com.example;

import lombok.Getter;
import lombok.Setter;

public class Labrador extends Dog{
    private @Getter @Setter int intelligenceQuantity;

    public void bringSlippers (){
        if (intelligenceQuantity > 70)
            System.out.println(String.format("%s, bring slippers, please", getName()));
    }
}
