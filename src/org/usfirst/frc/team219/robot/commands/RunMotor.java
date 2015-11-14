package org.usfirst.frc.team219.robot.commands;



import org.usfirst.frc.team219.robot.Robot;
import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class RunMotor extends Command {
	
	public RunMotor(){
		requires(Robot.motor);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.motor.controlMotor();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
