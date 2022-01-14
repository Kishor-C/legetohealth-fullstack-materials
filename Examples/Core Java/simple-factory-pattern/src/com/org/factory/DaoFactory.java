package com.org.factory;

import com.org.dao.UserDao;
import com.org.dao.UserDaoImpV1;
import com.org.dao.UserDaoImpV2;

public class DaoFactory {
	public static UserDao getInstance() {
		return new UserDaoImpV2();
	}
}
