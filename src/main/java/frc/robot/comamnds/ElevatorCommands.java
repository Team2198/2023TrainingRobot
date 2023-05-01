// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.comamnds;
import frc.robot.subsystems.Elevator;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ElevatorCommands extends CommandBase {
  /** Creates a new ElevatorCommands. */

  Elevator elevatorSystem;
  double elevation;

  public ElevatorCommands(Elevator elevator, DoubleSupplier movement) {
    // Use addRequirements() here to declare subsystem dependencies.
    elevatorSystem = elevator;
    elevation = movement.getAsDouble(); 
    addRequirements(elevatorSystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    elevatorSystem.elevation(elevation);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
