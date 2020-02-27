/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.commands.DetectColor;
//import frc.robot.commands.MoveByColor;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ColorSensor extends SubsystemBase {
  I2C colorSensor = new I2C(I2C.Port.kOnboard, 0x1E);
	AnalogInput csAnalog = new AnalogInput(0);
	public void setActive() {
		colorSensor.write(0x03, 0x00); 
  }
  
  public int[] getColor(){
    byte [] blue = new byte[1];
    byte[] colorValue = new byte[1];

    colorSensor.read(0x07, 1, blue);
    colorSensor.read(0x04, 1, colorValue);

    SmartDashboard.putNumber("Color: ", colorValue[0]);

    SmartDashboard.putNumber("Blue Value: ", blue[0]);

    int[] colorReturn = {blue[0], colorValue[0]};

    return colorReturn;
  }

  public void setPassive() {
		colorSensor.write(0x03, 0x01); 
  }
  public char getColorChar() {
    return colorString.charAt(0);
  }


  /**
   * Creates a new ColorSensor.
   */
  public ColorSensor() {
    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
