/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SpinningSubsystem extends SubsystemBase {
  /**
   * Creates a new spinningSubsystem.
   */
  public WPI_TalonSRX spinningMotor = new WPI_TalonSRX(Constants.spinningMotor);


  public DoubleSolenoid spinngingPiston = new DoubleSolenoid(Constants.spinnerPnuematicPort1, Constants.spinnerPnuematicPort2);
  public SpinningSubsystem() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  public void extendSpinnerMotor(){
    spinngingPiston.set(Value.kForward);
  }

  public void retractSpinnerMotor(){
    spinngingPiston.set(Value.kReverse);
  }

  public void DriveSpinningMotor(double speed){
    spinningMotor.set(speed);
  }
  
}
