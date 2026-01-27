package com.example.decorator;

public abstract class RoomDecorator implements Room {

  protected Room room;

  public RoomDecorator(Room room) {
    this.room = room;
  }

  @Override
  public void printFurniture() {
    System.out.println("Room with basic furniture");
  }

}
