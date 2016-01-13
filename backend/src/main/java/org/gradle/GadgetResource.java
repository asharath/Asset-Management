package org.gradle;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/gadget")

public class GadgetResource 
{
	@PUT
	 public Gadget insert(Gadget gadget){
		 
		 SqlH2 data = new SqlH2();
		 data.initializeConnections();
		 data.createNewTableGadget();
		 data.insertGadget(gadget);
		 data.retrieveGadget(gadget);
		 data.closeConnections();
		 return gadget;
	 }
}
