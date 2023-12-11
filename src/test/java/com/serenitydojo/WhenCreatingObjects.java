package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {


    @Test
    public void creating_a_dog(){
        Dog Rover = new Dog();

        Rover.setName("Rover");
        System.out.println(Rover.getName());
        Rover.setFavoriteToy("Ball");
        System.out.println(Rover.getFavoriteToy());
        Rover.setAge(2);
        System.out.println(Rover.getAge());
        Rover.setFavoriteGame("Puppies");
        System.out.println(Rover.getFavoriteGame());
        System.out.println(Rover.getFavoriteGame());gi


        Assert.assertEquals(Rover.getName(),"Rover");
        Assert.assertEquals(Rover.getFavoriteToy(), "Ball");
        Assert.assertEquals(Rover.getAge(), 2 );

    }
    @Test
    public void Dog_makes_noise(){

        Dog Rover = new Dog();

        Rover.setName("Rover");
        System.out.println(Rover.getName());
        Rover.setFavoriteToy("Ball");
        System.out.println(Rover.getFavoriteToy());
        Rover.setAge(2);
        System.out.println(Rover.getAge());

        Rover.makeNoise();
        Rover.feed();
    }

    @Test
    public  void  creating_a_hamster(){

        Hamster Buster = new Hamster();
        Buster.setName("Buster");
        System.out.println(Buster.getName());

    }

}
