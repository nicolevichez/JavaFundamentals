package com.fundamentals.java;
/*
*This class is the starting class of this project
* This is example of a multi-line comment.
* */
public class Main {

    public static void main(String[] args) {
         lesson5Examples();
    }

    public static void lesson5Examples(){
     Lesson5 myLesson5 = new Lesson5();
     myLesson5.showLocalExample();
     myLesson5.showLocalWithParameter(10,12);
     int example = myLesson5.showLocalWithReturn(15,8);
     System.out.println(example);
     myLesson5.showInstanceVariable();
     myLesson5.showConversion();
    }

    public static void houseExample() {
        //System.out.println("Welcome to java");
        House myHouse = new House();
        myHouse.doorOpenClose();

    }
}

