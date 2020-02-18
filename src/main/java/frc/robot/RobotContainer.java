/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Motor;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  public final Motor motorSub = new Motor();

  
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  public static final Joystick jStick = new Joystick(0);

  static WPI_TalonSRX lFront = new WPI_TalonSRX(0);
  static WPI_TalonSRX lMid = new WPI_TalonSRX(1);
  static WPI_TalonSRX lBack = new WPI_TalonSRX(2);

  static WPI_TalonSRX rFront = new WPI_TalonSRX(3);
  static WPI_TalonSRX rMid = new WPI_TalonSRX(4);
  static WPI_TalonSRX rBack = new WPI_TalonSRX(5);

  static SpeedControllerGroup leftSide = new SpeedControllerGroup(lFront, lMid, lBack);
  static SpeedControllerGroup rightSide = new SpeedControllerGroup(rFront, rMid, rBack);
  public static DifferentialDrive tDrive = new DifferentialDrive(leftSide, rightSide);

  // Creates a joystick on port 1
   //Joystick exampleStick = new Joystick(1);
  
  // Creates an XboxController on port 2.
    //XboxController exampleController = new XboxController(2); 

  // Creates a new JoystickButton object for button 1 on exampleStick
    //JoystickButton exampleButton = new JoystickButton(exampleStick, 1); 

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
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
    // Binds an ExampleCommand to be scheduled when the trigger of the example joystick is pressed
      //exampleButton.whenPressed(new ExampleCommand());

  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
