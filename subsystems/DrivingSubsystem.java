/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.DriveCommand;

public class DrivingSubsystem extends SubsystemBase {
  
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
  //CANNOT HAVE MULTIPLE DIFFERENTIAL DRIVES
  DifferentialDrive oDrive = new DifferentialDrive(leftGroup, rightGroup);


  public DrivingSubsystem() {
    
  }

  public void teleopDrive(double yMove1, double yMove2) {
    //Configures the groups of motors to work with tank drive
    //these are the method parameters
    //tankDrive(double leftSPeed, double rightSpeed, boolean squaredInputs)
    //The squared inputs will make the robbot less sensitive at low speeds so you don't get that jolt of acceleration
    oDrive.tankDrive(yMove1, yMove2, true);
  }

  @Override
  public void periodic() {
    // This defualt command calls a new DriveCommand when the scheduler exits teleop drive 
    // THIS ALLOWS TELE-OP DRIVE TO WORK, DO NOT DELETE THIS
    setDefaultCommand(new DriveCommand());
  }
}
