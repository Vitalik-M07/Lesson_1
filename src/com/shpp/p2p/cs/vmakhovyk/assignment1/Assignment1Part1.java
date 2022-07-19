package com.shpp.p2p.cs.vmakhovyk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {


    public void run() throws Exception {
        pickUpANewspaper();


    }

    private void pickUpANewspaper() throws Exception {
        turnRight();//Karel  turns right,

        move();//changes line and turns east
        turnLeft();

        fourStepsForward();//takes 4 steps forward

        pickBeeper();//picks up the beeper
        turnAround();//unfolds
        fourStepsForward();//takes 4 steps forward

        turnRight();//takes the initial position
        move();
        turnRight();
    }

    private void fourStepsForward() throws Exception {
        for (int i = 0; i < 4; i++) {//takes 4 steps forward
            move();
        }

    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }


}









