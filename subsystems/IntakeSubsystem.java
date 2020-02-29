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

public class IntakeSubsystem extends SubsystemBase {
  /**
   * Creates a new IntakeSubsystem.
   */
  
   //Intake motor
    public WPI_TalonSRX intakeMotor = new WPI_TalonSRX(Constants.intakeMotor);
    public DoubleSolenoid intakePiston = new DoubleSolenoid(Constants.intakePneumaticPort1, Constants.intakePneumaticPort2);

   public IntakeSubsystem() {

  }

  public void DriveIntakeMotor(double speed){
    intakeMotor.set(speed);
  }

  public void extendIntake(){
    intakePiston.set(Value.kForward);

  }

  public void retractIntake(){
    intakePiston.set(Value.kReverse);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
