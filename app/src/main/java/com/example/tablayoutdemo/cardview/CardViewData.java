package com.example.tablayoutdemo.cardview;

public class CardViewData {
     String Name_of_user;
    String Description;
    int image;

    public CardViewData(String name_of_user, String description) {
        Name_of_user = name_of_user;
        Description = description;
        this.image = image;
    }

    public String getName_of_user() {
        return Name_of_user;
    }

    public void setName_of_user(String name_of_user) {
        Name_of_user = name_of_user;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
