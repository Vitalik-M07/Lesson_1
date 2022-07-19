package com.shpp.p2p.cs.vmakhovyk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {

    public void run() throws Exception {
        /*
         * The logic is this:
         * we lay down at the beginning and at the end of the line and then gradually approach the center.
         * When we reach the last cell that needs to be filled,
         * we put a beeper there.
         * And in all other cells we remove*/

        putBeeper();
        if (frontIsClear()){
            move();
            if (frontIsClear()){
                searchMiddle();
                removeUnnecessary();
                moveTowardsTheMiddle();
            }
        }

    }

    private void moveTowardsTheMiddle() throws Exception {//moving towards our center
        while (noBeepersPresent()){
            move();
        }

    }

    private void removeUnnecessary() throws Exception {//removing unnecessary
        collectBeepers();//collect beepers to the edge
        turnAround();//reversal
        moveTowardsTheMiddle();
        collectBeepers();
        turnAround();

    }

    private void collectBeepers() throws Exception {//collect beepers to the edge
        while (frontIsClear()){
            move();
            pickBeeper();
        }
    }

    private void searchMiddle() throws Exception {//search for the middle
        beeperOnTheEdge();
        while (noBeepersPresent()){
            isItMiddle();
            findBeeper();}


    }

    private void isItMiddle() throws Exception {


        move();
        if(beepersPresent()){
            turnAndStep();
            putBeeper();
        }
    }

    private void findBeeper() throws Exception {
        if(noBeepersPresent()){
            while (noBeepersPresent()){
                move();
            }
            turnAndStep();
            putBeeper();
            move();

        }

    }

    private void beeperOnTheEdge() throws Exception {//put the beeper on the edge
        while(frontIsClear()){
            move();
        }
        putBeeper();
        turnAndStep();

    }

    private void turnAndStep() throws Exception {//Karel turns and steps
        turnAround();
        move();


    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

//    private void turnRight() throws Exception {
//        turnLeft();
//        turnLeft();
//        turnLeft();
//    }
}
