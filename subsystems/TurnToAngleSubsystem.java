/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.TalonFXSensorCollection;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import frc.robot.Constants;
import frc.robot.Robot;

public class TurnToAngleSubsystem extends PIDSubsystem {
  /**
   * Creates a new TurnToAngleSubsystem.
   */  

  public TurnToAngleSubsystem() {
    super(new PIDController(Constants.kP, Constants.kI, Constants.kD));
    getController().setTolerance(Constants.percentTolerance);
  }

  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return Robot.objectDrivingSubsystem.rightMotor2.getSelectedSensorPosition();
  }

  public boolean atSetPoint() {
    return m_controller.atSetpoint();
  }

  public void stopMotors () {
    Robot.objectDrivingSubsystem.teleopDrive(0, 0);
  }

}
