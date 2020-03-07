/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SpinningSubsystem extends SubsystemBase {
  

  //New spinning motor, spinning piston, and a new color sensor 
  public WPI_TalonSRX spinningMotor = new WPI_TalonSRX(Constants.spinningMotor);
  public DoubleSolenoid spinngingPiston = new DoubleSolenoid(Constants.spinnerPnuematicPort1, Constants.spinnerPnuematicPort2);
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
  private final ColorMatch m_colorMatcher = new ColorMatch();


  private final Color kBlueTarget = ColorMatch.makeColor(.143, .427, .429);
  private final Color kGreenTarget = ColorMatch.makeColor(.197, .561, .240);
  private final Color kRedTarget = ColorMatch.makeColor(.561, .232, .114);
  private final Color kYellowTarget = ColorMatch.makeColor(.361, .524, .113);


  //Reads the color sensor values and prints them to the terminal
  public void readColorSensor(){
    Color detectedColor = m_colorSensor.getColor();
    String colorString;
    //String convertedColor = detectedColor.toString();

  
    m_colorMatcher.addColorMatch(kBlueTarget);
    m_colorMatcher.addColorMatch(kGreenTarget);
    m_colorMatcher.addColorMatch(kRedTarget);
    m_colorMatcher.addColorMatch(kYellowTarget);

    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    if (match.color == kBlueTarget){
      colorString = "Blue";
    } else if (match.color == kRedTarget) {
      colorString = "Red";
    } else if (match.color == kGreenTarget) {
      colorString = "Green";
    } else if (match.color == kYellowTarget) {
      colorString = "Yellow";
    } else {
      colorString = "Unknown";
    }

    SmartDashboard.putNumber("Red", detectedColor.red);
    SmartDashboard.putNumber("Green", detectedColor.green);
    SmartDashboard.putNumber("Blue", detectedColor.blue);
    SmartDashboard.putNumber("Confidence", match.confidence);
    SmartDashboard.putString("Detected Color", colorString);

  
    //Color rgbColor = hex2Rgb(detectedColor.toString());
    //System.out.println("Detected: " + detectedColor);
    //System.out.println("Converted Color: " + convertedColor);
    //System.out.println("RGB: " + rgbColor);
  }

  //public static Color hex2Rgb(String colorStr) {
    //This takes a string, If it is hexidemal it will parse the string
    //The number will be converted to an integer by dividing by 16
    //return new Color(
            //Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
            //Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
            //Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
  //}

  public SpinningSubsystem() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  //Extends the spinning motor
  public void extendSpinnerMotor(){
   spinngingPiston.set(Value.kForward);
  }

  //Retracts the spinning motor
  public void retractSpinnerMotor(){
   spinngingPiston.set(Value.kReverse);
  }

  //Sets the spinning motor to a specific speed
  public void DriveSpinningMotor(double speed){
    spinningMotor.set(speed);
  }
  
}
