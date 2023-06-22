/**
Copyright(c) 2022 Verein SmartGridready Switzerland

This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from
this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package communicator.modbus.helper;

import java.lang.reflect.InvocationTargetException;

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
			Object instance = clazz.getDeclaredConstructor().newInstance();
			if (instance instanceof GenDriverAPI4Modbus) {
				return (GenDriverAPI4Modbus) instance;				
			}
			else {
				throw new GenDriverException("Given class " + aClassName + " does not implement " + GenDriverAPI4Modbus.class.getName() );
			}
		} catch (Exception e) {
			throw new GenDriverException("Unable to instantiate modbus driver.", e);
		}			
	}

}
