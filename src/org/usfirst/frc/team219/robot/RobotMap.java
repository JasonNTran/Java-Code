package org.usfirst.frc.team219.robot;

import edu.wpi.first.wpilibj.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	
	/*
	 *drive train for puppies tank drive
	 *
	 */
	public final static int MOTOR_PORT_FL = 27;
	public final static int MOTOR_PORT_BL = 28;
	public final static int MOTOR_PORT_FR = 29;
	public final static int MOTOR_PORT_BR = 30;
	public static CANTalon motor_FrontLeft;
	public static CANTalon motor_FrontRight;
	public static CANTalon motor_BackLeft;
	public static CANTalon motor_BackRight;
	public static RobotDrive driveTrain;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinsderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static void init()
	{
		motor_FrontLeft = new CANTalon(MOTOR_PORT_FL);
		motor_FrontRight = new CANTalon(MOTOR_PORT_FR);
		motor_BackLeft = new CANTalon(MOTOR_PORT_BL);
		motor_BackRight = new CANTalon(MOTOR_PORT_BR);
		driveTrain(motor_FrontLeft, motor_BackLeft, motor_FrontRight, motor_BackRight);
		
	}
}

