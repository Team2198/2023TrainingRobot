// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
  /** Creates a new Elevator. */
  private final WPI_TalonFX motor;
  

  public Elevator() {
    motor = new WPI_TalonFX(0);
  }

  public void elevation(double leftHeading) {
    if (leftHeading < .15 && leftHeading > -.15){
      leftHeading = 0;
    }
    motor.set(leftHeading);
    //Takes in the doublesupplier to determine the direction the motor is in 
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
