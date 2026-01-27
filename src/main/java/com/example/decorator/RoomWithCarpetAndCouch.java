package com.example.decorator;

public class RoomWithCarpetAndCouch extends RoomDecorator {

  private Room room;

  public RoomWithCarpetAndCouch(Room room) {
    super(room);
    this.room = room;
  }

  @Override
  public void printFurniture() {
    super.printFurniture();
    System.out.println("Couch");
    System.out.println("Carpet");
  }

}
