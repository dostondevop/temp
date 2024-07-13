package model;

import java.util.UUID;

public class Category {
    private UUID id;
    private String name;
    private int price;
    private int quantity;
    private UUID parentID;
    private UUID ownerID;

    public Category() {
        this.id = UUID.randomUUID();
    }

    public Category(String name, int price, int quantity, UUID parentID) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.parentID = parentID;
    }

    public Category(String name, int price, int quantity, UUID parentID, UUID ownerID) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.parentID = parentID;
        this.ownerID = ownerID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getParentID() {
        return parentID;
    }

    public void setParentID(UUID parentID) {
        this.parentID = parentID;
    }

    public UUID getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(UUID ownerID) {
        this.ownerID = ownerID;
    }
}
