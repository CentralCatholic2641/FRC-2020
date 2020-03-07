/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

//THIS FILE CONTAINS AUTONOMOUST CODE. AT THE TIME OF THIS COMMENT, THE PI SYSTEM IS WORKING FINE. IF YOU DO NOT KNOW WHAT YOU ARE DOING, PLEASE FOR THE LOVE OF GOD DO NOT EDIT ANYTHING IN THIS FILE
//OR ELSE...

public class AutoCommand extends CommandBase {
  //Initialize output variables 
  double lOutput;
  double rOutput;
  double lErrorI = 0;
  double rErrorI = 0;
  double lDistanceTravelled;
  double lError;
  double rDistanceTravelled;
  double rError;

    public AutoCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectDrivingSubsystem);
  }

  //Calculates values 
  @Override
  public void initialize() {
    
  }

  // Calculates and sends to teleop drive 
  @Override
  public void execute() {
    lDistanceTravelled = -((Robot.objectDrivingSubsystem.leftEncoder.getSelectedSensorPosition() / Constants.oneRotation) * (Math.PI * Constants.wheelDiameter));
    lError = Constants.setpoint - lDistanceTravelled;
    lErrorI += lError;
    lErrorI *= .95;
    lOutput = Constants.kP * lError + (Constants.kI * lErrorI);
    
    // Right
    rDistanceTravelled = (Robot.objectDrivingSubsystem.rightEncoder.getSelectedSensorPosition() / Constants.oneRotation) * (Math.PI * Constants.wheelDiameter);
    rError = Constants.setpoint - rDistanceTravelled;
    rErrorI += rError;
    rErrorI *= .95;
    rOutput = Constants.kP * rError + (Constants.kI * rErrorI);
   

    if (lOutput > 0.05 && rOutput > 0.05){
      System.out.println("Left output: " + lOutput + ", Right output: " + rOutput);
      Robot.objectDrivingSubsystem.teleopDrive(lOutput, rOutput);
    }
    else{
      System.out.println("This is getting called");
      new TurnAround();
    }
    
    //If the output is greater than 5 percent, continue doing what is was doing, is it is not, call turn left
    
  }
   
  
  @Override
  public void end(boolean interrupted) {
    new TurnAround();
  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
