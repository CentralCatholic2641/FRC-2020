/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.commands.ClimberDriveLeft;
import frc.robot.commands.ClimberDriveRight;
import frc.robot.commands.ExtendClimberCommand;
import frc.robot.commands.ExtendIntakeCommand;
import frc.robot.commands.RetractClimberCommand;
import frc.robot.commands.RetractIntakeCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.StoreCommand;
import frc.robot.commands.SpinningCommand;

public class RobotContainer {

  // Creates all new buttons
  public Joystick gamepad1 = new Joystick(Constants.gamepad1Port);
  public Joystick gamepad2 = new Joystick(Constants.gamepad2Port);
  public POVButton POVpad = new POVButton(gamepad2, 45);
  public Button pistonIntakeExtendButton = new JoystickButton(gamepad2, Constants.pistonIntakeExtendPort);
  public Button pistonIntakeRetractButton = new JoystickButton(gamepad2, Constants.pistonIntakeRetractPort);
  public Button storeButton = new JoystickButton(gamepad2, Constants.storeButtonPort);
  public Button shooterButton = new JoystickButton(gamepad2, Constants.shooterButtonPort);
  public Button intakeButton = new JoystickButton(gamepad2, Constants.intakeButtonPort);
  public POVButton spinnerButton = new POVButton(gamepad2, 45);
  public POVButton retractClimberButton = new POVButton(gamepad2, 180);
  public POVButton extendClimberButton = new POVButton(gamepad2, 0);
  public POVButton climberLeft = new POVButton(gamepad2, 270);
  public POVButton climberRight = new POVButton(gamepad2, 90);

  public RobotContainer() {

    // Extend and Retract Intake
    pistonIntakeExtendButton.whenPressed(new ExtendIntakeCommand(), true);
    pistonIntakeRetractButton.whenPressed(new RetractIntakeCommand(), true);

    // Fast shooter and conveyor
    shooterButton.whileHeld(new ShooterCommand(), true);
    storeButton.whileHeld(new StoreCommand(), true);

    // Medium conveyer and intake
    intakeButton.whileHeld(new IntakeCommand(), true);
    storeButton.whileHeld(new StoreCommand(), true);

    spinnerButton.whileHeld(new SpinningCommand(), true);
    retractClimberButton.whileHeld(new RetractClimberCommand(), true);
    extendClimberButton.whileHeld(new ExtendClimberCommand(), true);
    climberLeft.whileHeld(new ClimberDriveLeft(), true);
    climberRight.whileHeld(new ClimberDriveRight(), true);

    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {

  }

  // public getAutonomousCommand() {
  // return m_command;
  // An ExampleCommand will run in autonomous
  // }
}
