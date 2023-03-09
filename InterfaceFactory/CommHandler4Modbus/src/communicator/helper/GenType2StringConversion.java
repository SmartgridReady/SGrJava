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
import communicator.common.runtime.GenDriverException;

public class GenType2StringConversion {
	
	private GenType2StringConversion() {
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
				retval = enum2StringConversion(en);
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
		} else {
			throw new IllegalArgumentException("Unhandled generic type given for SGrBasicGenDataPointTypeType to String conversion.");
		}
		
		return retval;
	}

	public static SGrBasicGenDataPointTypeType format(String value, SGrBasicGenDataPointTypeType dGenType) {

		if (dGenType.isSetBoolean()) {
			boolean bVal = false;
			if (value.equals("true") || value.equals("TRUE")) {
				bVal = true;
			}
			dGenType.setBoolean(bVal);
		}
		/*
		 * else if (dGenType.eIsSet(enum) { // TODO: SGrBasicGenDataPointTypeType, apply
		 * SGrEnumListType family of enumerationss inDpTT.setEnum(0); }
		 */
		else if (dGenType.isSetFloat32()) {
			float fVal;
			fVal = Float.parseFloat(value);
			dGenType.setFloat32(fVal);
			dGenType.setFloat32(fVal);
		} else if (dGenType.isSetFloat64()) {
			double dVal;
			dVal = Double.parseDouble(value);
			dGenType.setFloat64(dVal);
		} else if (dGenType.isSetInt16()) {
			short shVal;
			shVal = Short.parseShort(value);
			dGenType.setInt16(shVal);
		} else if (dGenType.isSetInt16U()) {
			int iVal;
			iVal = Integer.parseInt(value);
			dGenType.setInt16U(iVal);
		} else if (dGenType.getInt32() != null) {
			BigInteger bgVal = new BigInteger(value);
			dGenType.setInt32(bgVal);
		} else if (dGenType.isSetInt32U()) {
			long lVal = Long.parseLong(value);
			dGenType.setInt32U(lVal);
		} else if (dGenType.isSetInt64()) {
			long lVal = Long.parseLong(value);
			dGenType.setInt64(lVal);
		} else if (dGenType.getInt64U() != null) {
			// TODO: SGrBasicGenDataPointTypeType, isSetInt64U Funktion wurde vom Modeler
			// nicht generiert
			BigInteger bgVal1 = new BigInteger(value);
			dGenType.setInt64U(bgVal1);
		} else if (dGenType.isSetInt8()) {
			byte btVal;
			btVal = Byte.parseByte(value);
			dGenType.setInt8(btVal);
		} else if (dGenType.isSetInt8U()) {
			Short shVal = Short.parseShort(value);
			dGenType.setInt8U(shVal);
		} else if (dGenType.getDateTime() != null) {
			// TODO: apply gregorian calendar library
			// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
			// TODO: apply dGenType
		} else if (dGenType.getString() != null) {
			// TODO:parameter conversion
			value = String.format("TODO:parameter conversion");
			dGenType.setString(value);
		} else { // error handling
			throw new IllegalArgumentException("Unhandled generic type given for String to SGrBasicGenDataPointTypeType conversion.");
		}
		return dGenType;
	}

	public static String enum2StringConversion(SGrEnumListType oGenVal) {
		String rval = "-";

		// Ongoing: extend this list manually for EACH enumeration being added to
		// the system
		if (oGenVal.isSetSgrMeasValueSource()) { // E0001
			rval = oGenVal.getSgrMeasValueSource().toString();
		} else if (oGenVal.isSetSgrPowerSource()) { // E0002
			rval = oGenVal.getSgrPowerSource().toString();
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0003
			rval = oGenVal.getSgreadyStateLv2().toString();
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0004
			rval = oGenVal.getSgreadyStateLv1().toString();
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0005
			rval = oGenVal.getSgrSunspStateCodes().toString();
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0006
			rval = oGenVal.getSgrEVSEStateLv2().toString();
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0007
			rval = oGenVal.getSgrEVSEStateLv1().toString();
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E0008
			rval = oGenVal.getSgrSGCPLoadStateLv2().toString();
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0009
			rval = oGenVal.getSgrSGCPFeedInStateLv2().toString();
		} else if (oGenVal.isSetSgrEVState()) { // E0010
			rval = oGenVal.getSgrEVState().toString();
		} else if (oGenVal.isSetSgrSGCPService()) { // E0011
			rval = oGenVal.getSgrSGCPService().toString();
		} else if (oGenVal.isSetSgrObligLvl()) { // E0012
			rval = oGenVal.getSgrObligLvl().toString();
		} else if (oGenVal.isSetSgrOCPPState()) {// E0013
			rval = oGenVal.getSgrOCPPState().toString();
		} else if (oGenVal.isSetSgrHPOpMode()) {// E0014
			rval = oGenVal.getSgrHPOpMode().toString();
		}

		return rval;
	}
}
