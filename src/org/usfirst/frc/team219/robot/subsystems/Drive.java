package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;
import org.usfirst.frc.team219.robot.commands.RunMotor;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem
{
	CANTalon motorFL = RobotMap.motor_FrontLeft;
	CANTalon motorBL = RobotMap.motor_BackLeft;
	CANTalon motorFR = RobotMap.motor_FrontRight;
	CANTalon motorBR = RobotMap.motor_BackRight;
	
	RobotDrive robotDrive;
	
	//This command is run once during instantiation in the Robot.java file.  
	//It defaultly runs the command to run the motors.
	//It also creates a drivetrain
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new RunMotor());
		robotDrive = RobotMap.driveTrain;
	}
	
	
	/*
	 * 
	 * This is for the getRawAxis for the xbox 360 controller.  for example the code
	 * double joystickY_Left = joystick.getRawAxis(2); 
	 * should theoretically return the value of the left joystick Y axis tilt.
	 * 
	 * Axis indexes:
		1 - LeftX
		2 - LeftY
		3 - Triggers (Each trigger = 0 to 1, axis value = right - left)
		4 - RightX
		5 - RightY
		6 - DPad Left/Right
	 */
	public void controlMotor(Joystick joystick)
	{
		double joystickY_Left = joystick.getRawAxis(2);
		double joystickY_Right = joystick.getRawAxis(5);
		if(Math.abs(joystickY_Left) <= .2)
		{
			joystickY_Left = 0;
		}
		if(Math.abs(joystickY_Right)<= .2)
		{
			joystickY_Right = 0;
		}
		robotDrive.tankDrive(joystickY_Left, joystickY_Right);
		
	}
	
	public void stop()
	{
		robotDrive.stopMotor();
	}
	

}
