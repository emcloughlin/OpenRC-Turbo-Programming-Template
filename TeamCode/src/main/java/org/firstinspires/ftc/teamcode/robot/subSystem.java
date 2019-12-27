package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by Evan McLoughlin on 12/23/2019.
 */
public abstract class subSystem {

    protected robot robotName;

    protected HardwareMap hardwareMap;

    /**
     * Initialize the hardware for a subsystem i.e. map hardware, set motor directions, etc.
     */
    protected abstract void init();

    protected abstract void mapComponents();

    protected abstract void stop();

    public subSystem(robot robotName){
        this.robotName = robotName;
    }


}
