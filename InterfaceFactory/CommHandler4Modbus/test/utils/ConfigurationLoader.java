package utils;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class ConfigurationLoader<C> {
	
	public C load ( String aConfigFilePath, Class<?> aConfigClass ) throws Exception {
		
		Path configPath = Paths.get(aConfigFilePath);
		//At first, construct Constructor object using Config.class root object of contents.
		Constructor constructor = new Constructor(aConfigClass);
		//Construct Yaml object with constructor object.
		Yaml yaml = new Yaml(constructor);
		//And then load by given Stream object specified of config.yml file.
		return yaml.load(new FileInputStream(configPath.toFile()));		
	}

}
