/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class DriveCommand extends CommandBase {
  /**
   * Creates a new DriveCommand.
   */
  //AHRS ahrs;
  double variableTime;
  double variableSpeed;
  public DriveCommand() {
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
    // Gets raw axis from each joystick and multiplies it by a constant
    double y_stick1 = - .75 * Robot.objectRobotContainer.gamepad1.getRawAxis(Constants.joystickPort);
    double y_stick2 = - .75 * Robot.objectRobotContainer.gamepad1.getRawAxis(Constants.joystickPort2);
    
    SmartDashboard.putNumber("Left Encoder Value is: ", Robot.objectDrivingSubsystem.leftEncoder.getSelectedSensorPosition());
    SmartDashboard.putNumber("Right Encoder Value is: ", Robot.objectDrivingSubsystem.rightEncoder.getSelectedSensorPosition());
    //ahrs = new AHRS();
    //SmartDashboard.putNumber("Yaw Axis is: ", ahrs.getAngle());
    
    // passes the stick values into teleopdrive
    Robot.objectDrivingSubsystem.teleopDrive(y_stick1, y_stick2);
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
