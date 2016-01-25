package org.gradle;

import java.util.Collection;
//import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/user")
public class UserResource {
	// private static Map<Integer, User> DATA = new ConcurrentHashMap<>();
	//private static AtomicInteger ID_COUNTER = new AtomicInteger();
	private UserDAO dao;

	public UserResource(UserDAO dao) {
		this.dao = dao;

	}

	@PUT
	public User insert(User user) {
		dao.insertUser(user);
		return user;
	}

	@GET
	public Collection<User> getUsers() {
		return dao.getUsers();
	}

}
