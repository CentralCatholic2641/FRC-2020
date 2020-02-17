/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Constants;
import frc.robot.Robot;


public class IntakeCommand extends CommandBase {
  /**
   * Creates a new IntakeCommand.
   */
  double variableTimeInstake;

  //Added a variable time and a new timer
  double variableTime=1.0;
  private final Timer localTimer = new Timer();

  public IntakeCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectIntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.objectIntakeSubsystem.DriveIntakeMotor(Constants.intakeSpeed);
    //Added the store motor
    Robot.objectStoreSubsystem.DriveStoreMotor(Constants.StoreSpeed);
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.objectStoreSubsystem.DriveStoreMotor(0);
    //I added this section for now in order to make it so that
    //The intake motor will continue to run a certain amount of time after the storing motor
    localTimer.start();
    if (localTimer.get() > variableTime){
      Robot.objectIntakeSubsystem.DriveIntakeMotor(0);
    }

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
