/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class AutoCommand extends CommandBase {
  /**
   * Creates a new AutoCommand.
   */
  double left;
  double right;
  public AutoCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectDrivingSubsystem);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double lErrorI = 0;
    double lDistanceTravelled = -((Robot.objectDrivingSubsystem.leftEncoder.getSelectedSensorPosition() / Constants.oneRotation) * (Math.PI * Constants.wheelDiameter));
    double lError = Constants.setpoint - lDistanceTravelled;
    lErrorI += lError;
    lErrorI *= .95;
    double lOutput = Constants.kP * lError + (Constants.kI * lErrorI);
    
    // Right
    double rErrorI = 0;
    double rDistanceTravelled = (Robot.objectDrivingSubsystem.rightEncoder.getSelectedSensorPosition() / Constants.oneRotation) * (Math.PI * Constants.wheelDiameter);
    double rError = Constants.setpoint - rDistanceTravelled;
    rErrorI += rError;
    rErrorI *= .95;
    double rOutput = Constants.kP * rError + (Constants.kI * rErrorI);
    
      
    Robot.objectDrivingSubsystem.teleopDrive(lOutput, rOutput);
    System.out.println("Left output: " + lOutput + ", Right output: " + rOutput);

    SmartDashboard.putNumber("lOutput", lOutput);
    SmartDashboard.putNumber("l-dT", lDistanceTravelled);
    SmartDashboard.putNumber("l-error", lError);

    SmartDashboard.putNumber("rOutput", rOutput);
    SmartDashboard.putNumber("r-dT", rDistanceTravelled);
    SmartDashboard.putNumber("r-error", rError);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
