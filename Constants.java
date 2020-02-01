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


    // Gamepad controller
    public static int gamepad1Port = 0;
    public static int joystickPort = 1;
    public static int joystickPort2 = 5;
    public static int xButtonPort = 1;
    public static int yButtonPort = 6;
    public static int zButtonPort = 2;
    public static int sButtonPort = 3;
 
    // PID constants

    public static double kP = 0;
    public static double kI = 0;
    public static double kD = 0;
    public static double kF = 0;

    // Encoder

    public static int leftEncoder = 4;
    public static int rightEncoder = 2;

}
