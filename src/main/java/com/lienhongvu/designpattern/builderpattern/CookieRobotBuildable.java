package com.lienhongvu.designpattern.builderpattern;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by hvlien on 10/23/2017.
 */
public class CookieRobotBuildable implements RobotBuildable {

    ArrayList<Integer> actions;

    @Override
    public void go() {
        Iterator iterator = actions.iterator();
        while(iterator.hasNext()){
            switch ((Integer) iterator.next()){
                case 1: start(); break;
                case 2: getParts(); break;
                case 3: assemble(); break;
                case 4: test(); break;
                case 5: stop(); break;
            }
        }
    }

    private void start() {

    }

    private void test() {

    }

    private void assemble() {

    }

    private void stop() {

    }

    private void getParts() {

    }

    public void loadActions(ArrayList a){
        actions = a;
    }


}
