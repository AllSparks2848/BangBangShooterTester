package org.usfirst.frc.team2850.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
	
	@Override
	public void robotInit() {
	Definitions.initPerf();
	}

	@Override
	public void autonomousInit() {
		
	}

	@Override
	public void autonomousPeriodic() {
		
	}

	
	@Override
	public void teleopPeriodic() {
		if(Definitions.xbox1.getRawButton(1))//A Buttton
		{
			Definitions.bang.runBangBang();
		}
		else
		{
			Definitions.shooter.set(0);
		}
	}

	
	@Override
	public void testPeriodic() {
	}
}

