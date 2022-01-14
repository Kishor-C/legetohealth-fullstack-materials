package com.org.dao;

public class UserDaoImpV2 implements UserDao {

	@Override
	public void save() {
		System.out.println("save() of UserDaoImpV2");
	}

	@Override
	public void delete() {
		System.out.println("delete() of UserDaoImpV2");
	}

}
