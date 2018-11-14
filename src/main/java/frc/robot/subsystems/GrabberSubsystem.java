/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class GrabberSubsystem extends Subsystem {
//wheels
  private WPI_TalonSRX m_leftWheels;
  private WPI_TalonSRX m_rightWheels;
  private SpeedControllerGroup m_Wheels;

  public GrabberSubsystem() {

    m_leftWheels = new WPI_TalonSRX(8);
    m_leftWheels.set(ControlMode.PercentOutput, 0,0);
    m_rightWheels = new WPI_TalonSRX(3);
    m_rightWheels.set(ControlMode.PercentOutput, 0,0);
    m_rightWheels.setInverted(true);
    m_Wheels = new SpeedControllerGroup(m_leftWheels, m_rightWheels);

  

    
  }
 

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  
  }

  public void ReverseWheels() {

      m_Wheels.set(-0.7);
  }
  public void StartWheels() {

      m_Wheels.set(0.7);
      
  }

  public void StopWheels() {

    m_Wheels.set(0);

  }

}
