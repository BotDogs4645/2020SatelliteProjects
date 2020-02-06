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
import edu.wpi.first.wpilibj.AnalogInput;

public class UltrasonicSensor extends SubsystemBase {
  /**
   * Creates a new UltrasonicSensor.
   */
  AnalogInput ultralord = new AnalogInput(0);
  public UltrasonicSensor() {
    setDefaultCommand(new ObstacleDetect(this, RobotContainer.motorSub));
  }

  public double getDistance(){
    return ultralord.getValue();
    
  }
  
  /*public void destroySensor(){
    ultralord.close();
  }*/

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
