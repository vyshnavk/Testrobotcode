/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class GrabberArmSubsystem extends Subsystem {
  private WPI_TalonSRX m_leftArm;
  private WPI_TalonSRX m_rightArm;
  private SpeedControllerGroup m_Arm;

  public GrabberArmSubsystem() {
    m_leftArm = new WPI_TalonSRX(9);
    m_rightArm = new WPI_TalonSRX(2);
    m_rightArm.setInverted(true);
    m_Arm = new SpeedControllerGroup(m_leftArm, m_rightArm);
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    

    }

public void open() {
  m_Arm.set(0.2);
}

public void close() {
  m_Arm.set(-0.2);
}

    



 



  }

