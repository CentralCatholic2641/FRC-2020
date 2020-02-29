/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj.XboxController.Button;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.AutoCommand;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DrivingSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.SpinningSubsystem;
import frc.robot.subsystems.StoreSubsystem;
import edu.wpi.first.wpilibj.Compressor;
// import edu.wpi.cscore.CvSource;
// import edu.wpi.cscore.UsbCamera;
// import edu.wpi.cscore.VideoSource;
//import edu.wpi.first.cameraserver.CameraServer;


public class Robot extends TimedRobot {
  Command autoCommand;
  public static RobotContainer objectRobotContainer;
  public static DrivingSubsystem objectDrivingSubsystem = new DrivingSubsystem();
  public static IntakeSubsystem objectIntakeSubsystem = new IntakeSubsystem();
  public static StoreSubsystem objectStoreSubsystem = new StoreSubsystem();
  public static ShooterSubsystem objectShooterSubsystem = new ShooterSubsystem();
  public static ClimberSubsystem objectClimberSubsystem = new ClimberSubsystem();
  public static SpinningSubsystem objectSpinningSubsystem = new SpinningSubsystem();
  public static Compressor compressor = new Compressor(Constants.compressorPort);
  
  // public UsbCamera camera1;
  // public CvSource outputStream1;

  double c;
  double lDistanceTravelled;
  double lError;
  double lOutput;
  double lErrorI = 0;

  double rDistanceTravelled;
  double rError;
  double rOutput;
  double rErrorI = 0;


  @Override
  public void robotInit() {
    objectRobotContainer = new RobotContainer();
    autoCommand = new AutoCommand();
    LiveWindow.disableAllTelemetry();
    compressor.start();
    SmartDashboard.putNumber("Left Encoder Value is: ",
        Robot.objectDrivingSubsystem.leftEncoder.getSelectedSensorPosition());
    SmartDashboard.putNumber("Right Encoder Value is: ",
        Robot.objectDrivingSubsystem.rightEncoder.getSelectedSensorPosition());
    

    
    // We might need to make the camera a subsystem or define it in the robot
    // container
    // Also THis code is somewhat redundant... I am just seeing what is possible
    // -Justin
    // CameraServer.getInstance().startAutomaticCapture("camera",0);
    // camera1 = CameraServer.getInstance().startAutomaticCapture("camera", 0);
    // camera1.setResolution(1024,768);
    // I am thinking that this will create an output stream that we can store as a
    // matrix of numbers
    // outputStream1 = CameraServer.getInstance().putVideo("camera", 1024,768);
  }

  @Override
  public void robotPeriodic() {
    // Runs the Scheduler. This is responsible for polling buttons, adding
    // newly-scheduled
    // commands, running already-scheduled commands, removing finished or
    // interrupted commands,
    // and running subsystem periodic() methods. This must be called from the
    // robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
    

  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   */
  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {

  }

  /**
   * This autonomous runs the autonomous command selected by your
   * {@link RobotContainer} class.
   */
  @Override
  public void autonomousInit() {
    objectDrivingSubsystem.leftEncoder.setSelectedSensorPosition(0);
    objectDrivingSubsystem.rightEncoder.setSelectedSensorPosition(0);
    CommandScheduler.getInstance().registerSubsystem(objectDrivingSubsystem);
    if (autoCommand != null) autoCommand.schedule();
    
    
    
  }

  


  public void autonomousPeriodic() {   
    
    CommandScheduler.getInstance().run();
    
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    
    
    
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
  
   
  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    
  }
}
