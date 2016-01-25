package org.gradle;
import java.util.Collection;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/model")


public class ModelResource 
{
	//private static Map<Integer, Model> RATA = new ConcurrentHashMap<>();
    //private static AtomicInteger ID_COUNTER = new AtomicInteger();
    private UserDAO dao;

	public ModelResource(UserDAO dao) {
		this.dao = dao;

	}

	@PUT
	public Model insert(Model model) {
		dao.insertModel(model);
		return model;
	}

	@GET
	public Collection<Model> getModels() {
		return dao.getModels();
	}

}