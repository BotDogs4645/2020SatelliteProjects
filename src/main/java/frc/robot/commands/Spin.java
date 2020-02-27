package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
//import frc.robot.subsystems.ControlPanelMotor;
import frc.robot.subsystems.MotorControlHub;

public class Spin extends CommandBase {
    public static MotorControlHub subsystem;
  public Spin(MotorControlHub sub){
    subsystem = sub;
    addRequirements(subsystem);
  }
  
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.m_controlpanelsub.SpinClockwise();
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
}