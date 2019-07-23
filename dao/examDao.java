/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizpojo.pojo.Exampojo;


public class examDao {
    public static String getExamId()throws SQLException
    {
        String qry="select count(*) as totalrows from exam";
        int rowcount=0;
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(qry);
        if(rs.next())
        
          rowcount=rs.getInt(1);
        String newID="Ex-"+(rowcount+1);
        return newID;
        
    }
    public static boolean addExam(Exampojo newExam)throws Exception
    {
     String qry="insert into exam values(?,?,?)";
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,newExam.getExamid());
     ps.setString(2,newExam.getLanguage());
     ps.setInt(3,newExam.getTotalQuestion());
     int ans=ps.executeUpdate();
     return ans==1;
    }
    public static boolean updateExams(Exampojo newExam)throws Exception
    {
     String qry="update exam set examid=?,language=?,totalquestion=?";
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,newExam.getExamid());
     ps.setString(2,newExam.getLanguage());
     ps.setInt(3,newExam.getTotalQuestion());
     int ans=ps.executeUpdate();
     return ans==1;
    }
    
    public static boolean isPaperSet(String subject)throws SQLException
    {
        String qry="select examid from exam where language=?";
        Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,subject);
     ResultSet rs=ps.executeQuery();
     return rs.next();
    }
    public static ArrayList<String> getExamidbySubject(String userid,String subject)throws SQLException
    {
     String qry="Select examid from exam where language=? minus select examid from performance where userid=?";
     ArrayList<String> examList=new ArrayList<>();
     
        Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,subject);
     ps.setString(2,userid);
     ResultSet rs=ps.executeQuery();
     while(rs.next())
     {
         examList.add(rs.getString(1));
     }
     return examList;
    }
    public static int getQuestionCountByExam(String examid)throws SQLException
    {
         String qry="select totalquestion from exam where examid=?";
        Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,examid);
     ResultSet rs=ps.executeQuery();
     rs.next();
     int rowCount=rs.getInt(1);
     
     return rowCount;
    }
     public static ArrayList<String> getExamid(String subject)throws SQLException
    {
     String qry="Select examid from exam where language=?";
     ArrayList<String> examList=new ArrayList<>();
     
        Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,subject);
     ResultSet rs=ps.executeQuery();
     while(rs.next())
     {
         examList.add(rs.getString(1));
     }
        System.out.println(examList);
     return examList;
    }
    
}
