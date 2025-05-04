package libtest;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
//import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;

public class libphonne {
	public static void main(String[] args) {
		
		String swissNumberStr = "+19203436205";
		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		try {
		  PhoneNumber swissNumberProto = phoneUtil.parse(swissNumberStr, "");
		  System.out.println("Country Code: " + swissNumberProto.getCountryCode());
		  System.out.println("National Number: "+swissNumberProto.getNationalNumber());
		  System.out.println("CarrierCode: "+swissNumberProto.getPreferredDomesticCarrierCode());
		  System.out.println("leading zero: " + swissNumberProto.getNumberOfLeadingZeros());
		  System.out.println("getCountryCodeSource : " + swissNumberProto.getCountryCodeSource());
		  
		} catch (NumberParseException e) {
		  System.err.println("NumberParseException was thrown: " + e.toString());
		}
	}
}
