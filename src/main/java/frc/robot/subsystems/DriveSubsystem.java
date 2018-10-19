/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.DriveTeleopCommand;


/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private WPI_TalonSRX m_left;
  private WPI_TalonSRX m_right;
  private DifferentialDrive m_drive;
  //private OI m_oi = new OI();
  private Joystick m_js = new Joystick(0);

  public DriveSubsystem() {
    m_left = new WPI_TalonSRX(1);
    m_right = new WPI_TalonSRX(2);
    // m_left.setInverted(true);  //invert left motor

    m_drive = new DifferentialDrive(m_left, m_right);
    m_drive.arcadeDrive(0.0, 0.0);
  }
  public void update() {
    double throttle = m_js.getRawAxis(1);
    double turn = m_js.getRawAxis(4);

    m_drive.arcadeDrive(throttle, turn);
  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new DriveTeleopCommand());
  }
}
