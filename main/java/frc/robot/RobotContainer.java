package frc.robot;




import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.DriveSubsystem;





  public class RobotContainer {
    private final DriveSubsystem driveSubsystem = new DriveSubsystem();
    private final PS4Controller ps4Controller = new PS4Controller(0);
    private final TankDriveCommand tankDriveCommand = new TankDriveCommand(ps4Controller, driveSubsystem);

  public TankDriveCommand getTankDriveCommand(){
      return tankDriveCommand;
    }
 

    

    

  // The robot's subsystems and commands are defined here...


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() { 

    ;
}

  public Command getAutonomousCommand() {
    return null;
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  }