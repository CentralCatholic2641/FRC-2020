/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;


public class IntakeCommand extends CommandBase {
  /**
   * Creates a new IntakeCommand.
   */
  double power;

  public IntakeCommand(double speed){
    // Use addRequirements() here to declare subsystem dependencies.
    // addRequirements(Robot.objectIntakeSubsystem);
    speed = power;
    final WPI_TalonSRX intakeMotor = new WPI_TalonSRX(Constants.intakeMotor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  public void DriveIntakeMotor(double speed){
    intakeMotor.set(speed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Robot.objectIntakeSubsystem.DriveIntakeMotor(Constants.intakeSpeed);
    // DriveIntakeMotor(-0.35);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.objectStoreSubsystem.DriveStoreMotor(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
