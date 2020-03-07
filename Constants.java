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

    // Talon Configuration
	public static int leftMotor1 = 1;
    public static int leftMotor2 = 2;
    public static int leftMotor3 = 3;
    public static int rightMotor1 = 4;
    public static int rightMotor2 = 5;
    public static int rightMotor3 = 6;


    // Intake motor port
    public static int intakeMotor = 8;

    //Compressor port
    public static int compressorPort = 0;

    //Intake speed
    public static double intakeSpeed = -0.35;
    public static double shooterSpeed = 0.35;
    public static double fastShooter = 0.80;
    public static double StoreSpeed = 0.35;
    public static double fastStore = 0.80;


    // Conveyor motor port
    public static int storeMotor = 9;

    
    // Shooter motor port
    public static int shooterMotor = 7;


    // Climber motor ports
    public static int winchMotor = 10;
    public static int wheelMotor = 12;

    //Spinning motor port

    public static int spinningMotor = 8;
    

    // Gamepad1 controller
    public static int gamepad1Port = 0;
    public static int joystickPort = 1; // left joystick
    public static int joystickPort2 = 5; // right joystick
    
    //It would be helpful to map out the buttons like this and then
    //just set the rest using these button names
    //That way when people are adjusting buttons, it is easier
    //... add whatever to this
    /*
    a=;
    x=;
    y=;
    b=;
    l_1 = ;
    l_2 = ;
    r_1 = ;
    r_2 = ;
    left_dpad = ;
    right_dpad = ;
    up_dpad = ;
    down_dpad = ;

    */

    
    // Gamepad2 controller - Please Comment which port is which
    public static int gamepad2Port = 1;
    public static int shooterButtonPort = 3; // 
    public static int storeButtonPort = 2; //  
    public static int wheelLeftClimberButtonPort = 0; // 
    public static int wheelRightClimberButtonPort = 0; // 
    public static int spinnerButtonPort = 0;
    public static int pistonIntakeExtendPort = 0;
    public static int pistonIntakeRetractPort = 0;
    public static int intakeButtonPort = 1;
    

    // Pneumatic ports
    public static int climberPneumaticPort1 = 2;
    public static int climberPneumaticPort2 = 3;
    public static int spinnerPnuematicPort1 = 0;
    public static int spinnerPnuematicPort2 = 1;
    public static int intakePneumaticPort1 = 0;
    public static int intakePneumaticPort2= 0;
    

    // PID constants
    public static double kP = 0.1;
    public static double kI = 0.5;
    public static double kD = 0;
    public static double kF = 0;
    public static double wheelDiameter = 0.5;
    public static int percentTolerance = 15;
    public static double oneRotation = 4096;
    


    // Encoder
    public static int leftEncoder = 1;
    public static int rightEncoder = 4;

    
    //Camera Port
    public static int camera = 0;
}
