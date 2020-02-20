/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.commands.Drive;

public class TankD extends SubsystemBase {
  /**
   * Creates a new TankD.
   */

  public TankD() {
    setDefaultCommand(new Drive(this));
  }

  public void joystickDrive(){
    double throttle = RobotContainer.jStick.getY()*.8;
    double turn = RobotContainer.jStick.getX() *.8;

    //deadzone
    if(Math.abs(throttle) < 0.05){
      throttle = 0;
    }
    if(Math.abs(turn) < 0.05){
      turn = 0;
    }

    RobotContainer.tDrive.arcadeDrive(throttle, turn);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
