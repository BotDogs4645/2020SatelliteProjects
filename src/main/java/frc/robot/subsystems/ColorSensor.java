package frc.robot.subsystems;

//import frc.robot.commands.DetectColor;
//import frc.robot.commands.MoveByColor;
import edu.wpi.first.wpilibj.I2C; //port that sensor plugs into because it doesn't have its own class
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//This is my guess at trying to make a ColorSensor subsystem without actually being able to make a subsystem
/*
 *
 */
public class ColorSensor extends SubsystemBase {

	I2C colorSensor = new I2C(I2C.Port.kOnboard, 0x1E);//0x1E // 0x3C
	public void setAcive() {
		colorSensor.write(0x03, 0x00); // Turns on LED
	}
    //thinking that I have to make a constructor, but might not need to since it's I2C
    public ColorSensor(){


    }
	

	public int[] getColor() {

		
		
		byte[] red = new byte[1];
		byte[] green = new byte[1];
		byte[] blue = new byte[1];
		byte[] colorValue = new byte[1];
		// byte values to hold color values returned from sensor
		
		
		colorSensor.read(0x05, 1, red); // byte value of red
		colorSensor.read(0x06, 1, green); // byte value of green
		colorSensor.read(0x07, 1, blue); // byte value of blue
		colorSensor.read(0x04, 1, colorValue); // byte value of total color

		SmartDashboard.putNumber("Color: ", colorValue[0]); // Display color value
		//The number corresponds to certain colors, 0 = black, 16 = white
		
		SmartDashboard.putNumber("Red Value: ", red[0]); // Display red value
		SmartDashboard.putNumber("Green Value: ", green[0]); // Display red value
		SmartDashboard.putNumber("Blue Value: ", blue[0]); // Display blue value
		
		//The individual color values range from 0 to 127
		
		int[] colorReturn = {red[0], green[0], blue[0], colorValue[0]};
		
		return colorReturn;
		
	}

	public void setPassive() {
		colorSensor.write(0x03, 0x01); // Turns off LED
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		//setDefaultCommand(new MoveByColor(true,.5));
	}
}