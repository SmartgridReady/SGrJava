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

package communicator.rest.http.client;

import com.smartgridready.ns.v0.HeaderEntry;
import com.smartgridready.ns.v0.RestApiServiceCall;
import org.eclipse.emf.common.util.EList;

public class RestServiceClientUtils {
	
	private RestServiceClientUtils() { throw new IllegalAccessError("Utility class"); }
	
	public static String printServiceCall(RestApiServiceCall restServiceCall) {
		
		StringBuilder sb = new StringBuilder();

		if (restServiceCall != null) {
			sb.append(String.format("%nRequest method: %s%n", restServiceCall.getRequestMethod() != null ? restServiceCall.getRequestMethod().getName() : "n.a"));
			sb.append(String.format("Request path:   %s%n", restServiceCall.getRequestPath()));
			sb.append(String.format("Headers: %s%n", restServiceCall.getRequestHeader() != null ? printHeaders( restServiceCall.getRequestHeader().getHeader()) : "n.a"));
			sb.append(String.format("Request body:   %s%n", restServiceCall.getRequestBody()));
		}
		return sb.toString();		
	}
	
	private static String printHeaders(EList<HeaderEntry> headers) {
		StringBuilder sb = new StringBuilder();
		headers.forEach( headerEntry -> sb.append(String.format("\t%s : %s%n", headerEntry.getHeaderName(), headerEntry.getValue())));
		return sb.toString();
	}
}
