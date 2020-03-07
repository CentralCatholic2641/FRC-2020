/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class TurnAround extends CommandBase {
  /**
   * Creates a new TurnAround.
   */
  AHRS ahrs;
  double desiredAngle;

  public TurnAround(double angle) {
    // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(Robot.objectDrivingSubsystem);
      desiredAngle = angle;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("This is getting called part 2");
    ahrs = new AHRS();
    ahrs.zeroYaw();
    System.out.println(ahrs.getYaw());
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double current  = ahrs.getYaw();
    while (current < desiredAngle){
      Robot.objectDrivingSubsystem.teleopDrive(-.25, .25);
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
