
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;

/**
 * Write a description of class JDBCConnection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JDBCConnection extends Actor
{
    Connection getConnection() {
    //See your driver documentation for the proper format of this string :
    String DB_CONN_STRING = "jdbc:mysql://54.235.83.253:3306/WordsDB";
    //Provided by your driver documentation. In this case, a MySql driver is used : 
    String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    String USER_NAME = "sjsu202";
    String PASSWORD = "sjsu";
    
    Connection result = null;
    try {
      Class.forName(DRIVER_CLASS_NAME).newInstance();
    }
    catch (Exception ex){
      System.out.println("Check classpath. Cannot load db driver: " + DRIVER_CLASS_NAME);
    }

    try {
      result = DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
    }
    catch (SQLException e){
      System.out.println( "Driver loaded, but cannot connect to db: " + DB_CONN_STRING);
    }
    return result;
  }
       
}
