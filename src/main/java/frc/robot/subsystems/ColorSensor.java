/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.nio.ByteBuffer;

import edu.wpi.first.wpilibj.I2C;

public class ColorSensor {
  private I2C sensor;
  private ByteBuffer buf = ByteBuffer.allocate(5);
  
  public ColorSensor(I2C.Port port) {
    sensor = new I2C(port, 0x39); //port, I2c address    

    sensor.write(0x00, 0b00000011); //power on, color sensor on
  }
  
  public int red() {
    //reads the address 0x16, 2 bytes of data, gives it to the buffer
    sensor.read(0x16, 3, buf);
    return buf.get(0);
  }
  
  public int green() {
    sensor.read(0x18, 2, buf);
    return buf.get(0);
  }
  
  public int blue() {
    sensor.read(0x1a, 2, buf);
    return buf.get(0);
  }
}