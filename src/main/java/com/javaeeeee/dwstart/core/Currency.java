package com.javaeeeee.dwstart.core;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public enum Currency implements Serializable {

	/* 
	 * Sources:
	 * http://www.xe.com/symbols.php
	 * http://www.currency-iso.org/en/home/tables/table-a1.html
	 * http://www.panalpina.com/www/global/en/tools_resources/unit_converter/currency_codes.html
	 * http://www.jhall.demon.co.uk/currency/by_country.html
	 *  # commented lines are currencies with no exchange rate at Yahoo finance exchange service.
	 *  * commented lines are currencies that are not available at Yahoo finance exchange service.
	 */

	/********************************************************************************
	 * Elements
	 ********************************************************************************/
	USD("$", 2, "US Dollar"),
	EUR("€", 2, "EURO"),
	GBP("£", 2, "United Kingdom Pound"),
	AED("AED", 2, "United Arab Emirates Dirham"),
	//AFN("؋",2),//Afghanistan Afghani *
	ALL("Lek", 2, "Albania Lek"),
	//AMD("AMD", 2),//ARMENIA Dollar *
	ANG("ANƒ", 2, "Netherlands Antilles Guilder"),
	AOA("AOA", 2, "Angolan Kwanza"), //ANGOLA *
	ARS("AR$", 2, "Argentina Peso"),
	AUD("AU$", 2, "Australia Dollar"),
	AWG("AWƒ", 2, "Aruba Guilder"),
	//AZN("ман", 2),//Azerbaijan New Manat *
	//BAM("KM", 2),//Bosnia and Herzegovina Convertible Marka *
	BBD("BB$", 2, "Barbados Dollar"),
	BDT("BDT", 2, "Bangladesh Taka"),
	BGN("BGлв", 2, "Bulgaria Lev"),
	BHD("BHD", 3, "Bahrain Dinar"),
	BIF("BIF", 0, "Burundi Franc"),
	BMD("BM$", 2, "Bermuda Dollar"),
	BND("BN$", 2, "Brunei Darussalam Dollar"),
	BOB("$b", 2, "Bolivia Boliviano"),
	BRL("R$", 2, "Brazil Real"),
	BSD("BS$", 2, "Bahamas Dollar"),
	BTN("BTN", 2, "Bhutan Ngultrum"),
	BWP("P", 2, "Botswana Pula"),
	BYR("p.", 0, "Belarus Ruble"),
	BZD("BZ$", 2, "Belize Dollar"),
	CAD("CA$", 2, "Canada Dollar"),
	//CDF("CDF", 2),//CONGO, THE DEMOCRATIC REPUBLIC OF *
	CHF("CHF", 2, "	Switzerland Franc"),
	CLP("CL$", 0, "Chile Peso"),
	CNY("CN¥", 2, "China Yuan Renminbi"),
	COP("CO$", 2, "Colombia Peso"),
	CRC("CR₡", 2, "Costa Rica Colon"),
	CUP("CU₱", 2, "Cuba Convertible Peso"),
	CVE("CVE", 2, "Cape Verde Escudo"),
	CZK("Kč", 2, "Czech Republic Koruna"),
	DJF("DJF", 0, "Djibouti Franc"),
	DKK("DKkr", 2, "Denmark Krone"),
	DOP("RD$", 2, "Dominican Republic Peso"),
	DZD("DZD", 2, "Algeria Dinar"),
	//EEK("EEkr", 2),// Estonian Kroon #
	EGP("EG£", 2, "Egypt Pound"),
	//ERN("ERN", 2),//Eritrea Nakfa #
	ETB("ETB", 2, "Ethiopia Birr"),
	FJD("FJ$", 2, "Fiji Dollar"),
	FKP("FK£", 2, "Falkland Islands Pound"),
	//GEL("GEL", 2),//GEORGIA *
	//GGP("GG£", 2),//Guernsey Pound *
	//GHC("¢", 2),//Ghanian Cedi #
	GIP("GI£", 2, "Gibraltar Pound"),
	GMD("GMD", 2, "Gambia Dalasi"),
	GNF("GNF", 0, "Guinea Franc"),
	GTQ("Q", 2, "Guatemala Quetzal"),
	GYD("GY$", 2, "Guyana Dollar"),
	HKD("HK$", 2, "Hong Kong Dollar"),
	HNL("HNL", 2, "Honduras Lempira"),
	HRK("kn", 2, "Croatia Kuna"),
	HTG("HTG", 2, "Haiti Gourde"),
	HUF("Ft", 2, "Hungary Forint"),
	IDR("Rp", 2, "Indonesia Rupiah"),
	ILS("₪", 2, "Israel Shekel"),
	//IMP("IM£", 2),//Isle of Man Pound *
	INR("₹", 2, "India Rupee"),
	IQD("IQD", 3, "Iraq Dinar"),
	IRR("IR﷼", 2, "Iran Rial"),
	ISK("ISkr", 0, "Iceland Krona"),
	//JEP("JE£", 2),//Jersey Pound *
	JMD("J$", 2, "Jamaica Dollar"),
	JOD("JOD", 3, "Jordan Dinar"),
	JPY("JP¥", 0, "Japan Yen"),
	KES("KES", 2, "Kenya Shilling"),
	//KGS("KGлв", 2),//Kyrgyzstan Som *
	KHR("KHR៛", 2, "Cambodia Riel"),
	KMF("KMF", 0, "Comoros Franc"),
	KPW("KP₩", 2, "Korea (North) Won"),
	KRW("KR₩", 0, "Korea (South) Won"),
	KWD("KWD", 3, "Kuwait Dinar"),
	//KYD("KY$", 2),//Cayman Islands Dollar #
	KZT("KZлв", 2, "Kazakhstan Tenge"),
	LAK("₭", 2, "Laos Kip"),
	LBP("LB£", 2, "Lebanon Pound"),
	LKR("LK₨", 2, "Sri Lanka Rupee"),
	LRD("LR$", 2, "Liberia Dollar"),
	LTL("Lt", 2, "Lithuanian litas"),
	LVL("Ls", 2, "Latvian Lat "),
	LYD("LYD", 3, "Libya Dinar"),
	MAD("MAD", 2, "Morocco Dirham"),
	MDL("MDL", 2, "Moldova Leu"),
	//MGA("MGA", 2),//MADAGASCAR *
	MKD("ден", 2, "Macedonia Denar"),
	MMK("MMK", 2, "Myanmar (Burma) Kyat"),
	MNT("₮", 2, "Mongolia Tughrik"),
	MOP("MOP", 2, "Macau Pataca"),
	MRO("MRO", 2, "Mauritania Ouguiya"),
	MUR("MU₨", 2, "Mauritius Rupee"),
	MVR("MVR", 2, "Maldives Rufiyaa"),
	MWK("MWK", 2, "Malawi Kwacha"),
	MXN("MX$", 2, "Mexico Peso"),
	MYR("RM", 2, "Malaysia Ringgit"),
	//MZN("MT", 2),//Mozambique Metical *
	NAD("NA$", 2, "Namibia Dollar"),
	NGN("₦", 2, "Nigeria Naira"),
	NIO("C$", 2, "Nicaragua Cordoba"),
	NOK("NOkr", 2, "Norway Krone"),
	NPR("NP₨", 2, "Nepal Rupee"),
	NZD("NZ$", 2, "New Zealand Dollar"),
	OMR("OM﷼", 3, "Oman Rial"),
	PAB("B/.", 2, "Panama Balboa"),
	PEN("S/.", 2, "Peru Nuevo Sol"),
	PGK("PGK", 2, "Papua New Guinea Kina"),
	PHP("PH₱", 2, "Philippines Peso"),
	PKR("PK₨", 2, "Pakistan Rupee"),
	PLN("zł", 2, "Poland Zloty"),
	PYG("Gs", 0, "Paraguay Guarani"),
	QAR("QA﷼", 2, "Qatar Riyal"),
	RON("lei", 2, "Romania New Leu"),
	//RSD("Дин.", 2),//Serbia Dinar *
	RUB("руб", 2, "Russia Ruble"),
	RWF("RWF", 0, "Rwanda Franc"),
	SAR("SA﷼", 2, "Saudi Arabia Riyal"),
	SBD("SB$", 2, "Solomon Islands Dollar"),
	SCR("SC₨", 2, "Seychelles Rupee"),
	SDG("SDG", 2, "Sudan Pound"),
	SEK("SEkr", 2, "Sweden Krona"),
	SGD("SG$", 2, "Singapore Dollar"),
	SHP("SH£", 2, "Saint Helena Pound"),
	SLL("SLL", 2, "Sierra Leone Leone"),
	SOS("S", 2, "Somalia Shilling"),
	//SRD("SR$", 2),//Suriname Dollar *
	STD("STD", 2, "São Tomé & Príncipe Dobra"),
	SVC("SV$", 2, "El Salvador Colon"),
	SYP("SY£", 2, "Syria Pound"),
	SZL("SZL", 2, "Swaziland Lilangeni"),
	THB("฿", 2, "Thailand Baht"),
	//TJS("TJS", 2),//TAJIKISTAN *
	//TMT("TMT", 2),//TURKMENISTAN *
	TND("TND", 3, "Tunisia Dinar"),
	TOP("TOP", 2, "Tonga Pa'anga"),
	TRY("₤", 2, "Turkey Lira"),
	TTD("TT$", 2, "Trinidad & Tobago Dollar"),
	//TVD("TV$", 2),//Tuvalu Dollar *
	TWD("NT$", 0, "Taiwan New Dollar"),
	TZS("TZS", 2, "Tanzania Shilling"),
	UAH("₴", 2, "Ukraine Hryvnia"),
	UGX("UGX", 2, "Uganda Shilling"),
	UYU("$U", 2, "Uruguay Peso"),
	//UZS("UZлв", 2),//Uzbekistan Som *
	VEF("Bs", 2, "Venezuela Bolivar"),
	VND("₫", 0, "Viet Nam Dong"),
	VUV("VUV", 0, "Vanuatu Vatu"),
	XAF("XAF", 0, "Central African CFA Franc BEAC"), //CFA Franc (BEAC) #
	XCD("XC$", 2, "East Caribbean Dollar"),
	XOF("XOF", 0, "Central African CFA Franc BCEAO"), //CFA Franc (BCEAO) #
	XPF("XPF", 0, "French Pacific Franc"),
	YER("YE﷼", 2, "Yemen Rial"),
	ZAR("R", 2, "South Africa Rand");
	//ZMK("ZMK", 2) // Not supported by Yahoo!
	//ZWD("Z$", 2);//Zimbabwe dollar #

	/********************************************************************************
	 * Constants
	 ********************************************************************************/
	public static final Currency DEFAULT = USD;

	/********************************************************************************
	 * Fields
	 ********************************************************************************/
	public String symbol;
	public int decimalPlaces;
	public String fullName;

	public final static String CURRENCY_REGEX = "[A-Z]{3}|[$€£]{1}";//for Matcher.find() use
	public static final List<Currency> MAIN_CURRENCIES = new ArrayList<Currency>() {
		{
			add(USD);
			add(EUR);
			add(GBP);
			add(HKD);
			add(JPY);
			add(CNY);
		}
	};
	public static final List<Currency> OTHER_CURRENCIES = new ArrayList<Currency>() {
		{
			addAll(Arrays.asList(values()));
			removeAll(MAIN_CURRENCIES);
		}
	};

	/********************************************************************************
	 * Constructors
	 ********************************************************************************/
	/**
	 * If currency symbol shared between two or more countries we add two letters country code before it
	 */
	Currency(String symbol, int decimalPlaces, String name) {
		this.symbol = symbol;
		this.decimalPlaces = decimalPlaces;
		this.fullName = name;
	}

	/********************************************************************************
	 * Methods
	 ********************************************************************************/

//	public double round(double amount) {
//		return TNumberUtil.round(amount, this.decimalPlaces);
//	}

	@Override
	public String toString() {
		return this.name();
	}

	public static Currency valueOfIgnoreCase(String currencyS) throws IllegalArgumentException {
		if (currencyS == null || currencyS.isEmpty()) {
			return null;
		}

		for (Currency currency : Currency.values()) {
			if (currency.name().equalsIgnoreCase(currencyS) || currency.symbol.equalsIgnoreCase(currencyS)) {
				return currency;
			}
		}
		throw new IllegalArgumentException("Not recognized currency :" + currencyS);
	}
}