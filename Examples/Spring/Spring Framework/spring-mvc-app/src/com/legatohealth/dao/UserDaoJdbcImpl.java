package com.legatohealth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.legatohealth.beans.User;
@Repository
public class UserDaoJdbcImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbc; // because in the xml a bean is configured for JdbcTemplate we can inject it
	@Override
	public void store(User user) {
		String insertQuery = "insert into users (name, password, age) values (?, ?, ?)";
		jdbc.update(insertQuery, user.getName(), user.getPassword(), user.getAge());
	}
	@Override
	public void updateUser(int userId, User user) {
		String updateUserQuery = "update users set name =?, password = ?, age = ? where userid = ?";
		jdbc.update(updateUserQuery, user.getName(), user.getPassword(), user.getAge(), user.getUserId());
	}
	@Override
	public void deleteUser(int userId) {
		String deleteQuery = "delete from users where userid = ?";
		jdbc.update(deleteQuery, userId);
	}
	@Override
	public User fetchUser(int userId) {
		String selectUserQuery = "select * from users where userid = ?";
		/*
		 * queryForObject takes a RowMapper which returns a single user object based on the id
		 * the last argument is the id that maps to the ?
		 */
		User userObtained = jdbc.queryForObject(selectUserQuery, (rs, index) -> {
			User user = new User();
			user.setUserId(rs.getInt("userid"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			return user;
		}, userId); // userId is the 3rd argment
		return userObtained;
	}
	@Override
	public List<User> fetchUsers() {
		String selectQuery = "select * from users";
		// query method returns List<T> where T is the type of object the RowMapper returns
		return jdbc.query(selectQuery, (rs, index) -> {
			User user = new User();
			user.setUserId(rs.getInt("userid"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			return user;
		});
		
	}
}
