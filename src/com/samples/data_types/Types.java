package com.samples.data_types;

/**
 * Created by talalUcef on 02/01/2016.
 */


public class Types {

    // Java is a strongly typed language

    // Primitives types in java are :
    //  # Integers : byle (8 bit), short (16 bis), int (32 bit) and long(64 bit)
    //  # Floting point numbers : double(64 bit) and float (32 bit)
    //  # Characters : char
    //  # Boolean : boulean


    public static void main( String[] args) {

        byte b1 = 23;
        byte b2 = -18;
        System.out.println("############# " + Byte.TYPE +" #############");
        System.out.println("Size  = "+ Byte.SIZE + "bits");
        System.out.println("Max value = "+ Byte.MAX_VALUE);
        System.out.println("Min value = "+ Byte.MIN_VALUE);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        short s1 = 244;
        short s2 = -334;
        System.out.println("############# " + Short.TYPE +" #############");
        System.out.println("Size  = "+ Short.SIZE + "bits");
        System.out.println("Max value = "+ Short.MAX_VALUE);
        System.out.println("Min value = "+ Short.MIN_VALUE);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        int i1 = 3555;
        int i2 = -434534;
        System.out.println("############# " + Integer.TYPE +" #############");
        System.out.println("Size  = "+ Integer.SIZE + "bits");
        System.out.println("Max value = "+ Integer.MAX_VALUE);
        System.out.println("Min value = "+ Integer.MIN_VALUE);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        long l1 = 345345345;
        long l2 = -45453453;
        System.out.println("############# " + Long.TYPE + " #############");
        System.out.println("Size  = "+ Long.SIZE + "bits");
        System.out.println("Max value = "+ Long.MAX_VALUE);
        System.out.println("Min value = "+ Long.MIN_VALUE);
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        float f1 = 3444.33F;
        float f2 = -3344.33F;
        System.out.println("############# " + Float.TYPE +" #############");
        System.out.println("Size  = "+ Float.SIZE + "bits");
        System.out.println("Max value = "+ Float.MAX_VALUE);
        System.out.println("Min value = "+ Float.MIN_VALUE);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        double d1 = 9444344.332;
        double d2 = -4456546.78978;
        System.out.println("############# " + Double.TYPE +" #############");
        System.out.println("Size  = "+ Double.SIZE + "bits");
        System.out.println("Max value = "+ Double.MAX_VALUE);
        System.out.println("Min value = "+ Double.MIN_VALUE);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        char c1 = 88;
        char c2 = 'Y';
        System.out.println("############# " + Character.TYPE +" #############");
        System.out.println("Size  = "+ Character.SIZE + "bits");
        System.out.println("Max value = "+ Character.MAX_VALUE);
        System.out.println("Min value = "+ Character.MIN_VALUE);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        boolean bl1 = true;
        boolean bl2 = false;
        System.out.println("############# " + Boolean.TYPE +" #############");
        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);


    }
}
