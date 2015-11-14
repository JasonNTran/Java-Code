package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Motor extends Subsystem
{
	CANTalon testMotor = RobotMap.motor;
	
	public void controlMotor(){
		testMotor.set(.5);
	}
	
	public void stopMotor(){
		testMotor.set(0);
	}
	
	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
