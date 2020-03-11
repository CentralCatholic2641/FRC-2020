/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Robot;

public class TimeCommand extends CommandBase {
  
  // Declares a speed and time variable
  double variableSpeed;
  double variableTime;
  
  // Creates a new timer named localTimer based off the timer class
  private final Timer localTimer = new Timer();


  public TimeCommand(double time, double speed) {
    // Initializes the time and speed variables
    variableTime = time;
    variableSpeed = speed;
    
    // Adds the driving subsystem
    addRequirements(Robot.objectDrivingSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Starts the timer
    localTimer.start();
  }

  @Override
  public void execute() {
    // Passes the speed variable into teleopDrive to make the robot move
    //Robot.objectDrivingSubsystem.teleopDrive(variableSpeed,variableSpeed);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // This is executed when the timer has expired. It tells teleopDrive to cut all power to the motors
    //Robot.objectDrivingSubsystem.teleopDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // Checks to see if the timer is greater than the time allowed, if it is then the motors are stopped
    if (localTimer.get() > variableTime){
      return true;
    }
    else {
      return false;
    }
  }
}
