package com.example;

import lombok.Getter;
import lombok.Setter;

public class Celebrity extends VIP {
    private @Getter @Setter int countOfBed;

    public void goParty(){
        System.out.println("Mesiba-BA-BA-BA");
    }
}
