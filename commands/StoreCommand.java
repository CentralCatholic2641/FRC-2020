/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class StoreCommand extends CommandBase {

  public StoreCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectStoreSubsystem);

  }

  @Override
  public void initialize() {

  }

  // Drives the conveyor motor
  @Override
  public void execute() {
    Robot.objectStoreSubsystem.DriveStoreMotor(-0.85);
  }

  // Sets the conveyor motor to zero when the button is released
  @Override
  public void end(boolean interrupted) {
    Robot.objectStoreSubsystem.DriveStoreMotor(0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
