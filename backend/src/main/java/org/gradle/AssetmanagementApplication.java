package org.gradle;
import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.gradle.AssetmanagementConfiguration;
import org.gradle.UserResource;

public class AssetmanagementApplication extends Application<AssetmanagementConfiguration> {
	@Override
	public void initialize(Bootstrap<AssetmanagementConfiguration> bootstrap) {
		bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "home2.html"));
	}

	@Override
	public void run(AssetmanagementConfiguration configuration, Environment environment) throws Exception {
		environment.jersey().register(new UserResource());
	}
	
	public static void main(String[] args) throws Exception {
		new AssetmanagementApplication().run(args);
	}
}
