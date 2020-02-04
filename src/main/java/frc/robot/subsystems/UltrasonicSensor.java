/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotContainer;
import frc.robot.commands.ObstacleDetect;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Ultrasonic;

public class UltrasonicSensor extends SubsystemBase {
  /**
   * Creates a new UltrasonicSensor.
   */
  Ultrasonic ultralord = new Ultrasonic(0, 0);
  public UltrasonicSensor() {
    ultralord.setAutomaticMode(true);
    setDefaultCommand(new ObstacleDetect(this, RobotContainer.motorSub));
  }

  public double getDistance(){
    return ultralord.getRangeInches();
  }
  
  /*public void destroySensor(){
    ultralord.close();
  }*/

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
