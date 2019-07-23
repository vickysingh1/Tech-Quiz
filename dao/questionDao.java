
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizpojo.pojo.QuestionStore;
import techquizpojo.pojo.Questionpojo;

/**
 *
 * @author Lenovo
 */
public class questionDao {
    public static void addQuestion(QuestionStore qstore)throws SQLException
    {
        String qry="insert into question values(?,?,?,?,?,?,?,?,?)";
        
        ArrayList<Questionpojo> questionslist=qstore.getAllQuestion();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        for(Questionpojo qp:questionslist)
        {
            ps.setString(1,qp.getExamId());
            ps.setInt(2,qp.getQno());
            ps.setString(3,qp.getQuestion());
            ps.setString(4,qp.getAnswer1());
            ps.setString(5,qp.getAnswer2());
            ps.setString(6,qp.getAnswer3());
            ps.setString(7,qp.getAnswer4());
            ps.setString(8,qp.getCorrectanswer());
            ps.setString(9,qp.getLanguage());
            ps.executeUpdate();
            
        }
        
    }
    
    public static ArrayList<Questionpojo>getQuestionsByExamid(String examId)throws SQLException
    {
        String qry="select * from question where examid=? order by qno";
        ArrayList<Questionpojo> questionlist=new ArrayList<>();
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            int qno=rs.getInt(2);
            String question=rs.getString(3);
            String option1=rs.getString(4);
            String option2=rs.getString(5);
            String option3=rs.getString(6);
            String option4=rs.getString(7);
            String correctAnswer=rs.getString(8);
            String language=rs.getString(9);
            
            Questionpojo obj=new Questionpojo(examId,qno,language,option1,option2,option3,option4,correctAnswer,question);
            questionlist.add(obj);
        }
        
        
        return questionlist;
        
    }

      public static boolean updateQuestion(QuestionStore qstore, String id)throws SQLException
    {
        String qry="update question set questions=?,answer1=?,answer2=?,answer3=?,answer4=?,correctanswer=? where examid=? and qno=?";
        ArrayList<Questionpojo> questionslist=qstore.getAllQuestion();
        int i=0;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
       
        for(Questionpojo qp:questionslist)
        
        {
            
            ps.setString(1,qp.getQuestion());
            ps.setString(2,qp.getAnswer1());
            ps.setString(3,qp.getAnswer2());
            ps.setString(4,qp.getAnswer3());
            ps.setString(5,qp.getAnswer4());
            ps.setString(6,qp.getCorrectanswer());
            ps.setString(7,id);
            ps.setInt(8,qp.getQno());
           
            i=ps.executeUpdate();
            
        }
        return i==1;
        
    } 
    
   
        
           
    
    
    
}
