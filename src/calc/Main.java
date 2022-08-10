package calc;

import java.util.Scanner;

public class Main {
    //Main    initial class attributes
    int age = 10;
    String name;

    // creates a class constructor for the main class (called when object is created)
    public Main(int newage){ // constructor must match class name and cannot have return type like void
        age = newage;
        name = "Mahi";
    }






    static void myStaticMethod(){  //Static Method
        System.out.println("This is a static method");
    }

    public void myPublicMethod(){ //Public Method
        System.out.println("This is a public method");
    }




    public static void main(String args[]){ //where main code is called

        Main myObj = new Main(20); //creating object here -class constructor also called

        myStaticMethod(); //can call static methods directly

        myObj.myPublicMethod(); //call public method on the object

        myObj.name = "Boris"; //modifying instance attribute

        System.out.println("Name : " + myObj.name);
        System.out.println("Age  : " + myObj.age);





    }




}
