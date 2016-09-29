package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.DTO.Ownerdto;




public class OwnerDAO {
	Connection conn = null;
	public  void connect() {
		try {
			System.out.println("in connect");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petclinic","root", "1234");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public  Ownerdto getaddowner(Ownerdto ot){
		try {
			 System.out.println("before conn");
			connect();
			 
			 PreparedStatement co=conn.prepareStatement("insert into owners values (?,?,?,?,?,?)");
			
			 co.setInt(1,ot.getId());
			 co.setString(2,ot.getFname());
			 co.setString(3,ot.getLname());
			 co.setString(4,ot.getAddress());
			 co.setString(5,ot.getCity());
			 co.setString(6,ot.getTelephone());
			 System.out.println("before inset");
			 co.executeUpdate();
			 System.out.println("after conn");
		}catch(Exception e){
			System.out.println(e);
		}
		return ot;
}
	public Ownerdto insertowner(int id) {
		Ownerdto o = new Ownerdto();
		o.setId(id);
		
		
		try {
			connect();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from owners where id=" + id);
			rs.next();

			o.setFname(rs.getString(2));
			o.setLname(rs.getString(3));
			o.setAddress(rs.getString(4));
			o.setCity(rs.getString(5));
			o.setTelephone(rs.getString(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}
	
	public  Ownerdto updateowner(Ownerdto ot,Object i){
		try {
			connect();
			 String sql="UPDATE owners set id=?,first_name=?,last_name=?,address=?,city=?,telephone=? where id=?";
			 PreparedStatement co=conn.prepareStatement(sql);
			
			 co.setInt(1,ot.getId());
			 co.setString(2,ot.getFname());
			 co.setString(3,ot.getLname());
			 co.setString(4,ot.getAddress());
			 co.setString(5,ot.getCity());
			 co.setString(6,ot.getTelephone());
			 co.setString(7,(String) i);
			 System.out.println("before inset");
			 co.executeUpdate();
			 System.out.println("after conn");
		}catch(Exception e){
			System.out.println(e);
		}
		return ot;
}
	public  ArrayList<String> Ownername(){
		Ownerdto od=new Ownerdto();
		ArrayList S=new ArrayList<String>();
		try {
			connect();
			 Statement statement = conn.createStatement() ;
			ResultSet co = 
	                statement.executeQuery("select * from owners"); 
			while(co.next()){
				int id=co.getInt("id");
				String firstname=co.getString("first_name");
				String lastname=co.getString("Last_name");
				String adr=co.getString("address");
				String city=co.getString("city");
				String tele=co.getString("telephone");
				
				S.add(id);
				S.add(firstname);
				S.add(lastname);
				S.add(adr);
				S.add(city);
				S.add(tele);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return S;
}
}

