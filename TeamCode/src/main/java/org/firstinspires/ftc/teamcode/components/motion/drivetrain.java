package org.firstinspires.ftc.teamcode.components.motion;

import org.firstinspires.ftc.teamcode.robot.robot;
import org.openftc.revextensions2.ExpansionHubMotor;

import org.firstinspires.ftc.teamcode.robot.subSystem;

/**
 * Created by Evan McLoughlin on 12/23/2019.
 */
public class drivetrain extends subSystem{

    /**
     * Each motor is numbered so that it corresponds to the quadrant
     * of the coordinate plane in which it resides. The front and right
     * of the robot are considered positive Y and positive X, respectively.
     * i.e. driveMotor 2 corresponds to the front-left motor
     */
    public ExpansionHubMotor rightFront, leftFront, leftBack, rightBack;


    public drivetrain(robot robotName){
        super(robotName);
    }

    @Override
    public void init(){
        mapComponents();
    }

    @Override
    public void mapComponents() {
        this.rightFront = (ExpansionHubMotor) hardwareMap.dcMotor.get("right front");
        this.leftFront = (ExpansionHubMotor) hardwareMap.dcMotor.get("left front");
        this.leftBack = (ExpansionHubMotor) hardwareMap.dcMotor.get("left back");
        this.rightBack = (ExpansionHubMotor) hardwareMap.dcMotor.get("right back");
    }



    @Override
    public void stop() {

    }


}
