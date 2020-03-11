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

public class DriveCommand extends CommandBase {
  
  public DriveCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.objectDrivingSubsystem);
    
  }

  
  @Override
  public void initialize() {
    
  }


  @Override
  public void execute() {
    double joystick1 = Robot.objectRobotContainer.gamepad1.getRawAxis(Constants.joystickPort);
    double joystick2 = Robot.objectRobotContainer.gamepad1.getRawAxis(Constants.joystickPort2);
    // Gets raw axis from each joystick and multiplies it by a constant
    double y_stick1 = - .95 * joystick1;
    double y_stick2 = - .92 * joystick2;
    
    SmartDashboard.putNumber("Left Encoder Value is: ", Robot.objectDrivingSubsystem.leftEncoder.getSelectedSensorPosition());
    SmartDashboard.putNumber("Right Encoder Value is: ", Robot.objectDrivingSubsystem.rightEncoder.getSelectedSensorPosition());
   
  
    // passes the stick values into teleopdrive
    Robot.objectDrivingSubsystem.teleopDrive(y_stick1, y_stick2);
    
    //Resets the Yaw when joysticks are forward
    if (joystick1 >= 1 && joystick2 >= 1){
      Robot.objectDrivingSubsystem.ahrs.zeroYaw();
    }
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
