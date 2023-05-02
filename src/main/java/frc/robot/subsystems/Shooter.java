// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;


public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  CANSparkMax leftmotor;
  CANSparkMax rightmotor; 

  public Shooter() {
    leftmotor = new CANSparkMax(0, null);
    rightmotor = new CANSparkMax(0, null);
    leftmotor.setInverted(true);
  }


  public void Shooting(){
    leftmotor.set(0.8);
    rightmotor.set(0.8);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
