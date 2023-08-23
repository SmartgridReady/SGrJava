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

import com.smartgridready.ns.v0.CtaDomHotWOpModeType;
import com.smartgridready.ns.v0.CtaHPOpModeType;
import com.smartgridready.ns.v0.CtaHPOpStateType;
import com.smartgridready.ns.v0.HovBufferStateType;
import com.smartgridready.ns.v0.HovDomHotWOpModeType;
import com.smartgridready.ns.v0.HovDomHotWStateType;
import com.smartgridready.ns.v0.HovHCOpModeType;
import com.smartgridready.ns.v0.HovHCOpStateType;
import com.smartgridready.ns.v0.HovHPOpModeType;
import com.smartgridready.ns.v0.HovHPOpStateType;
import com.smartgridready.ns.v0.HovSGReadySrcSelType;
import com.smartgridready.ns.v0.SGReadyStateLv1Type;
import com.smartgridready.ns.v0.SGReadyStateLv2Type;
import com.smartgridready.ns.v0.SGrEVSEStateLv2Type;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.DataTypeType;
import com.smartgridready.ns.v0.SGrHCOpModeType;
import com.smartgridready.ns.v0.SGrHPOpModeType;
import com.smartgridready.ns.v0.SGrMeasValueSourceType;
import com.smartgridready.ns.v0.SGrOCPPStateType;
import com.smartgridready.ns.v0.SGrObligLvlType;
import com.smartgridready.ns.v0.SGrPowerSourceType;
import com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPServiceType;
import com.smartgridready.ns.v0.SGrSunspStateCodesType;
import com.smartgridready.ns.v0.V0Factory;

import java.math.BigInteger;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class GenType2StringConversion {
	
	private GenType2StringConversion() {
		// utility class
	}
	
	public static String[] format(DataTypeType[] dGenTypeArr) {
		
		List<String> retval = new ArrayList<>();
		Arrays.asList(dGenTypeArr).forEach(val -> retval.add(format(val)));
		return retval.toArray(new String[0]);						
	}
	
	
	public static String format(DataTypeType dGenType) {
		
		final Locale locale = Locale.getDefault();
		
		if (dGenType == null) {
			return "-";
		}

		String retval;
		if (dGenType.isSetBoolean()) {
			retval = String.format("%b", dGenType.isBoolean());
		} else if (dGenType.getEnum() != null) {
			SGrEnumListType eVal = dGenType.getEnum();
			retval = enum2StringConversion(eVal);
		} else if (dGenType.isSetFloat32()) {
			float fVal = dGenType.getFloat32();
			retval = String.format(locale, "%10.3f", fVal);
		} else if (dGenType.isSetFloat64()) {
			double dVal = dGenType.getFloat64();
			retval = String.format(locale, "%10.3f", dVal);
		} else if (dGenType.isSetInt8()){
			byte bVal = dGenType.getInt8();
			retval = String.format(locale, "%d", bVal);
		} else if (dGenType.isSetInt16()) {
			short shVal = dGenType.getInt16();
			retval = String.format(locale, "%d", shVal);
		} else if (dGenType.isSetInt8U()) {
			short shVal = dGenType.getInt8U();
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

	public static DataTypeType[] format(String[] values, DataTypeType dGenType) {

		List<DataTypeType> retval = new ArrayList<>();
		Arrays.stream(values).forEach(val -> retval.add(format(val, dGenType)));
		return retval.toArray(new DataTypeType[0]);
	}

	public static DataTypeType format(String value, final DataTypeType dGenType) {

		DataTypeType retval = V0Factory.eINSTANCE.createDataTypeType();

		if (dGenType.isSetBoolean()) {
			retval.setBoolean(value.equals("true") || value.equals("TRUE"));
		}else if (dGenType.isSetFloat32()) {
			float fVal;
			fVal = Float.parseFloat(value);
			retval.setFloat32(fVal);
		} else if (dGenType.isSetFloat64()) {
			double dVal;
			dVal = Double.parseDouble(value);
			retval.setFloat64(dVal);
		} else if (dGenType.isSetInt16()) {
			short shVal;
			shVal = Short.parseShort(value);
			retval.setInt16(shVal);
		} else if (dGenType.isSetInt16U()) {
			int iVal;
			iVal = Integer.parseInt(value);
			retval.setInt16U(iVal);
		} else if (dGenType.getInt32() != null) {
			BigInteger bgVal = new BigInteger(value);
			retval.setInt32(bgVal);
		} else if (dGenType.isSetInt32U()) {
			long lVal = Long.parseLong(value);
			retval.setInt32U(lVal);
		} else if (dGenType.isSetInt64()) {
			long lVal = Long.parseLong(value);
			retval.setInt64(lVal);
		} else if (dGenType.getInt64U() != null) {
			// TODO:HF? SGrBasicGenDataPointTypeType, isSetInt64U Funktion wurde vom Modeler
			// nicht generiert
			BigInteger bgVal1 = new BigInteger(value);
			retval.setInt64U(bgVal1);
		} else if (dGenType.isSetInt8()) {
			byte btVal;
			btVal = Byte.parseByte(value);
			retval.setInt8(btVal);
		} else if (dGenType.isSetInt8U()) {
			Short shVal = Short.parseShort(value);
			retval.setInt8U(shVal);
		} else if (dGenType.getDateTime() != null) {
			// TODO:HF? apply gregorian calendar library
			// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
			// apply dGenType
		} else if (dGenType.getString() != null) {
			// TODO:HF? parameter conversion into GDType dGenType
			//  dGenType = GenType2StringConversion.format(sValue, dGenType); ?
			retval.setString(value);
		} else if (dGenType.getEnum() != null) {
			retval.setEnum(string2EnumConversion(value, dGenType.getEnum()));
		} else { // error handling
			throw new IllegalArgumentException("Unhandled generic type given for String to SGrBasicGenDataPointTypeType conversion.");
		}
		return retval;
	}

	public static String enum2StringConversion(SGrEnumListType oGenVal) {
		String rval;

		// TODO HF add additional enums according CBTest
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
		} else if (oGenVal.isSetSgrOCPPState()) {// E0015
			rval = oGenVal.getSgrOCPPState().toString();
		} else if (oGenVal.isSetSgrHPOpMode() ) {// E0016
			rval = oGenVal.getSgrHPOpMode().toString();
		} else if (oGenVal.isSetSgrHCOpMode() ) {// E0017
			rval = oGenVal.getSgrHCOpMode().toString();         
		} else if (oGenVal.isSetCtaDomHotWOpMode()) {// Ecta001
			rval = oGenVal.getCtaDomHotWOpMode().toString();
		} else if (oGenVal.isSetCtaHPOpMode()) {// Ecta003
			rval = oGenVal.getCtaHPOpMode().toString();
		} else if (oGenVal.isSetCtaHPOpState()) {// Ecta002
			rval = oGenVal.getCtaHPOpState().toString();
		} else if (oGenVal.isSetHovHPOpMode()) {// hov001
			rval = oGenVal.getHovHPOpMode().toString();
		} else if (oGenVal.isSetHovHCOpMode()) {// hov002
			rval = oGenVal.getHovHCOpMode().toString();
		} else if (oGenVal.isSetHovSGReadySrcSel()) {// hov003
			rval = oGenVal.getHovSGReadySrcSel().toString();
		} else if (oGenVal.isSetHovBufferState()) {// hov004
			rval = oGenVal.getHovBufferState().toString();
		} else if (oGenVal.isSetHovHCOpState()) {// hov005
			rval = oGenVal.getHovHCOpState().toString();
		} else if (oGenVal.isSetHovDomHotWState()) {// hov006
			rval = oGenVal.getHovDomHotWState().toString();
		} else if (oGenVal.isSetHovDomHotWOpMode()) {// E007
			rval = oGenVal.getHovDomHotWOpMode().toString();  
		} else if (oGenVal.isSetCtaHPOpState()) {// hov008
			rval = oGenVal.getHovHPOpState().toString();
		} else {
			throw new IllegalArgumentException("Given SGrEnumListType is not set OR not handled by the current implementation.");
		}
		return rval;
	}

	public static SGrEnumListType string2EnumConversion(String val, SGrEnumListType oGenVal) {

		SGrEnumListType rval = V0Factory.eINSTANCE.createSGrEnumListType();

		// TODO HF add additional enums according CBTest
		// Ongoing: extend this list manually for EACH enumeration being added to
		// the system
		if (oGenVal.isSetSgrMeasValueSource()) { // E0001
			rval.setSgrMeasValueSource(SGrMeasValueSourceType.getByName(val));
		} else if (oGenVal.isSetSgrPowerSource()) { // E0002
			rval.setSgrPowerSource(SGrPowerSourceType.getByName(val));
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0003
			rval.setSgreadyStateLv2(SGReadyStateLv2Type.getByName(val));
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0004
			rval.setSgreadyStateLv1(SGReadyStateLv1Type.getByName(val));
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0005
			rval.setSgrSunspStateCodes(SGrSunspStateCodesType.getByName(val));
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0006
			rval.setSgrEVSEStateLv2(SGrEVSEStateLv2Type.getByName(val));
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0007
			rval.setSgreadyStateLv1(SGReadyStateLv1Type.getByName(val));
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E0008
			rval.setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type.getByName(val));
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0009
			rval.setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type.getByName(val));
		} else if (oGenVal.isSetSgrEVState()) { // E0010
			rval.setSgrEVState(SGrEVStateType.getByName(val));
		} else if (oGenVal.isSetSgrSGCPService()) { // E0011
			rval.setSgrSGCPService(SGrSGCPServiceType.getByName(val));
		} else if (oGenVal.isSetSgrObligLvl()) { // E0012
			rval.setSgrObligLvl(SGrObligLvlType.getByName(val));
		} else if (oGenVal.isSetSgrOCPPState()) {// E0013
			rval.setSgrOCPPState(SGrOCPPStateType.getByName(val));
		} else if (oGenVal.isSetSgrHPOpMode()) {// E0014
			rval.setSgrHPOpMode(SGrHPOpModeType.getByName(val));
		} else if (oGenVal.isSetSgrOCPPState()) {// E0015
			rval.setSgrOCPPState(SGrOCPPStateType.getByName(val));
		} else if (oGenVal.isSetSgrHPOpMode() ) {// E0016
			rval.setSgrHPOpMode(SGrHPOpModeType.getByName(val));
		} else if (oGenVal.isSetSgrHCOpMode() ) {// E0017
			rval.setSgrHCOpMode(SGrHCOpModeType.getByName(val));
		} else if (oGenVal.isSetCtaDomHotWOpMode()) {// Ecta001
			rval.setCtaDomHotWOpMode(CtaDomHotWOpModeType.getByName(val));
		} else if (oGenVal.isSetCtaHPOpMode()) {// Ecta003
			rval.setCtaHPOpMode(CtaHPOpModeType.getByName(val));
		} else if (oGenVal.isSetCtaHPOpState()) {// Ecta002
			rval.setCtaHPOpState(CtaHPOpStateType.getByName(val));
		} else if (oGenVal.isSetHovHPOpMode()) {// hov001
			rval.setHovHPOpMode(HovHPOpModeType.getByName(val));
		} else if (oGenVal.isSetHovHCOpMode()) {// hov002
			rval.setHovHCOpMode(HovHCOpModeType.getByName(val));
		} else if (oGenVal.isSetHovSGReadySrcSel()) {// hov003
			rval.setHovSGReadySrcSel(HovSGReadySrcSelType.getByName(val));
		} else if (oGenVal.isSetHovBufferState()) {// hov004
			rval.setHovBufferState(HovBufferStateType.getByName(val));
		} else if (oGenVal.isSetHovHCOpState()) {// hov005
			rval.setHovHCOpState(HovHCOpStateType.getByName(val));
		} else if (oGenVal.isSetHovDomHotWState()) {// hov006
			rval.setHovDomHotWState(HovDomHotWStateType.getByName(val));
		} else if (oGenVal.isSetHovDomHotWOpMode()) {// Ehov007
			rval.setHovDomHotWOpMode(HovDomHotWOpModeType.getByName(val));
		} else if (oGenVal.isSetHovHPOpState()) {// hov008			
			rval.setHovHPOpState(HovHPOpStateType.getByName(val));
			
		} else {
			throw new IllegalArgumentException("Given SGrEnumListType is not set OR not handled by the current implementation.");
		}
		return rval;
	}
}
