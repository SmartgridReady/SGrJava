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

package communicator.helper;

import java.math.BigInteger;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrEnumListType;

public class GenTypeToStringFormatter {		
	
	private GenTypeToStringFormatter() {
		// utility class
	}
	
	public static String[] format(SGrBasicGenDataPointTypeType[] dGenTypeArr) {
		
		List<String> retval = new ArrayList<>();
		Arrays.asList(dGenTypeArr).forEach(val -> retval.add(format(val)));
		return retval.toArray(new String[0]);						
}
	
	
	public static String format(SGrBasicGenDataPointTypeType dGenType) {
		
		final Locale locale = Locale.getDefault();
		
		if (dGenType == null) {
			return "-";
		}
		
		String retval = String.format("GenTypeToStringFormatter: data type not yet supported%n");
		
		if (dGenType.isSetBoolean()) {
			retval = String.format("%b", dGenType.isBoolean());
		} else if (dGenType.getEnum() != null) {
			SGrEnumListType oVal = dGenType.getEnum();
			if (oVal.isSetSgrEVState()) {
				SGrEnumListType en = dGenType.getEnum();
				retval = ModbusHlpr.enum2StringConversion(en);
			}			
		} else if (dGenType.isSetFloat32()) {
			float fVal = dGenType.getFloat32();
			retval = String.format(locale, "%10.3f", fVal);
		} else if (dGenType.isSetFloat64()) {
			double dVal = dGenType.getFloat64();
			retval = String.format(locale,"%10.3f", dVal);
		} else if (dGenType.isSetInt16()) {
			short shVal = dGenType.getInt16();
			retval = String.format(locale, "%d", shVal);
		} else if (dGenType.isSetInt16U()) {
			int iVal = dGenType.getInt16U();
			retval = String.format(locale, "%d", iVal);
		} else if (dGenType.getInt32() != null) {
			BigInteger bgVal = dGenType.getInt32();
			retval = String.format(bgVal.toString());
		} else if (dGenType.isSetInt32U()) {
			long lVal = dGenType.getInt32U();
			retval = String.format(locale, "%d", lVal);
		} else if (dGenType.isSetInt64()) {
			long lVal = dGenType.getInt64();
			retval = String.format(locale, "%d", lVal);
		} else if (dGenType.getInt64U() != null) {
			BigInteger bgVal = dGenType.getInt64U();
			retval = String.format(locale, "%d", bgVal);
		} else if (dGenType.isSetInt8()) {
			byte btVal = dGenType.getInt8();
			retval = String.format(locale, "%d", btVal);
		} else if (dGenType.isSetInt8U()) {
			short shVal = dGenType.getInt8U();
			retval = String.format(locale, "%d", shVal);
		} else if (dGenType.getString() != null) {
			retval = dGenType.getString();
		} else if (dGenType.getDateTime() != null) {			
			Date date = dGenType.getDateTime().toGregorianCalendar().getTime();			
			retval = DateTimeFormatter.ISO_DATE_TIME.format(date.toInstant());
		}		
		
		return retval;
	}
}
