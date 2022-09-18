// Copyright (c) FIRST and other WPILib contributors.
//// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.ShooterConstants.SHOOTER_OFF_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_ON_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_DRIVE_ID;

public class ShooterSubsystem extends SubsystemBase {
  

    private final TalonSRX shooterMotor = new TalonSRX(SHOOTER_DRIVE_ID);

  public ShooterSubsystem() {}
    
    public void setPosition(boolean run) {
        if (run){
            shooterMotor.set(TalonSRXControlMode.PercentOutput, SHOOTER_ON_SPEED);
        
        } else {
            shooterMotor.set(TalonSRXControlMode.PercentOutput, SHOOTER_OFF_SPEED);
        }
    }

}
