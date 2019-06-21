package com.fundamentals.java;
/*
* The contents of this class is for the lesson 6 slidedeck.
* Strings & More
* */

public class lesson6 {

    String myString = "LaMars";

    // Method shows string method for charAt
    public void exampleCharAt(){
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    }

    // Method shows concatenation of two strings
    public void exampleConcat(String value){
        String happy = myString.concat(value);// myString = LaMars
        System.out.println(happy);
    }
   // Method compares two string to see if they are equal

    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    }

    //Method compares two string and converts it to uppercase
    public String exampleLowercase(){
    return myString.toLowerCase();
    }

    //Method takes a string and converts it to uppercase
    public String exampleUppercase(){
    return myString.toUpperCase();
    }

    //Method determines the length of a string
    public void exampleLength(){
    int length = myString.length();
    System.out.println(length);
    }

    //Example of how to use the StringBuilder class
    public void exampleBuilder(String food, int value){
    StringBuilder build = new StringBuilder();
    build.append("My favorite food is");
    build.append(food).append("and i ate")
            .append(value).append("plates of it.");
    String fav = build.toString();
    System.out.println(fav);
    }

    //Method for showing the char data type
    public void exampleChar(){
        char c1 = 't';//\u0074
        char c2 = '\u00A7';
        System.out.println(c2);
    }

    //Method demonstration escape sequences
    public void exampleEscape(){
    System.out.println("That\'s a cool toy.\tCan I\n play with it.");
    }
    }

