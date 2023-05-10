// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Intake extends SubsystemBase {
  PneumaticHub pH;
  DoubleSolenoid dS;
  DoubleSolenoid dS2;
  WPI_TalonFX MamaMotor;


  /** Creates a new Intake. */
  public Intake() {
    pH = new PneumaticHub(0);
    dS = pH.makeDoubleSolenoid(1, 0);
    dS2 = pH.makeDoubleSolenoid(0, 1);
    MamaMotor = new WPI_TalonFX(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  public void lower() {
    dS.set(DoubleSolenoid.Value.kForward);
    dS2.set(DoubleSolenoid.Value.kForward);
    MamaMotor.set(1);
  }

  public void retract() {
    MamaMotor.set(0);
    dS.set(DoubleSolenoid.Value.kReverse);
    dS2.set(DoubleSolenoid.Value.kReverse);
    
  }
}

