package com.lienhongvu.designpattern.builderpattern;

/**
 * Created by hvlien on 10/20/2017.
 */
public interface RobotBuilder {

    void addStart();
    void addGetParts();
    void addAssemble();
    void addTest();
    void addStop();
    RobotBuildable getRobot();
}
