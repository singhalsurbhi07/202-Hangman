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
    private static String word = null;
    private String dbName = "WordsSet";
    private static Connection conn;
    String selectedWord = null;

    public WordList(){
        //word=getWordFromDB();
        if (conn == null) {
            conn = getConnect();
        }
    }

    //Added to pass the category
    public WordList(String category){
        word = getWordFromDB(category);

        //word ="ELEPHANT";
    }

    private String getRandomNo(String category){
        
        String query = "select word from WordsSet where category = '" + category + "'";
        Statement stmt1 = null;
        int finalNo=0;

        try {

            stmt1=conn.createStatement();
            ResultSet rs = stmt1.executeQuery(query);
            List<String> categoryWordList = new ArrayList<String>();
            while(rs.next()){
                categoryWordList.add(rs.getString("word"));
            }
            //int res=rs.getInt(1);
            //String categoryChecking = rs.getString("category");
            //System.out.println ("res ================> " + res);

            Random generator = new Random(); 
            //finalNo= generator.nextInt(res) + 1;
            finalNo = generator.nextInt(categoryWordList.size());
            System.out.println("The final number is==============> " + finalNo);
            selectedWord = categoryWordList.get(finalNo);

            //System.out.println("Random no="+finalNo);
            System.out.println("The randomly selected word is : " + selectedWord);

        } catch (SQLException e ) {
            System.out.println(e);
        } finally {try{
                if (stmt1 != null) { stmt1.close();

                }

            }catch (Exception e){
                System.out.println(e);
            }
        }
        return selectedWord;
    }

    private Connection getConnect(){
        JDBCConnection connection=new JDBCConnection();
        Connection con= connection.getConnection();
        return con;
    }

    private String getWordFromDB(String category){

        //Connection conn= getConnect();
        Statement stmt = null;
        //Statement stmt2 = null;
        //         String categoryQuery =  "select category_Id from category where category_Name = '" + category + "'";
        //         try{
        //             stmt = conn.createStatement();
        //             ResultSet rs = stmt.executeQuery(categoryQuery);
        //             rs.next();
        //             int categoryId = rs.getInt(1);
        System.out.println("THE CATEGORY IS ==============>" + category);
        selectedWord = getRandomNo(category);

        //int serNo= getRandomNo(categoryId);
        //String searchedWord=null;

        //String category = category;
        //String query = "select word from WordsSet where serial_no="+serNo;//
        //String query = "select word from WordsSet where serial_no = " + serNo + " and category = '" + category + "'";
        //System.out.println("The Query is ====================> " + query);
        //         try {
        //             stmt2 = conn.createStatement();
        //             ResultSet rs2 = stmt2.executeQuery(query);
        //             rs2.next();
        //             searchedWord = rs2.getString(1);
        // 
        //         } catch (SQLException e ) {
        //             System.out.println(e);
        //         } finally {
        //             try{
        //                 if (stmt != null) {
        //                     stmt.close();
        // 
        //                 }
        // 
        //             }catch (Exception e){
        //                 System.out.println(e);
        //             }
        //         }
        System.out.println("The searched word is ::::::::::::: " + selectedWord);
        //     }catch(SQLException e){
        //         System.out.println(e);
        //     }finally{
        //         try{
        //             if (stmt != null) {
        //                 stmt.close();
        // 
        //             }
        // 
        //         }catch (Exception e){
        //             System.out.println(e);
        //         }

        //return  searchedWord; 
        return selectedWord;
    }

    public static String getWord(){
        System.out.println("wordlist word = "+word); 
        return word;
    }

    //     public static void clearWord() {
    //         word = null;
    //     }
    //     public static void main(String args[]){
    //         WordList w=new WordList();
    //         String str=w.getWord();
    //         System.out.println(str);
    //     }
}
