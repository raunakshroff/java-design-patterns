package com.example.decorator;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var roomWithCarpet = new RoomWithCarpetAndCouch(room);
        roomWithCarpet.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table
        var roomWithCarpetAndTable = new RoomWithCarpetAndCouchAndTable(room);
        roomWithCarpetAndTable.printFurniture();
    }

}
