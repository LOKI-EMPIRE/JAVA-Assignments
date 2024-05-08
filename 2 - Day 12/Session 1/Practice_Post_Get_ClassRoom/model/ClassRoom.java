package com.examly.springapp.model;

public class ClassRoom {

    private int roomId;
    private int roomCapacity;
    private String roomType;
    private boolean hasProjector;

    public ClassRoom(int roomId, int roomCapacity, String roomType, boolean hasProjector) {
        this.roomId = roomId;
        this.roomCapacity = roomCapacity;
        this.roomType = roomType;
        this.hasProjector = hasProjector;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }
    
}
