package com.services;

import com.DAO.OwnerDAO;
import com.DTO.Ownerdto;

public class ownerservice {

	public int addOwner(String id, String fname, String lname, String address, String city, String telephone) {
		// TODO Auto-generated method stub
		Ownerdto ds = new Ownerdto();

		ds.setId(Integer.parseInt(id));
		ds.setFname(fname);
		ds.setLname(lname);
		ds.setAddress(address);
		ds.setCity(city);
		ds.setTelephone(telephone);

		OwnerDAO da = new OwnerDAO();
		da.getaddowner(ds);
		return 0;
	}
	public int updateNewowner(int id, String fname, String lname, String address, String city, String telephone,Object idvalue){
		Ownerdto ds = new Ownerdto();

		ds.setId(id);
		ds.setFname(fname);
		ds.setLname(lname);
		ds.setAddress(address);
		ds.setCity(city);
		ds.setTelephone(telephone);
		
		OwnerDAO da = new OwnerDAO();
		
		da.updateowner(ds, idvalue);
		return 0;
	}
}