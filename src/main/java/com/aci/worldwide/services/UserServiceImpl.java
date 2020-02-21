package com.aci.worldwide.services;

import org.springframework.stereotype.Service;

import com.aci.worldwide.entities.User;

//model class

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean isValidUser(User user) {
		// TODO Auto-generated method stub
		if(user!=null && user.getUsername().equals("Prat")&& user.getPassword().equals("wel")){
			return true;
		}
		return false;
	}

}
