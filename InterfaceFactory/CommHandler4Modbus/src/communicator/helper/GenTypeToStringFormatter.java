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
