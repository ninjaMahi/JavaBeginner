package calc;

import java.util.Scanner;

//encapsulation - use private variable name
//use get and set methods to change variable makes it easier to control data
public class person {

    private String password = "";


    public String getPassword(){ //get the private variable
        return password;
    }

    public void setPassword(String newPassword){ // change private variable
        this.password = newPassword;
    }






    public String getInput(String prompt){

        Scanner myObj = new Scanner(System.in);//create object of scanner class to use available features
        System.out.println("please enter " + prompt + " : ");

        return myObj.nextLine(); //return user next line input

    }

    public Boolean checkIsEmpty(String data){
        return data == "";
    }




    public static void main (String args[]){

    }


}