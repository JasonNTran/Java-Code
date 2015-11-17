package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;
import org.usfirst.frc.team219.robot.commands.RunMotor;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem
{
	CANTalon testMotor = RobotMap.motor;
	
	public void controlMotor(Joystick joystick)
	{
		double joystickY = joystick.getAxis(Joystick.AxisType.kY);
		if(Math.abs(joystickY) <= .2)
		{
			joystickY = 0;
		}
		testMotor.set(joystickY);
	}
	
	public void stop()
	{
		testMotor.set(0.0);
	}
	
	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new RunMotor());
	}
	
}
