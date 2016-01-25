package org.gradle;
import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.gradle.AssetmanagementConfiguration;
import org.gradle.UserResource;
import org.skife.jdbi.v2.DBI;

public class AssetmanagementApplication extends Application<AssetmanagementConfiguration> {
	@Override
	public void initialize(Bootstrap<AssetmanagementConfiguration> bootstrap) {
		bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "home2.html"));
	}

	@Override
	public void run(AssetmanagementConfiguration configuration, Environment environment) throws Exception {
		
	    final DBIFactory factory = new DBIFactory();
	    final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "h2");
	    final UserDAO dao = jdbi.onDemand(UserDAO.class);
		dao.createUser();
		dao.createGadget();
		dao.createModel();
		environment.jersey().register(new UserResource(dao));
		environment.jersey().register(new GadgetResource(dao));
		environment.jersey().register(new ModelResource(dao));
	}
	
	public static void main(String[] args) throws Exception {
		new AssetmanagementApplication().run(args);
	}
}
