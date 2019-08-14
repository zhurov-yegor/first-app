package com.example.first;

public class UserService {

	public void saveUser() {
		
		new UserDao().insert(new UserEntity());
	}
}
