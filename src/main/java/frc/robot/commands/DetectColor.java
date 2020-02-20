/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ColorSensor;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DetectColor extends CommandBase {
  /**
   * Creates a new DetectColor.
   */
  private final ColorSensor colorSensor;


  public DetectColor(ColorSensor cs) {
    // Use addRequirements() here to declare subsystem dependencies.
    // Use requires() here to declare subsystem dependencies
      // eg. requires(chassis);
      colorSensor = cs;
      addRequirements(colorSensor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.colorSense.getColor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
  // Called once after isFinished returns true
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
  }

}
