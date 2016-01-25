package org.gradle;
import java.util.Collection;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response.Status;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/gadget")

public class GadgetResource 
{
	//private static Map<Integer, Gadget> SATA = new ConcurrentHashMap<>();
	//private static AtomicInteger ID_COUNTER = new AtomicInteger();
	private UserDAO dao;

	public GadgetResource(UserDAO dao) {
		this.dao = dao;

	}

	@PUT
	public Gadget insert(Gadget gadget) {
		dao.insertGadget(gadget);
		return gadget;
	}

	@GET
	public Collection<Gadget> getGadgets() {
		return dao.getGadgets();
	}

	    
}