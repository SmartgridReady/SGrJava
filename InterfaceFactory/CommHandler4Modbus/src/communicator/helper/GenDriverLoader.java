package communicator.helper;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;

public class GenDriverLoader {
	
	public static GenDriverAPI4Modbus loadDriver(String aClassName) throws GenDriverException  
	{ 
		Class<?> clazz;
		try {
			clazz = Class.forName(aClassName);
		} catch (ClassNotFoundException e1) {
			throw new GenDriverException("Unable to find/load class with name: " + aClassName, e1);		
		}
	
		try {
			Object instance = clazz.newInstance();
			if (instance instanceof GenDriverAPI4Modbus) {
				return (GenDriverAPI4Modbus) instance;				
			}
			else {
				throw new GenDriverException("Given class " + aClassName + " does not implement " + GenDriverAPI4Modbus.class.getName() );
			}
		} catch (InstantiationException | IllegalAccessException e) {
			throw new GenDriverException("Unable to instantiate modbus driver.", e);
		}				
	}

}
