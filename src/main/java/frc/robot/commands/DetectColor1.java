// package frc.robot.commands;

// import frc.robot.Robot;
// import frc.robot.subsystems.ColorSensor;
// import edu.wpi.first.wpilibj2.command.CommandBase;
// //this is my guess and copy paste of the DetectColor command
// /**
//  *
//  */
// public class DetectColor extends CommandBase {// not used

//   private final ColorSensor colorSensor;
//   //ColorSensor is the subsystem and colorSensor is the name of the object created
//   public DetectColor(ColorSensor subsystem) {
//     colorSensor = subsystem;
//     // Use addRequirements() here to declare subsystem dependencies.
//     addRequirements(colorSensor);
//   }


//   public DetectColor() {
//       // Use requires() here to declare subsystem dependencies
//       // eg. requires(chassis);
//     requires(Robot.kColorSensor);
    
//   }

//   // Called just before this Command runs the first time
//   protected void initialize() {
//     Robot.kColorSensor.setAcive();
//   }

//   // Called repeatedly when this Command is scheduled to run
//   protected void execute() {
//      Robot.kColorSensor.getColor();
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   protected boolean isFinished() {
//       return false;
//   }

//   // Called once after isFinished returns true
//   protected void end() {
//     Robot.kColorSensor.setPassive();
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   protected void interrupted() {
//       Robot.kColorSensor.setPassive();
//   }
// }