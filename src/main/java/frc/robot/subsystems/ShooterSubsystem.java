// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix6.hardware.TalonFX;


public class ShooterSubsystem extends SubsystemBase {
private TalonFX tshooter1;
private TalonFX bshooter2;


 /** Creates a new ShooterSubsystem. */
 public ShooterSubsystem(int topMotorID, int bottomMotorID) {
tshooter1 = new TalonFX(Constants.ShooterConstants.tshooter1ID);
bshooter2 = new TalonFX(Constants.ShooterConstants.bshooter2ID);
 }
 public ShooterSubsystem() {
  //TODO Auto-generated constructor stub
}
public void controlShooter(double shooterSpeed) {
   tshooter1.set(shooterSpeed);
   bshooter2.set(shooterSpeed);
 }


 @Override
 public void periodic() {
   // This method will be called once per scheduler run
 }
 public void set(double speed1) {
   // TODO Auto-generated method stub
   throw new UnsupportedOperationException("Unimplemented method 'set'");
 }
}



