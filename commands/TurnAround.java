/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class TurnAround extends CommandBase {
  /**
   * Creates a new TurnAround.
   */
  double desiredAngle;

  public TurnAround(double angle) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectDrivingSubsystem);
    desiredAngle = angle;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.objectDrivingSubsystem.ahrs.zeroYaw();
    System.out.println(Robot.objectDrivingSubsystem.ahrs.getYaw());
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double current = Robot.objectDrivingSubsystem.ahrs.getYaw();
    System.out.println(current);
    if (current < desiredAngle) {
      Robot.objectDrivingSubsystem.teleopDrive(-.4, .4);
    } else {
      end(true);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.objectDrivingSubsystem.teleopDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
