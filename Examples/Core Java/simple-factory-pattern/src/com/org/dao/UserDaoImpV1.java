package com.org.dao;

public class UserDaoImpV1 implements UserDao {

	@Override
	public void save() {
		System.out.println("save() of UserDaoImpV1");
	}

	@Override
	public void delete() {
		System.out.println("delete() of UserDaoImpV1");
	}

}
