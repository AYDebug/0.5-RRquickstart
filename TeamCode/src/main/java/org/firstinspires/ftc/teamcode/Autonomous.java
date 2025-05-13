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

}
