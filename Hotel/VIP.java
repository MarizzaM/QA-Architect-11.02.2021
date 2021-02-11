package com.example;

import lombok.Getter;
import lombok.Setter;

public class VIP extends Room {
    private @Getter @Setter boolean isJacuzzi;
    
    public void goParty(){
        System.out.println("Mesiba-BA-BA-BA");
    }
}
