package com.shpp.p2p.cs.vmakhovyk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {
    public void run() throws Exception {
        while (frontIsClear()) {/*If there is no wall in front,
         *then Karel builds a column.
         */
            buildColumn();

            if (frontIsClear()) {/* If there is no wall in front,
             *Karel takes 4 steps forward.
             */
                fourStepsForward();
            }
        }
        buildColumn();//If there is a wall in front,
        // Karel still builds a column

    }

    private void buildColumn() throws Exception {


        turnLeft();//Karel turn left
        while (frontIsClear()) {//  If there is no wall in front,
            move();// Karel moves towards the wall
        }
        turnAround();//unfolds
        while (frontIsClear()) {//moving towards the wall,


            if (noBeepersPresent()) {// he checks if there is a beeper,
                putBeeper();      // if not, he hangs it up

            }
            move(); // and moves on
        }
        if (noBeepersPresent()) {// he checks if there is a beeper,
            putBeeper();      // if not, he hangs it up

        }
        turnLeft();//when he reaches the wall, he turns left
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