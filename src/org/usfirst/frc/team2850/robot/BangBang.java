package org.usfirst.frc.team2850.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class BangBang {
Spark shooter;
Encoder shooterEncoder;
int targetRpm;
	
	public BangBang(Spark motor, Encoder Enc,int targetRpm)
	{
		shooter = motor;
		shooterEncoder = Enc;
		this.targetRpm = targetRpm;
	}
	
	public void runBangBang()
	{
		if(targetRpm < shooterEncoder.getRate())
		{
			shooter.set(1);
			SmartDashboard.putNumber("Speed", shooterEncoder.getRate());
			SmartDashboard.putNumber("Amps", Definitions.pdp.getCurrent(2));
			System.out.println(Definitions.pdp.getCurrent(2)+ " " +shooterEncoder.getRate());
		}
		else{
			shooter.set(0);
		}
		
	}
	
}
