/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankD extends SubsystemBase {
  /**
   * Creates a new TankD.
   */
  WPI_TalonSRX lFront = new WPI_TalonSRX(0);
  WPI_TalonSRX lMid = new WPI_TalonSRX(1);
  WPI_TalonSRX lBack = new WPI_TalonSRX(2);

  WPI_TalonSRX rFront = new WPI_TalonSRX(3);
  WPI_TalonSRX rMid = new WPI_TalonSRX(4);
  WPI_TalonSRX rBack = new WPI_TalonSRX(5);

  SpeedControllerGroup leftSide = new SpeedControllerGroup(lFront, lMid, lBack){};
  SpeedControllerGroup rightSide = new SpeedControllerGroup(rFront, rMid, rBack);
  DifferentialDrive tDrive = new DifferentialDrive(leftSide, rightSide);

  public TankD() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
