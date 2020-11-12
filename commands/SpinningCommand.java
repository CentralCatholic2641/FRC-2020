/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class SpinningCommand extends CommandBase {

  public SpinningCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectSpinningSubsystem);
  }

  // Extends the spinning motor
  @Override
  public void initialize() {
    Robot.objectSpinningSubsystem.extendSpinnerMotor();
  }

  // Drives the spinning motor and reads the color sensor for values
  @Override
  public void execute() {
    Robot.objectSpinningSubsystem.readColorSensor();
    Robot.objectSpinningSubsystem.DriveSpinningMotor(.25);
  }

  // Sets the spinning motor to zero and retracts the motor when the button is
  // released
  @Override
  public void end(boolean interrupted) {
    Robot.objectSpinningSubsystem.retractSpinnerMotor();
    Robot.objectSpinningSubsystem.DriveSpinningMotor(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
