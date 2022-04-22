package utils;

import java.util.Collection;

public class TestConfiguration {
	
	public static class Description {
		public String file;
		public String type;
	}

	private String deviceDescFolder;
	
	private Collection<Description> descriptions;

	public String getDeviceDescFolder() {
		return deviceDescFolder;
	}

	public void setDeviceDescFolder(String deviceDescFolder) {
		this.deviceDescFolder = deviceDescFolder;
	}

	public Collection<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(Collection<Description> descriptions) {
		this.descriptions = descriptions;
	}	
}
