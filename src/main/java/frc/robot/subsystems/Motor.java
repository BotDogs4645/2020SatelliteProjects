/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  /**
   * Creates a new Motor.
   */
  WPI_TalonSRX motor = new WPI_TalonSRX(10);
  public Motor() {

  }

  public void move() {
    motor.set(0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
