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
    super(
      // The PIDController used by the subsystem
      new PIDController(Constants.kP, Constants.kI, Constants.kD)
    );
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
}
