package com.furkanbingol.landmarkreview;

import java.io.Serializable;

public class Landmark implements Serializable {    //implementing Serializable Interface
    String name;
    String country;
    int image;    //R.drawable.(image) --> int

    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
