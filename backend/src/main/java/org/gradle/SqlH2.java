package org.gradle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLException;
public class SqlH2 {
		
		// JDBC driver name and database URL
		static final String JDBC_DRIVER = "org.h2.Driver";
		static final String DB_URL = "jdbc:h2:~/test";

		// Database credentials
		static final String USERID = "sa";
		static final String PASSWORD = "";

		Connection connection = null;
		Statement statement = null;
		
		public void initializeConnections() {
			try {
				// STEP 2: Register JDBC driver
				Class.forName("org.h2.Driver");

				// STEP 3: Open a connection
				System.out.println("Connecting to a selected database...");
				connection = DriverManager.getConnection(DB_URL, USERID, PASSWORD);
				System.out.println("Connected database successfully...");
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
		}
		
		public void closeConnections() {
			try {
				if (statement != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // do nothing
			
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		}

		public void createNewTableUser() {
			try {
				// Execute a query
				System.out.println("Creating employee table in given database...");
				statement = connection.createStatement();
				
				String sql = "CREATE TABLE IF NOT EXISTS EMPLOYEE "
						+ "(eid INT NOT NULL auto_increment,"
						+ "ename VARCHAR(255) NOT NULL,"
						+ "email VARCHAR(255) NOT NULL,"
						+ "Age INT NOT NULL,"
						+ "Sex VARCHAR(255) NOT NULL,"
						+ "PRIMARY KEY (eid)) AUTO_INCREMENT=1";
				statement.executeUpdate(sql);
				System.out.println("Created table in given database...");
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			}
		}
		
		public void createNewTableGadget() {
			try {
				// Execute a query
				System.out.println("Creating gadget table in given database...");
				statement = connection.createStatement();
				
				String sql = "CREATE TABLE IF NOT EXISTS GADGET "
						+ "(gadget_id INT NOT NULL auto_increment,"
						+ "gadget_name VARCHAR(255) NOT NULL,"
						+ "model_type VARCHAR(255) NOT NULL,"
						+ "serial_number VARCHAR(255) NOT NULL,"
						+ "purchase_date VARCHAR(255) NOT NULL,"
						+ "purchase_date VARCHAR(255) NOT NULL,"
						+ "warranty_date VARCHAR(255) NOT NULL,"
						+ "additional_info VARCHAR(511) NOT NULL,"
						+ "PRIMARY KEY (gadget_id)) AUTO_INCREMENT=1";
				statement.executeUpdate(sql);
				System.out.println("Created table in given database...");
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			}
		}
		
		public void createNewTableModel() {
			try {
				// Execute a query
				System.out.println("Creating model table in given database...");
				statement = connection.createStatement();
				
				String sql = "CREATE TABLE IF NOT EXISTS MODEL "
						+ "(model_id INT NOT NULL auto_increment,"
						+ "(model_name VARCHAR(255) NOT NULL,"
						+ "PRIMARY KEY (model_id)) AUTO_INCREMENT=1";
				statement.executeUpdate(sql);
				System.out.println("Created table in given database...");
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			}
		}
		public void insertUser(User user) {
			
			  try {
		          //STEP 4: Execute a query
		          System.out.println("Inserting records into the table...");
		          statement = connection.createStatement();

		          String sql = "INSERT INTO EMPLOYEE "
		          		+ "(eid,ename,email,Age,Sex)"
		          		+ "VALUES (" + "'" + user.geteId() +"'"
		          		+ ", " + "'" + user.geteName() +"'"
		          		+ ", " + "'" + user.getEmail() + "'"
		          		+ ", " + "'" + user.getAge() + "'"
		          		+ ", " + "'" + user.getSex() + "'"
		          		+ ")";

		          statement.executeUpdate(sql);

		          System.out.println("Inserted records into the table...");

		      } catch (SQLException se) {
		          //Handle errors for JDBC
		          se.printStackTrace();
		      } catch (Exception e) {
		          //Handle errors for Class.forName
		          e.printStackTrace();
		      }
		}
				public void insertGadget(Gadget gadget) {
					
					  try {
				          //STEP 4: Execute a query
				          System.out.println("Inserting records into the table...");
				          statement = connection.createStatement();

				          String sql = "INSERT INTO GADGET "
				          		+ "(gadget_id,gadget_name,model_type,serial_number,purchase_date,warranty_date,additional_info)"
				          		+ "VALUES (" + "'" + gadget.getGadgetid() +"'"
				          		+ ", " + "'" + gadget.getGadgetname() +"'"
				          		+ ", " + "'" + gadget.getModeltype() + "'"
				          		+ ", " + "'" + gadget.getSerialnumber() + "'"
				          		+ ", " + "'" + gadget.getPurchasedate() + "'" + "," + "'" + gadget.getWarrantydate() + "'"+ ", " + "'" + gadget.getAdditionalinfo() + "'" 
						         + ")";

				          statement.executeUpdate(sql);

				          System.out.println("Inserted records into the table...");

				      } catch (SQLException se) {
				          //Handle errors for JDBC
				          se.printStackTrace();
				      } catch (Exception e) {
				          //Handle errors for Class.forName
				          e.printStackTrace();
				      }
				}
				
				public void insertModel(Model model) {
					
					  try {
				          //STEP 4: Execute a query
				          System.out.println("Inserting records into the table...");
				          statement = connection.createStatement();

				          String sql = "INSERT INTO MODEL "
				          		+ "(model_id, model_name)"
				          		+ "VALUES (" + "'" + model.getModel_id() +"'"
				          		+ ", " + "'" + model.getModel_name() +"'"
				          		+")";

				          statement.executeUpdate(sql);

				          System.out.println("Inserted records into the table...");

				      } catch (SQLException se) {
				          //Handle errors for JDBC
				          se.printStackTrace();
				      } catch (Exception e) {
				          //Handle errors for Class.forName
				          e.printStackTrace();
				      }
				}	
		public void retrieveUser(User user) {
			
			  try {
		          //STEP 4: Execute a query
		          statement = connection.createStatement();

		          String sql = "SELECT * FROM EMPLOYEE";

		          statement.executeQuery(sql);
		          ResultSet rs=statement.executeQuery(sql);
		          ResultSetMetaData rsmd = rs.getMetaData();
		          System.out.println("");
		      
		          int numberOfColumns = rsmd.getColumnCount();

		          while (rs.next()) {
		              for (int i = 1; i <= numberOfColumns; i++) {
		                if (i > 1) System.out.print(",  ");
		                String columnValue = rs.getString(i);
		                System.out.print(columnValue);
		              }
		              System.out.println("");  
		          System.out.println("Retrieved records from the table...");
		          }
		      } catch (SQLException se) {
		          //Handle errors for JDBC
		          se.printStackTrace();
		      } catch (Exception e) {
		          //Handle errors for Class.forName
		          e.printStackTrace();
		      }
		}
		
		public void retrieveGadget(Gadget gadget) {
			
			  try {
		          //STEP 4: Execute a query
		          statement = connection.createStatement();

		          String sql = "SELECT * FROM GADGET";

		          statement.executeQuery(sql);
		          ResultSet rs=statement.executeQuery(sql);
		          ResultSetMetaData rsmd = rs.getMetaData();
		          System.out.println("");
		      
		          int numberOfColumns = rsmd.getColumnCount();

		          while (rs.next()) {
		              for (int i = 1; i <= numberOfColumns; i++) {
		                if (i > 1) System.out.print(",  ");
		                String columnValue = rs.getString(i);
		                System.out.print(columnValue);
		              }
		              System.out.println("");  
		          System.out.println("Retrieved records from the table...");
		          }
		      } catch (SQLException se) {
		          //Handle errors for JDBC
		          se.printStackTrace();
		      } catch (Exception e) {
		          //Handle errors for Class.forName
		          e.printStackTrace();
		      }
		}
		public void retrieveModel(Model model) {
			
			  try {
		          //STEP 4: Execute a query
		          statement = connection.createStatement();

		          String sql = "SELECT * FROM MODEL";

		          statement.executeQuery(sql);
		          ResultSet rs=statement.executeQuery(sql);
		          ResultSetMetaData rsmd = rs.getMetaData();
		          System.out.println("");
		      
		          int numberOfColumns = rsmd.getColumnCount();

		          while (rs.next()) {
		              for (int i = 1; i <= numberOfColumns; i++) {
		                if (i > 1) System.out.print(",  ");
		                String columnValue = rs.getString(i);
		                System.out.print(columnValue);
		              }
		              System.out.println("");  
		          System.out.println("Retrieved records from the table...");
		          }
		      } catch (SQLException se) {
		          //Handle errors for JDBC
		          se.printStackTrace();
		      } catch (Exception e) {
		          //Handle errors for Class.forName
		          e.printStackTrace();
		      }
		}
		
		}
