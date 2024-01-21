// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class IntakeSubsystem extends SubsystemBase {
 private CANSparkMax intakeMotor1;
 private CANSparkMax intakeMotor2;






 /** Creates a new Intake. */
 public IntakeSubsystem(int motorID1, int motorID2){
   intakeMotor1 = new CANSparkMax(Constants.IntakeConstants.intakeMotor1ID,MotorType.kBrushless);
   intakeMotor2 = new CANSparkMax(Constants.IntakeConstants.intakeMotor2ID, MotorType.kBrushless);

 }
  public void controlIntake(double intakeSpeed) {
   intakeMotor1.set(intakeSpeed);
   intakeMotor2.set(intakeSpeed);
 }
 @Override
 public void periodic() {
   // This method will be called once per scheduler run
 }


public void set(double speed1) {
   // TODO Auto-generated method stub
   throw new UnsupportedOperationException("Unimplemented method 'set'");
}
public Command exampleMethodCommand() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exampleMethodCommand'");
}
}



