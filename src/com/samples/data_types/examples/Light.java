package com.samples.data_types.examples;

/**
 * Created by talalUcef on 02/01/2016.
 */
public class Light {

    // This program Calculates the  dinstance light travels usings long
    // Mathematic formule : v = d/t where v is speed, d is distance andt is time period
    // We want to calculate d = v * t;

    public static void main(String[] args ) {
        // Light speed in Km/s
        int lightSpeed = 300000;
        // Time period in s
        long secnds = 356 * 24 * 60 * 60;
        // Distance in Km
        long distance = lightSpeed * secnds;

        System.out.println("The distance that the light travles in one year is "+ distance + " Km");
    }
}
