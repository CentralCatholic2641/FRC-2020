/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.AddNext;
import frc.robot.commands.ExtendClimberCommand;
import frc.robot.commands.RetractClimberCommand;
import frc.robot.commands.WheelClimberCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.StoreCommand;


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  
  // Makes a new joystick and button
  public Joystick gamepad1 = new Joystick(Constants.gamepad1Port);
  public Joystick gamepad2 = new Joystick(Constants.gamepad2Port);
  public Button xbutton = new JoystickButton(gamepad1, Constants.addNextButtonPort);
  public Button ybutton = new JoystickButton(gamepad2, Constants.intakeButtonPort);
  public Button zbutton = new JoystickButton(gamepad2, Constants.storeButtonPort);
  public Button sbutton = new JoystickButton(gamepad2, Constants.shooterButtonPort);
  public Button retractClimberButton = new JoystickButton(gamepad2, Constants.retractClimberButtonPort);
  public Button extendClimberButton = new JoystickButton(gamepad2, Constants.extendClimberButtonPort);
  public Button wheelLeftClimberButton = new JoystickButton(gamepad2, Constants.wheelLeftClimberButtonPort);
  public Button wheelRightClimberButton = new JoystickButton(gamepad2, Constants.wheelRightClimberButtonPort);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Will execute time command when the button is pressed
    xbutton.whenPressed(new AddNext());
    ybutton.whenActive(new IntakeCommand(), true);
    zbutton.whenActive(new StoreCommand(), true);
    sbutton.whenActive(new ShooterCommand(), true);
    retractClimberButton.whenActive(new RetractClimberCommand(), true);
    extendClimberButton.whenActive(new ExtendClimberCommand(), true);
    wheelLeftClimberButton.whenActive(new WheelClimberCommand(-1), true);
    wheelRightClimberButton.whenActive(new WheelClimberCommand(1), true);

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   */
  //public getAutonomousCommand() {
    //return m_command;
    // An ExampleCommand will run in autonomous
  //}
}
