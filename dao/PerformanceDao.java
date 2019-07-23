/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

//import java.sql.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizpojo.pojo.Performancepojo;
import techquizpojo.pojo.studentscorepojo;

//import java.sql.SQLException;
//import java.util.ArrayList;
//import techquizapp.dbutil.DBConnection;

/**
 *
 * @author Lenovo
 */
public class PerformanceDao {
    public static ArrayList<String>getAllStudentId()throws SQLException
    {
        String qry="select distinct userid from performance";
        ArrayList<String>Studentlist=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(qry);
        while(rs.next())
        {
            String id=rs.getString(1);
            Studentlist.add(id);
        }
        return Studentlist;
        
    }
    public static ArrayList<String> getAllExamid(String studentid)throws SQLException
    {
        String qry="select examid from performance where userid=?";
        ArrayList<String>examid=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement(qry);
         ps.setString(1,studentid);
         ResultSet rs=ps.executeQuery();
         while(rs.next())
         {
             String id=rs.getString(1);
             examid.add(id);
         }
        return examid;
        
                
    }
    public static studentscorepojo getScore(String studentid,String examid)throws SQLException
    {
        String qry="select language,percentage from performance where userid=? and examid=?";
          Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement(qry);
         ps.setString(1,studentid);
         ps.setString(2,examid);
         ResultSet rs=ps.executeQuery();
         rs.next();
         studentscorepojo scoreobj=new studentscorepojo();
         scoreobj.setLanguage(rs.getString(1));
         scoreobj.setPer(rs.getDouble(2));
         
         return scoreobj;
         
    }
    public static void addPerformance(Performancepojo performance)throws SQLException
    {
        String qry="insert into performance values(?,?,?,?,?,?,?)";
        Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement(qry);
         ps.setString(1,performance.getUserid());
         ps.setString(2,performance.getExamid());
         ps.setInt(3,performance.getRight());
         ps.setInt(4,performance.getWrong());
         ps.setInt(5,performance.getUnattempted());
         ps.setDouble(6,performance.getPer());
         ps.setString(7,performance.getLanguage());
          ps.executeUpdate();
         
         
    }
    public static ArrayList<Performancepojo>getAllData()throws SQLException
    {
      
         String qry="select * from performance";
        ArrayList<Performancepojo>performancelist=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(qry);
        while(rs.next())
        {
            String userid=rs.getString("userid");
            String examid=rs.getString("examid");
            String language=rs.getString("language");
            int right=rs.getInt("right");
            int wrong=rs.getInt("wrong");
            int unattempt=rs.getInt("unattempted");
            double per=rs.getDouble("percentage");
            Performancepojo p=new Performancepojo(examid,language,userid,right,wrong,unattempt,per);
            performancelist.add(p);
            
            
        }
        return performancelist;
    }
}
