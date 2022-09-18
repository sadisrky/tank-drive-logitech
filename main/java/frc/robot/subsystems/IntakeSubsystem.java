// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {

    private static final VictorSPXControlMode ControlMode = VictorSPXControlMode.PercentOutput;
    private VictorSPX intakeMotor = new VictorSPX(IntakeConstants.kMotorPort);

    public IntakeSubsystem() {
    }

    @Override
    public void periodic() {
    }

    public void setPosition(boolean open) {
        if (open) {
            intakeMotor.set(ControlMode, IntakeConstants.kOpenSpeed);
           
        } else {
            intakeMotor.set(ControlMode, IntakeConstants.kCloseSpeed);
            
        }
    }

    public void runIntake(double m_speed) {
        
    }
}