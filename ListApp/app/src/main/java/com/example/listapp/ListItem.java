package com.example.listapp;

public class ListItem
{
    private String itemNmae;
    private  String itemImage;

    public String getItemNmae() {
        return itemNmae;
    }

    public void setItemNmae(String itemNmae) {
        this.itemNmae = itemNmae;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public ListItem(String itemNmae, String itemImage) {
        this.itemNmae = itemNmae;
        this.itemImage = itemImage;
    }
}
