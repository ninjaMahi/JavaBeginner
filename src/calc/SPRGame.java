package calc;
import java.util.*;
public class SPRGame {



    static int myRandomNum() {
        int randomNum = (int) (Math.random() * 3);// create and return a random num between 0 and 2
        return randomNum;
    }


    static void greeting() { //introduction to game
        System.out.println("Welcome get ready to play rock paper scissors against the computer");
    }

    static void stateChoice(int randomNum, String player) {
        //array of choices in rps
        String[] choicesRps = {"scissors", "paper", "rock"};

        System.out.println(player + " chose " + choicesRps[randomNum]);//print the choice
    }

    //test get input

    static int getUserChoice (){
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter scissors (0)  paper (1) rock(2) : ");
        String str= sc.nextLine();              //reads string
        return Integer.parseInt(str);
    }




    public static void main(String[] args) {
        greeting();


        //set both user and computer to a num between 0 and 2
        int p1choice = getUserChoice();
        int p2choice = myRandomNum();

        //print the option chosen by both computer and user
        stateChoice(p1choice, "p1");
        stateChoice(p2choice, "p2");

        // Call function to determine whether player 1 wins/loses/draws
        GameStatusEnum p1wins = checkP1Wins(p1choice, p2choice);

        //
        String endingMessage = "";

        switch (p1wins){
            case LOSE:
                endingMessage = "LOSE";
                break;
            case WIN:
                endingMessage = "WIN";
                break;
            case DRAW:
                endingMessage = "DRAW";
                break;
        }
        System.out.println("P1 " + endingMessage);



    }

    // <access> <static or not> <return value>

    public static GameStatusEnum checkP1Wins(int p1Choice, int p2Choice) {

        /*
        check all scenarios where p1  wins
        p1choice        p2choice

        0 scissors      1 paper
        1 paper         2 rock
        2 rock          0 scissors
         */
        if ((p1Choice == p2Choice - 1) || (p1Choice == p2Choice + 2)) {

            return GameStatusEnum.WIN;
        }

        //check all scenarios where p1 loses
        else if ((p2Choice == p1Choice - 1) || (p2Choice == p1Choice + 2)) {

            return GameStatusEnum.LOSE;
        }
        //check all scenarios where p1 draws
        else {

            return GameStatusEnum.DRAW;
        }
    }

}
