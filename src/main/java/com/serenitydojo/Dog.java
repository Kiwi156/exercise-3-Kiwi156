package com.serenitydojo;
public class Dog {
    public String name;
    public String favoriteToy;
    public int age;

    public String favoriteGame;
    static String DOG_NOISE = "BarkBark";
    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteGame(String favoriteGame) { this.favoriteGame = favoriteGame;}

    public String getFavoriteGame() {return favoriteGame;}

    public String getName() {return name;}
    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed() {
        System.out.println("isFed field to true");

    }


    public void favoriteGame(String puppies) {
    }
}
