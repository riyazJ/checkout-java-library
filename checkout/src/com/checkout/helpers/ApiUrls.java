package com.checkout.helpers;

public class ApiUrls {

	
	public static final String PAYMENT_TOKENS = String.format(AppSettings.baseApiUrl, "tokens/payment");
	
	public static final String CUSTOMERS = String.format(AppSettings.baseApiUrl, "customers");
	public static final String CUSTOMER = String.format(AppSettings.baseApiUrl, "customers/%s");
	
	public static final String CARDS=String.format(AppSettings.baseApiUrl,"customers/%s/cards");
	public static final String CARD=String.format(AppSettings.baseApiUrl,"customers/%s/cards/%s");
	
	public static final String CHARGES = String.format(AppSettings.baseApiUrl, "charges");
	public static final String CHARGE=String.format(AppSettings.baseApiUrl,"charges/%s");
	public static final String CARD_CHARGE = String.format(AppSettings.baseApiUrl, "charges/card");
	public static final String DEFAULT_CARD_CHARGE = String.format(AppSettings.baseApiUrl, "charges/customer");
	public static final String CARD_TOKEN_CHARGE = String.format(AppSettings.baseApiUrl, "charges/token");
	public static final String REFUND_CHARGE=String.format(AppSettings.baseApiUrl,"charges/%s/refund");
	public static final String CAPTURE_CHARGE=String.format(AppSettings.baseApiUrl,"charges/%s/capture");
	public static final String VOID_CHARGE=String.format(AppSettings.baseApiUrl,"charges/%s/void");

}
