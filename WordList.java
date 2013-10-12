import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
import java.util.*;


/**
 * Write a description of class WordList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordList extends Actor
{
    private String word = null;
    private String dbName = "WordsSet";
    
    public WordList(){
        //word=getWordFromDB();    
        word="CAT";
    }
    
    private int getRandomNo(){
         Connection conn= getConnect();
        String query = "select count(*) from WordsSet";
         Statement stmt1 = null;
         int finalNo=0;
        try {
        
        stmt1=conn.createStatement();
        ResultSet rs = stmt1.executeQuery(query);
        rs.next();
        int res=rs.getInt(1);
        
        Random generator = new Random(); 
        finalNo= generator.nextInt(res) + 1;
        System.out.println("Random no="+finalNo);
        
    } catch (SQLException e ) {
        System.out.println(e);
    } finally {try{
        if (stmt1 != null) { stmt1.close();
        
        }
        
    }catch (Exception e){
        System.out.println(e);
    }
    }
    return finalNo;
}
    
    private Connection getConnect(){
        JDBCConnection connection=new JDBCConnection();
       Connection con= connection.getConnection();
       return con;
    }
    
    
    private String getWordFromDB(){
      Connection conn= getConnect();
       Statement stmt = null;
       int serNo= getRandomNo();
       String searchedWord=null;
       String query = "select word from WordsSet where serial_no="+serNo;
                   try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        rs.next();
         searchedWord = rs.getString(1);
       
        
    } catch (SQLException e ) {
        System.out.println(e);
    } finally {
        try{
        if (stmt != null) { stmt.close();
        
        }
        
    }catch (Exception e){
        System.out.println(e);
    }
    }
        return  searchedWord; 
    }
    
    
    public String getWord(){
        return word;
    }
    
    public static void main(String args[]){
    	WordList w=new WordList();
    	String str=w.getWord();
    	System.out.println(str);
    }
    }

    
