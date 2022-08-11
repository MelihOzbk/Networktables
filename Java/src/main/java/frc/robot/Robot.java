// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  NetworkTableInstance inst = NetworkTableInstance.getDefault();
  NetworkTable Tablo = inst.getTable("Tablo"); //Tablo isminde tablo tanımlanır
  NetworkTableEntry Girdi = Tablo.getEntry("x"); // X adında Girdi tanımlanır
  NetworkTableEntry Girdi1 = Tablo.getEntry("y"); // y isminde girdi tanımlanır
  NetworkTableEntry Girdi2 = Tablo.getEntry("z"); // z isminde girdi tanımlanır
  NetworkTableEntry Girdi3 = Tablo.getEntry("d"); // d isminde girdi tanımlanır

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   * 
   * 
   */
  @Override
  public void robotInit() {
    //NetworkTables üzerinde Java için x, y, z ve d entryleri üzerinden veri oluşturma | belirleme. 
    Girdi.setBoolean(true); // value denen kısım ya true alır ya da false alır => Girdi.setBoolean(true); | Girdi.setBoolean(false);
    //
    Girdi1.setString("Hello World!"); // str, string => Girdi.setString("String");
    //
    Girdi2.setDouble(31); // value, double değer =>Girdi.setDouble(1);
    //
    Girdi3.setNumber(35); // value, ismi gibi sayı string kabul etmez long değer dahi kabul edebilir.
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
