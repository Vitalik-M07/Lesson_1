package com.shpp.p2p.cs.vmakhovyk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {

    public void run() throws Exception {

        if (frontIsBlocked()) {//if the width is 1, then we run a separate algorithm
            onecolumn();
        }
        if (frontIsClear()) {
            //if the width is greater than 1, then we run a function
            // that puts the beeper through one cell starting from the first
            putThroughOneCell_1();
        }


        while (leftIsClear()) {
            turnAndStart();//move to the next line
            if (frontIsClear()) {
                //put beepers through one cell starting from the second
                putThroughOneCell_2();
            }
            if (leftIsClear()) {
                turnAndStart();//move to the next line
            }

            //puts the beeper through one cell starting from the first
            putThroughOneCell_1();
        }


    }

    private void onecolumn() throws Exception {
        turnLeft();// Karel turns left
        putBeeper();// and puts beeper
        while (frontIsClear()) {
//repeats through one cell until it reaches the wall
            move();
            move();
            putBeeper();
        }
    }

    private void turnAndStart() throws Exception {
        if (leftIsClear()) {//go to the next line
            turnLeft();
            move();

            if (leftIsClear()) {
                turnLeft();//turn around
            }

        }
        while (frontIsClear()) {//let's go to the beginning
            move();
        }

        if (leftIsClear()) {////turn around
            turnLeft();
            turnLeft();
        }

    }

    private void putThroughOneCell_2() throws Exception {
        move();//skip one cell before loop
        while (frontIsClear()) {
            if (noBeepersPresent()) {

                putBeeper();
            }


            if (frontIsClear()) {
                move();
            }


            if (frontIsClear()) {
                move();
            }
        }
        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    private void putThroughOneCell_1() throws Exception {

        while (frontIsClear()) {
            putBeeper();


            if (frontIsClear()) {
                move();
            }


            if (frontIsClear()) {
                move();
            }
        }
    }


    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
