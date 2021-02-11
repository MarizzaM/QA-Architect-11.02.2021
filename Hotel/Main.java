package com.example;

public class Main {

    public static void main(String[] args) {

        Room r = new Room();
        VIP vip = new VIP();
        Standart s = new Standart();
        Celebrity c = new Celebrity();
        President p = new President();
        callCleanRoom(r);
        callCleanRoom(vip);
        callCleanRoom(s);
        callCleanRoom(c);
        callCleanRoom(p);
        
        goToVIP(vip);
        goToVIP(c);
        goToVIP(p);

        Room[]rooms = new Room[5];
        rooms[0] = new Room();
        rooms[1] = new VIP();
        rooms[2] = new Standart();
        rooms[3] = new Celebrity();
        rooms[4] = new President();
    }
    public static void callCleanRoom(Room r){
            r.cleanRoom();
    }
    
    public static void goToVIP(VIP r){
        r.cleanRoom();
    }
}
