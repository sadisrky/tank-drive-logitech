package frc.robot.commands;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;


public class TankDriveCommand extends CommandBase {

  DriveSubsystem DriveTrainSubsystem;
  PS4Controller PS4Controller;

  public TankDriveCommand(PS4Controller PS4C, DriveSubsystem DriveSubs) {
    addRequirements(DriveSubs);
    DriveTrainSubsystem = DriveSubs;
    PS4Controller = PS4C;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  DriveTrainSubsystem.tankDrive(PS4Controller.getL2Axis(), PS4Controller.getR2Axis());
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end (boolean interrupted) {
    DriveTrainSubsystem.tankDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
