package org.usfirst.frc.team219.robot.commands;

import org.usfirst.frc.team219.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopMotor extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.motor);
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.motor.stopMotor();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
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
