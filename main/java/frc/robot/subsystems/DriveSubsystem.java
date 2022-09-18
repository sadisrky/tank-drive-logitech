// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  WPI_TalonSRX MOTOR_FRONT_LEFT = new WPI_TalonSRX(DriveConstants.WPI_TalonSRX_1_ID); // pin numaraları constantstan olacak
  WPI_VictorSPX MOTOR_REAR_LEFT= new WPI_VictorSPX(DriveConstants.WPI_VictorSPX_1_ID);
  MotorControllerGroup MOTORS_LEFT = new MotorControllerGroup(MOTOR_FRONT_LEFT, MOTOR_REAR_LEFT);

  WPI_TalonSRX MOTOR_FRONT_RIGHT = new WPI_TalonSRX(DriveConstants.WPI_TalonSRX_2_ID); // Büyük i kullanma no türkçe karakter I
  WPI_VictorSPX MOTOR_REAR_RIGHT = new WPI_VictorSPX(DriveConstants.WPI_VictorSPX_2_ID);
  MotorControllerGroup MOTORS_RIGHT = new MotorControllerGroup(MOTOR_FRONT_RIGHT, MOTOR_REAR_RIGHT);
  DifferentialDrive DRIVE = new DifferentialDrive(MOTORS_LEFT, MOTORS_RIGHT);

  public DriveSubsystem() {
  MOTORS_LEFT.setInverted(false);
  MOTORS_RIGHT.setInverted(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void tankDrive(double leftSpeed, double rightSpeed)
  {
    DRIVE.tankDrive(leftSpeed, rightSpeed);
  }

}
