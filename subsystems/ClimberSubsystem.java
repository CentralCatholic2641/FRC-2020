/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

//import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
//import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSubsystem extends SubsystemBase {
  /**
   * Creates a new ClimberSubsystem.
   */

  public WPI_TalonSRX wheelMotor = new WPI_TalonSRX(Constants.wheelMotor);
  public WPI_TalonSRX winchMotor = new WPI_TalonSRX(Constants.winchMotor);
  //public DoubleSolenoid climberPiston = new DoubleSolenoid(Constants.climberPneumaticPort1, Constants.climberPneumaticPort2);

  public ClimberSubsystem() {

  }

  public void RetractClimber() {
    //climberPiston.set(Value.kReverse);
    //winchMotor.set(.5);
  }

  public void ExtendClimber() {
    //climberPiston.set(Value.kForward);
  }

  public void StartWheel(float direction) {
    wheelMotor.set(direction);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
