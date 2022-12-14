// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
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
  // OLUŞTURULACAK TABLO VE GIRDILERI TANIMLAMA
  NetworkTable Tablo = inst.getTable("Tablo"); //Tablo isminde tablo tanımlanır
  NetworkTableEntry Girdi = Tablo.getEntry("x"); // X adında Girdi tanımlanır
  NetworkTableEntry Girdi1 = Tablo.getEntry("y"); // y isminde girdi tanımlanır
  NetworkTableEntry Girdi2 = Tablo.getEntry("z"); // z isminde girdi tanımlanır
  NetworkTableEntry Girdi3 = Tablo.getEntry("d"); // d isminde girdi tanımlanır
  //OKUNACAK TABLO VE GIRDILERI TANIMLAMA
  NetworkTable Tablo1 = inst.getTable("Tablo2"); //Tablo2 isminde tablo tanımlanır
  NetworkTableEntry Oku = Tablo1.getEntry("x"); // X adında Okunacak girdi tanımlanır
  NetworkTableEntry Oku1 = Tablo1.getEntry("y"); // y isminde Okunacak girdi tanımlanır
  NetworkTableEntry Oku2 = Tablo1.getEntry("z"); // z isminde Okunacak Girdi tanımlanır
  NetworkTableEntry Oku3 = Tablo1.getEntry("d"); // d isminde Okunacak Girdi tanımlanır

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

    //NetworkTables üzerinde Java için x, y, z ve d entryleri üzerinden veri Okuma | İşleme. 
    Oku.getBoolean(true);
    Oku1.getString("defvalue");
    Oku2.getDouble(0);
    Oku3.getDouble(0);
  }

  @Override
  public void robotPeriodic() {
    // VERILERI OKUYUP YAZDIRMA PARANTEZ ICLERINDEKILER DEFAULT DEĞER KOPMA VEYA VERI GELMEZSE ICINDEKI DEGERLERI YAZAR
    System.out.println(Oku.getBoolean(true)+" "+Oku1.getString("defvalue")+" "+Oku2.getDouble(0)+" "+Oku3.getDouble(0));
    Timer.delay(1);
  }

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
