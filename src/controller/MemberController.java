/*
 * created by Chanaka Fernando
 * Email <nuwan.c.fernando@gmail.com>
 * this class should be placed under controller package of the project
 */

package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Member;
import db.DBConnection;
import controller.MemberController;
import view.ViewAllSelectedMembersByFaculty;
/**
 *
 * @author Chanaka Fernando
 */
public class MemberController {

     public static int addMember(Member member) throws ClassNotFoundException, SQLException {
        
        String sql = "Insert into memberdata Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, member.getIndex());
        stm.setObject(2, member.getName());
        stm.setObject(3, member.getBdate());
        stm.setObject(4, member.getGender());
        stm.setObject(5, member.getFaculty());
        stm.setObject(6, member.getDepartment());
        stm.setObject(7, member.getEmail());
        stm.setObject(8, member.getMobile());
        stm.setObject(9, member.getHomeNumber());
        stm.setObject(10,member.getAddress());
        stm.setObject(11,member.getBloodGroup());
        stm.setObject(12,member.getAllergies());
        stm.setObject(13,member.getMedicalCondition());
        stm.setObject(14,member.getHowGet());
        stm.setObject(15,member.getExperience());
        stm.setObject(16,member.getRegisterdDate());
        stm.setObject(17,member.getRelatedSociety());
        stm.setObject(18,member.getSkills());
        stm.setObject(19,member.getMotives());
        stm.setObject(20,member.getKinshipName());
        stm.setObject(21,member.getKinship());
        stm.setObject(22,member.getKmNumber());
        
        return stm.executeUpdate();
    } 
     
     
     public static Member searchMember(String id) throws ClassNotFoundException, SQLException {
        
        String sql = "Select * From memberdata where id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        Member member = null;
        if (rst.next()) {
            //(name,bDate,index,gender,fac,dep,email,mob,hnum,addrs,blood,alagic,smc,howget,experience,regDate,society,skils,motives)
            member = new Member(rst.getString("fname"), rst.getString("dob"),id, rst.getString("gender"), rst.getString("faculty"),rst.getString("department"),rst.getString("email"),rst.getString("mobile"),rst.getString("homenum"),rst.getString("address"),rst.getString("bgroup"),rst.getString("allergies"),rst.getString("s_m_condition"),rst.getString("howGet"),rst.getString("experience"),rst.getString("registerdDate"),rst.getString("society"),rst.getString("skills"),rst.getString("motives"),rst.getString("kname"),rst.getString("kinship"),rst.getString("knumber"));
        }
        return member;
    }
    
         public static ArrayList<Member> getAllMemberByFaculty() throws ClassNotFoundException, SQLException {
        String sql="Select * From memberdata where faculty='"+view.ViewAllSelectedMembersByFaculty.getSearchKey()+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<Member>memberList=new ArrayList<>();
        while(rst.next()){
            Member member = new Member(rst.getString("fname"), rst.getString("dob"),rst.getString("id"), rst.getString("gender"), rst.getString("faculty"),rst.getString("department"),rst.getString("email"),rst.getString("mobile"),rst.getString("homenum"),rst.getString("address"),rst.getString("bgroup"),rst.getString("allergies"),rst.getString("s_m_condition"),rst.getString("howGet"),rst.getString("experience"),rst.getString("registerdDate"),rst.getString("society"),rst.getString("skills"),rst.getString("motives"),rst.getString("kname"),rst.getString("kinship"),rst.getString("knumber"));
            memberList.add(member);
        }
        return memberList;
    }
         
        public static ArrayList<Member> getAllMemberByDepartment() throws ClassNotFoundException, SQLException {
        String sql="Select * From memberdata where faculty='"+view.ViewAllSelectedMembersByDepartment.getSearchKeyForDept()+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<Member>memberList=new ArrayList<>();
        while(rst.next()){
            Member member = new Member(rst.getString("fname"), rst.getString("dob"),rst.getString("id"), rst.getString("gender"), rst.getString("faculty"),rst.getString("department"),rst.getString("email"),rst.getString("mobile"),rst.getString("homenum"),rst.getString("address"),rst.getString("bgroup"),rst.getString("allergies"),rst.getString("s_m_condition"),rst.getString("howGet"),rst.getString("experience"),rst.getString("registerdDate"),rst.getString("society"),rst.getString("skills"),rst.getString("motives"),rst.getString("kname"),rst.getString("kinship"),rst.getString("knumber"));
            memberList.add(member);
        }
        return memberList;
    }
    
}


