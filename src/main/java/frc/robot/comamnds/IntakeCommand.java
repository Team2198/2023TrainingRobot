// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.comamnds;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends CommandBase {
  Intake intakes;
  boolean trigger;
  /** Creates a new IntakeCommand. */
  public IntakeCommand(Intake intakeInput,boolean triggerInput) {
    intakes = intakeInput;
    addRequirements(intakes);
    trigger = triggerInput;
    //addRequirements(trigger);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(trigger){
      intakes.lower();
    }
    else{
      intakes.retract();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
