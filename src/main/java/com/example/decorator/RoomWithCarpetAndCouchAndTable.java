package com.example.decorator;

public class RoomWithCarpetAndCouchAndTable extends RoomWithCarpetAndCouch {

  private Room room;

  public RoomWithCarpetAndCouchAndTable(Room room) {
    super(room);
    this.room = room;
  }

  @Override
  public void printFurniture() {
    super.printFurniture();
    System.out.println("Table");
  }

}
