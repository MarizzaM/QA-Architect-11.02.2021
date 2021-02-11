package com.example;

import lombok.Getter;
import lombok.Setter;

public class Room {
    private @Getter @Setter int number;
    private @Getter @Setter int floor;
    private @Getter @Setter boolean isSnoking;
    private @Getter @Setter boolean isClean;

    public void cleanRoom(){
        isClean = true;
        System.out.println(String.format("Room #%d  is clean", number));
    }
}
