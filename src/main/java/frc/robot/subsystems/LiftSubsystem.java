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
import frc.robot.commands.DownCommand;
import frc.robot.commands.UpCommand;

/**
 * Add your docs here.
 */
public class LiftSubsystem extends Subsystem {
  private WPI_TalonSRX m_leftlift;
  private WPI_TalonSRX m_rightlift;
  private SpeedControllerGroup m_lift;

  public LiftSubsystem(){
    m_leftlift = new WPI_TalonSRX(37);
    m_leftlift.set(ControlMode.PercentOutput, 0.0);
    m_rightlift = new WPI_TalonSRX(95);
    m_rightlift.set(ControlMode.PercentOutput,0.0);
    m_lift = new SpeedControllerGroup(m_leftlift, m_rightlift);
  
  }


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());


     
  }

  public void UpCommand() {
    m_lift.set(0.5);
  }

  public void DownCommand() {
    m_lift.set(-0.5);
  }
}
