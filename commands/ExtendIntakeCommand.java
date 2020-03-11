/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ExtendIntakeCommand extends CommandBase {
  
  public ExtendIntakeCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectIntakeSubsystem);
  }

  
  @Override
  public void initialize() {
  }

  // Extends the intake
  @Override
  public void execute() {
    Robot.objectIntakeSubsystem.extendIntake();
  }

  @Override
  public void end(boolean interrupted) {
  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}
