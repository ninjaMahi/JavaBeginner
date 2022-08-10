package calc;
//import java.util.Scanner;

public class changePerson {
    public static void main (String[] args){
        person myObj = new person();


        while (myObj.checkIsEmpty(myObj.getPassword())) { // if password is empty == true
            System.out.println(myObj.checkIsEmpty(myObj.getPassword()));
            String userInput = myObj.getInput("Password");
            myObj.setPassword(userInput);


        }
        //error if directly change variables
        System.out.println(myObj.getPassword());


    }
}
