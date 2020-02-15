/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import frc.robot.Constants;

public class TurnToAngleSubsystem extends PIDSubsystem {
 
   //Declares left motors 
   public WPI_TalonSRX leftMotor1 = new WPI_TalonSRX(Constants.leftMotor1);
   public WPI_TalonSRX leftMotor2 = new WPI_TalonSRX(Constants.leftMotor2);
   public WPI_TalonSRX leftMotor3 = new WPI_TalonSRX(Constants.leftMotor3);
   
   //Groups the left motors together
   public SpeedControllerGroup leftGroup = new SpeedControllerGroup(leftMotor1, leftMotor2, leftMotor3);
 
   //Delcares right motors
   public WPI_TalonSRX rightMotor1 = new WPI_TalonSRX(Constants.rightMotor1);
   public WPI_TalonSRX rightMotor2 = new WPI_TalonSRX(Constants.rightMotor2);
   public WPI_TalonSRX rightMotor3 = new WPI_TalonSRX(Constants.rightMotor3);
 
   //Encoder Motor Controller
 
   public WPI_TalonSRX leftEncoder = new WPI_TalonSRX(Constants.leftEncoder);
   public WPI_TalonSRX rightEncoder = new WPI_TalonSRX(Constants.rightEncoder);
   
   //Groups the right motors together
   public SpeedControllerGroup rightGroup = new SpeedControllerGroup(rightMotor1, rightMotor2, rightMotor3);
 
   //Combines the left and right groups of motors
   DifferentialDrive oDrive = new DifferentialDrive(leftGroup, rightGroup);

    //Defines the NavX
    public final AHRS ahrs;
  
  public TurnToAngleSubsystem() {
    super(new PIDController(Constants.kP, Constants.kI, Constants.kD));
        ahrs= new AHRS();
        
    
  }
    
  


  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
  }





  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return 0;
  }
}
