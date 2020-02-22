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
	public static int leftMotor1 = 1;
    public static int leftMotor2 = 2;
    public static int leftMotor3 = 3;
    public static int rightMotor1 = 4;
    public static int rightMotor2 = 5;
    public static int rightMotor3 = 6;


    // Intake motor port
    public static int intakeMotor = 0;

    //Compressor port
    public static int compressorPort = 0;

    //Intake speed
<<<<<<< HEAD
    public static double intakeSpeed = -0.50;
    public static double shooterSpeed = 0.35;
    public static double StoreSpeed = 0.35;
=======
    public static double intakeSpeed = -0.35;
    public static double shooterSpeed = 0.55;
>>>>>>> parent of eb78df5... update


    // Store motor port
    public static int storeMotor = 0;

    
    // Shooter motor port
    public static int shooterMotor = 0;


    // Climber motor ports
    public static int winchMotor = 0;
    public static int wheelMotor = 0;

    //Spinning motor port

    public static int spinningMotor = 0;
    

    // Gamepad1 controller
    public static int gamepad1Port = 0;
    public static int joystickPort = 1; // left joystick
    public static int joystickPort2 = 5; // right joystick
    public static int addNextButtonPort = 0; // X button
    

    
    // Gamepad2 controller
    public static int gamepad2Port = 1;
<<<<<<< HEAD
    public static int shooterButtonPort = 4; // 
    public static int reverseShooterButtonPort = 0; //RB?
    public static int storeButtonPort = 3; // 
    public static int retractClimberButtonPort = 0; // 
    public static int extendClimberButtonPort = 0; // 
    public static int wheelLeftClimberButtonPort = 0; // 
    public static int wheelRightClimberButtonPort = 0; // 
    public static int spinnerButtonPort = 5;
    public static int pistonIntakeExtendPort = 1;
    public static int pistonIntakeRetractPort = 2;
    public static int intakeButton = 6;
=======
    public static int shooterButtonPort = 2; // right trigger
    public static int intakeButtonPort = 1; // Y button
    public static int storeButtonPort = 1; // Z button
    public static int retractClimberButtonPort = 3; // A button
    public static int extendClimberButtonPort = 4; // Y button
    public static int wheelLeftClimberButtonPort = 0; // left trigger
    public static int wheelRightClimberButtonPort = 0; // right trigger
    public static int spinnerButtonPort = 0;
>>>>>>> parent of eb78df5... update
    

    // Pneumatic ports
    public static int climberPneumaticPort1 = 0;
    public static int climberPneumaticPort2 = 0;
    public static int spinnerPnuematicPort1 = 0;
    public static int spinnerPnuematicPort2 = 1;
    public static int intakePneumaticPort1 = 3;
    public static int intakePneumaticPort2= 2;
    

    // PID constants
    public static double kP = 0.001;
    public static double kI = 0.015;
    public static double kD = 0;
    public static double kF = 0;
    public static double wheelDiameter = 0.5;
    public static int percentTolerance = 15;
    public static double oneRotation = 4098.85;
    public static double setpoint = 10.0;
    


    // Encoder
    public static int leftEncoder = 0;
    public static int rightEncoder = 0;

}
