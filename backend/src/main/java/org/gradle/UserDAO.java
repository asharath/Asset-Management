package org.gradle;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

@RegisterMapperFactory(BeanMapperFactory.class)
public interface UserDAO {
	
	@SqlQuery("Select * from Employee;")
	public List<User> getUsers();
	
	@SqlUpdate("Insert into Employee(eid, ename, email, age, sex) VALUES (:eid, :ename, :email, :age, :sex);")
	public void insertUser(@BindBean User user);
	@SqlUpdate("CREATE TABLE IF NOT EXISTS EMPLOYEE "
			+ "(eid INT NOT NULL auto_increment,"
			+ "ename VARCHAR(255) NOT NULL,"
			+ "email VARCHAR(255) NOT NULL,"
			+ "Age INT NOT NULL,"
			+ "Sex VARCHAR(255) NOT NULL,"
			+ "PRIMARY KEY (eid)) AUTO_INCREMENT=1;")
	public void createUser();
	
	@SqlUpdate("CREATE TABLE IF NOT EXISTS Gadget "
						+ "(gid INT NOT NULL auto_increment,"
						+ "gname VARCHAR(255) NOT NULL,"
						+ "modelname VARCHAR(255) NOT NULL,"
						+ "serialnumber VARCHAR(255) NOT NULL,"
						+ "purchasedate VARCHAR(255) NOT NULL,"
						+ "warrantydate VARCHAR(255) NOT NULL,"
						+ "status VARCHAR(255) NOT NULL,"
						+ "additionalinfo VARCHAR(511) NOT NULL,"
						+ "PRIMARY KEY (gid)) AUTO_INCREMENT=1;")
	public void createGadget();
	
	@SqlUpdate("CREATE TABLE IF NOT EXISTS Model "
						+ "(mid INT NOT NULL auto_increment,"
						+ "modelname VARCHAR(255) NOT NULL,"
						+ "PRIMARY KEY (mid)) AUTO_INCREMENT=1;")
	public void createModel();
	
	@SqlQuery("Select * from Gadget;")
	public List<Gadget> getGadgets();
	
	@SqlUpdate("Insert into Gadget(gid, gname, modelname, serialnumber, purchasedate, warrantydate, status, additionalinfo) VALUES (:gid, :gname, :modelname, :serialnumber, :purchasedate, :warrantydate, :status, :additionalinfo);")
	public void insertGadget(@BindBean Gadget gadget);
	
	@SqlQuery("Select * from Model;")
	public List<Model> getModels();
	
	@SqlUpdate("Insert into Model(mid, modelname) VALUES (:mid, :modelname);")
	public void insertModel(@BindBean Model model);
}
