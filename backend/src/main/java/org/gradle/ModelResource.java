package org.gradle;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/model")


public class ModelResource 
{
	@PUT
	 public Model insert(Model model)
	{ 
	SqlH2 data = new SqlH2();
	data.initializeConnections();
	data.createNewTableModel();
	 data.insertModel(model);
	 data.retrieveModel(model);
	 data.closeConnections();
	return model;

}
}