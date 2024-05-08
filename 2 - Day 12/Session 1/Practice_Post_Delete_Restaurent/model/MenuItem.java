package com.example.springapp.model;

public class MenuItem {

    private int menuId;
    private String itemName;
    private float price;
    private int quantity;
    private String description;

    public MenuItem(int menuId, String itemName, float price, int quantity, String description) {
        this.menuId = menuId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
