package org.gradle;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/assignment")

public class AssignmentResource 
{
	@PUT
	 public Assignment insert(Assignment assignment){
		 
		 SqlH2 data = new SqlH2();
		 data.initializeConnections();
		 data.createNewTableAssignemnt();
		 data.insertAssigmennt(assignment);
		 data.retrieveAssignment(assignment);
		 data.closeConnections();
		 return assignment;
	 }
}
