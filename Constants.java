/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // for timed Robot
    public static double moveUntilSeconds = .85;
    public static double moveWithSpeed = .75;


    // Talon Configuration
	public static int leftMotor1 = 4;
    public static int leftMotor2 = 5;
    public static int leftMotor3 = 6;
    public static int rightMotor1 = 1;
    public static int rightMotor2 = 2;
    public static int rightMotor3 = 3;


    // Intake motor port
    public static int intakeMotor = 7;


    // Store motor port
    public static int storeMotor = 8;

    
    // Shooter motor port
    public static int shooterMotor = 9;


    // Climber motor ports
    public static int winchMotor = 0;
    public static int wheelMotor = 0;

    //Spinning motor port

    public static int spinningMotor = 0;
    

    // Gamepad1 controller
    public static int gamepad1Port = 0;
    public static int joystickPort = 1; // left joystick
    public static int joystickPort2 = 5; // right joystick
    public static int addNextButtonPort = 1; // X button
    public static int spinnerButton = 0;
    
    
    // Gamepad2 controller
    public static int gamepad2Port = 1;
    public static int shooterButtonPort = 3; // right trigger
    public static int intakeButtonPort = 6; // Y button
    public static int storeButtonPort = 2; // Z button
    public static int retractClimberButtonPort = 1; // A button
    public static int extendClimberButtonPort = 4; // Y button
    public static int wheelLeftClimberButtonPort = 2; // left trigger
    public static int wheelRightClimberButtonPort = 3; // right trigger
    

    // Pneumatic ports
    public static int climberPneumaticPort1 = 0;
    public static int climberPneumaticPort2 = 0;
    public static int spinnerPnuematicPort1 = 0;
    public static int spinnerPnuematicPort2 = 0;
    

    // PID constants
    public static double kP = 0;
    public static double kI = 0;
    public static double kD = 0;
    public static double kF = 0;
    public static int wheelDiameter = 6;
    public static int percentTolerance = 15;


    // Encoder
    public static int leftEncoder = 4;
    public static int rightEncoder = 2;

}
