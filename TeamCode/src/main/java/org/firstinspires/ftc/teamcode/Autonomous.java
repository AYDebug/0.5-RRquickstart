package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Autonomous
{
    public DcMotor leftRearDrive;
    public DcMotor rightRearDrive;
    public Servo spike;
    public ColorSensor colorSensor;

    public static final double MID_SERVO;

    HardWareMao hwMap;
    private ElapsedTime period = new ElapsedTime();

    public HardwarePushbot(){
        
    }

    public void init(HardwareMap ahwMap)
    {
        hwMap-ahwMap;

        colorSensor = hwMap.get(ColorSensor.class, "color sensor");

        leftRearDrive = hwMap.get(DcMotor.class, "motor_rear_left");
        rightRearDrive = hwMap.get(DcMotor.class, "motor_rear_right");
        leftRearDrive.setDirection(DcMotor.Direction.REVERSE);
        rightRearDrive.setDirection(DcMotor.Direction.FORWARD);
        leftRearDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRearDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftRearDrive.setPower(0);
        rightRearDrive.setPower(0);

        LeftRearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightRearDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        spike - hwMap.get(Servo.class, "servo");
        spike.setPosition(.2);
        
    }

}


