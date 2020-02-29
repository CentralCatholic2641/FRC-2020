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


public class IntakeCommand extends CommandBase {
  
  public IntakeCommand(){
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectIntakeSubsystem);
    
  
  }

  @Override
  public void initialize() {
  }

  // Drives the intake motor
  @Override
  public void execute() {
    Robot.objectIntakeSubsystem.DriveIntakeMotor(Constants.intakeSpeed);
    
  }

  // Sets the intake motor to zero when the button is released
  @Override
  public void end(boolean interrupted) {
    Robot.objectIntakeSubsystem.DriveIntakeMotor(0.0);
  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
