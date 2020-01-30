/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Motor;
import frc.robot.subsystems.UltrasonicSensor;

public class ObstacleDetect extends CommandBase {
  /**
   * Creates a new ObstacleDetect.
   */
  private final UltrasonicSensor ultralord;
  private final Motor mMotor;
  public ObstacleDetect(UltrasonicSensor pUltrasonic, Motor pMotor) {
    ultralord = pUltrasonic;
    mMotor = pMotor;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(ultralord);
    addRequirements(mMotor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (ultralord.getDistance() > 6){
      mMotor.move(0.5);
    }
    mMotor.move(0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if(interrupted){
      mMotor.move(0);
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
