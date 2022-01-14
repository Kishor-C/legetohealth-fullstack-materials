package com.org.service;

import com.org.dao.UserDao;
import com.org.factory.DaoFactory;

public class DaoCaller {
	public static void main(String[] args) {
		UserDao dao = DaoFactory.getInstance();
		dao.save();
		dao.delete();
	}
}
