package com.javaeeeee.dwstart.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.DateFormatter;



public enum Country implements Serializable {
	AF("AFG", 4, "Afghanistan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +430),
	AX("ALA", 248, "Aland Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	AL("ALB", 8, "Albania", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	DZ("DZA", 12, "Algeria", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	AS("ASM", 16, "American Samoa", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -1100),
	AD("AND", 20, "Andorra", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	AO("AGO", 24, "Angola", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	AI("AIA", 660, "Anguilla", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	//AQ("ATA", 10, "Antarctica","" , Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true),
	AG("ATG", 28, "Antigua and Barbuda", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	AR("ARG", 32, "Argentina", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -300),
	AM("ARM", 51, "Armenia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +400),
	AW("ABW", 533, "Aruba", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	AU("AUS", 36, "Australia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +700), //have +500, +630, +700, +800 
	AT("AUT", 40, "Austria", "", Language.de, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	AZ("AZE", 31, "Azerbaijan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +400),
	BS("BHS", 44, "Bahamas", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -500),
	BH("BHR", 48, "Bahrain", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	BD("BGD", 50, "Bangladesh", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +600),
	BB("BRB", 52, "Barbados", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	BY("BLR", 112, "Belarus", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +300),
	BE("BEL", 56, "Belgium", "", Language.fr, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100), //there is also summer time!
	BZ("BLZ", 84, "Belize", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -600),
	BJ("BEN", 204, "Benin", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	BM("BMU", 60, "Bermuda", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	BT("BTN", 64, "Bhutan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +600),
	BO("BOL", 68, "Bolivia", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -400),
	BA("BIH", 70, "Bosnia and Herzegovina", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	BW("BWA", 72, "Botswana", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	BV("BVT", 74, "Bouvet Island", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	BR("BRA", 76, "Brazil", "", Language.pt_BR, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -300),
	VG("VGB", 92, "British Virgin Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	IO("IOT", 86, "British Indian Ocean Territory", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +600),
	BN("BRN", 96, "Brunei Darussalam", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +800),
	BG("BGR", 100, "Bulgaria", "", Language.bg, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	BF("BFA", 854, "Burkina Faso", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	BI("BDI", 108, "Burundi", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	BQ("BES", 535, "BONAIRE, SINT EUSTATIUS AND SABA", "", Language.de, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -400),
	KH("KHM", 116, "Cambodia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +700),
	CM("CMR", 120, "Cameroon", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	CA("CAN", 124, "Canada", "", Language.en, Currency.CAD, "d MMM yyyy", "HH:mm (z)", true, true, true, -600), //-800, -700, -600, -500, -400, -330
	CV("CPV", 132, "Cape Verde", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -100),
	CS("SCG", 381, "Serbia and Montenegro", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	KY("CYM", 136, "Cayman Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -500),
	CF("CAF", 140, "Central African Republic", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	TD("TCD", 148, "Chad", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	CL("CHL", 152, "Chile", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -400),
	CN("CHN", 156, "China", "", Language.zh_CN, Currency.CNY, "d MMM yyyy", "HH:mm (z)", true, true, false, +800, "China", "Peoples Republic of China"),
	HK("HKG", 344, "Hong Kong", "Hong Kong", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, false, +800), //Language.zh_TW, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	MO("MAC", 446, "Macao", "", Language.zh_CN, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +800), // Language.zh_TW, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	CX("CXR", 162, "Christmas Island", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +700),
	CC("CCK", 166, "Cocos (Keeling) Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +630),
	CO("COL", 170, "Colombia", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -500),
	KM("COM", 174, "Comoros", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	CG("COG", 178, "Congo (Brazzaville)", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	CD("COD", 180, "Congo, Democratic Republic of the", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	CK("COK", 184, "Cook Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -1000),
	CR("CRI", 188, "Costa Rica", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -600),
	CI("CIV", 384, "Côte d'Ivoire", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	HR("HRV", 191, "Croatia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	CU("CUB", 192, "Cuba", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -500),
	CW("CUW", 531, "Curaçao", "Willemstad", Language.de, Currency.ANG, "d MMM yyyy", "HH:mm (z)", false, true, true, -400),
	CY("CYP", 196, "Cyprus", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	CZ("CZE", 203, "Czech Republic", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	DK("DNK", 208, "Denmark", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	DJ("DJI", 262, "Djibouti", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	DM("DMA", 212, "Dominica", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	DO("DOM", 214, "Dominican Republic", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -400),
	EC("ECU", 218, "Ecuador", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -500),
	EG("EGY", 818, "Egypt", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 200),
	SV("SLV", 222, "El Salvador", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -600),
	GQ("GNQ", 226, "Equatorial Guinea", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	ER("ERI", 232, "Eritrea", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	EE("EST", 233, "Estonia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	ET("ETH", 231, "Ethiopia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	FK("FLK", 238, "Falkland Islands (Malvinas)", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	FO("FRO", 234, "Faroe Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, 0),
	FJ("FJI", 242, "Fiji", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200),
	FI("FIN", 246, "Finland", "", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	FR("FRA", 250, "France", "", Language.fr, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100), //Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	GF("GUF", 254, "French Guiana", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -300),
	PF("PYF", 258, "French Polynesia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -1000),
	TF("ATF", 260, "French Southern Territories", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +500),
	GA("GAB", 266, "Gabon", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	GM("GMB", 270, "Gambia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	GE("GEO", 268, "Georgia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -500),
	DE("DEU", 276, "Germany", "", Language.de, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100), //Language.de, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	GH("GHA", 288, "Ghana", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	GI("GIB", 292, "Gibraltar", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	GR("GRC", 300, "Greece", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	GL("GRL", 304, "Greenland", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -300),
	GD("GRD", 308, "Grenada", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	GP("GLP", 312, "Guadeloupe", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	GU("GUM", 316, "Guam", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1000),
	GT("GTM", 320, "Guatemala", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -600),
	GG("GGY", 831, "Guernsey", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	GN("GIN", 324, "Guinea", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	GW("GNB", 624, "Guinea-Bissau", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	GY("GUY", 328, "Guyana", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	HT("HTI", 332, "Haiti", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -500),
	HM("HMD", 334, "Heard Island and Mcdonald Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +500),
	VA("VAT", 336, "Holy See (Vatican City State)", "Vatican City", Language.it, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100, "Holy See", "Vatican"),
	HN("HND", 340, "Honduras", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -600),
	HU("HUN", 348, "Hungary", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	IS("ISL", 352, "Iceland", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, 0),
	IN("IND", 356, "India", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +530),
	ID("IDN", 360, "Indonesia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +700),
	IR("IRN", 364, "Iran, Islamic Republic of", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +330),
	IQ("IRQ", 368, "Iraq", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	IE("IRL", 372, "Ireland", "", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	IM("IMN", 833, "Isle of Man", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	IL("ISR", 376, "Israel", "Tel Aviv", Language.en, Currency.USD, /* Currency.ILS, */"d MMM yyyy", "HH:mm (z)", true, true, false, +200),
	IT("ITA", 380, "Italy", "", Language.it, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100), //Language.it, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	JM("JAM", 388, "Jamaica", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -500),
	JP("JPN", 392, "Japan", "", Language.en, Currency.JPY, "d MMM yyyy", "HH:mm (z)", true, true, false, +900), //Language.ja, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	JE("JEY", 832, "Jersey", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	JO("JOR", 400, "Jordan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	KZ("KAZ", 398, "Kazakhstan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +600),
	KE("KEN", 404, "Kenya", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	KI("KIR", 296, "Kiribati", "", Language.en, Currency.KRW, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200),
	KP("PRK", 408, "Korea, Democratic People's Republic of", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, false, +900), //Language.ko, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	KR("KOR", 410, "Korea, Republic of", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, false, +900, "Korea"), //Language.ko, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	KW("KWT", 414, "Kuwait", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	KG("KGZ", 417, "Kyrgyzstan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +600),
	LA("LAO", 418, "Lao PDR", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +700),
	LV("LVA", 428, "Latvia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	LB("LBN", 422, "Lebanon", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	LS("LSO", 426, "Lesotho", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	LR("LBR", 430, "Liberia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	LY("LBY", 434, "Libyan Arab Jamahiriya", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	LI("LIE", 438, "Liechtenstein", "", Language.de, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	LT("LTU", 440, "Lithuania", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	LU("LUX", 442, "Luxembourg", "", Language.de, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	MK("MKD", 807, "Macedonia, Republic of", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	MG("MDG", 450, "Madagascar", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	MW("MWI", 454, "Malawi", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	MY("MYS", 458, "Malaysia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +800),
	MV("MDV", 462, "Maldives", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +500),
	ML("MLI", 466, "Mali", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	MT("MLT", 470, "Malta", "Malta", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	MH("MHL", 584, "Marshall Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200),
	MQ("MTQ", 474, "Martinique", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	MR("MRT", 478, "Mauritania", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	MU("MUS", 480, "Mauritius", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +400),
	YT("MYT", 175, "Mayotte", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	MX("MEX", 484, "Mexico", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -600),
	FM("FSM", 583, "Micronesia, Federated States of", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1100),
	MD("MDA", 498, "Moldova", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	MC("MCO", 492, "Monaco", "Monaco", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	MN("MNG", 496, "Mongolia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +800),
	ME("MNE", 499, "Montenegro", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	MS("MSR", 500, "Montserrat", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	MA("MAR", 504, "Morocco", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, 0),
	MZ("MOZ", 508, "Mozambique", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	MM("MMR", 104, "Myanmar", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +630),
	NA("NAM", 516, "Namibia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	NR("NRU", 520, "Nauru", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200),
	NP("NPL", 524, "Nepal", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +545),
	NL("NLD", 528, "Netherlands", "", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	AN("ANT", 530, "Netherlands Antilles", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	NC("NCL", 540, "New Caledonia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1100),
	NZ("NZL", 554, "New Zealand", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200),
	NI("NIC", 558, "Nicaragua", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -600),
	NE("NER", 562, "Niger", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	NG("NGA", 566, "Nigeria", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	NU("NIU", 570, "Niue", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -1100),
	NF("NFK", 574, "Norfolk Island", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1130),
	MP("MNP", 580, "Northern Mariana Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1000),
	NO("NOR", 578, "Norway", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	OM("OMN", 512, "Oman", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +400),
	PK("PAK", 586, "Pakistan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +500),
	PW("PLW", 585, "Palau", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +900),
	PS("PSE", 275, "Palestine", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, false, +200, "Palestinian Territories"),
	PA("PAN", 591, "Panama", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -500),
	PG("PNG", 598, "Papua New Guinea", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1000),
	PY("PRY", 600, "Paraguay", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -400),
	PE("PER", 604, "Peru", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -500),
	PH("PHL", 608, "Philippines", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +800),
	PN("PCN", 612, "Pitcairn", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -800),
	PL("POL", 616, "Poland", "", Language.pl, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	PT("PRT", 620, "Portugal", "", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, 0),
	PR("PRI", 630, "Puerto Rico", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	QA("QAT", 634, "Qatar", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	RE("REU", 638, "Réunion", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +400),
	RO("ROU", 642, "Romania", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	RU("RUS", 643, "Russian Federation", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +400), //Language.ru, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	RW("RWA", 646, "Rwanda", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	BL("BLM", 652, "Saint-Barthélemy", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	SH("SHN", 654, "Saint Helena", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	KN("KNA", 659, "Saint Kitts and Nevis", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	LC("LCA", 662, "Saint Lucia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	MF("MAF", 663, "Saint-Martin (French part)", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	PM("SPM", 666, "Saint Pierre and Miquelon", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -300),
	VC("VCT", 670, "Saint Vincent and Grenadines", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	WS("WSM", 882, "Samoa", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1300),
	SM("SMR", 674, "San Marino", "", Language.it, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	ST("STP", 678, "Sao Tome and Principe", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	SA("SAU", 682, "Saudi Arabia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	SN("SEN", 686, "Senegal", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	RS("SRB", 688, "Serbia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	SC("SYC", 690, "Seychelles", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +400),
	SL("SLE", 694, "Sierra Leone", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	SG("SGP", 702, "Singapore", "Singapore", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +800),
	SX("SXM", 702, "Sint Maarten", "Philipsburg", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	SK("SVK", 703, "Slovakia", "", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	SI("SVN", 705, "Slovenia", "", Language.en, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	SB("SLB", 90, "Solomon Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1100),
	SO("SOM", 706, "Somalia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	ZA("ZAF", 710, "South Africa", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	GS("SGS", 239, "South Georgia and the South Sandwich Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -200),
	ES("ESP", 724, "Spain", "", Language.es, Currency.EUR, "d MMM yyyy", "HH:mm (z)", false, true, true, +100), //Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	LK("LKA", 144, "Sri Lanka", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +530),
	SD("SDN", 736, "Sudan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	SS("SDN", 728, "South Sudan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	SR("SUR", 740, "Suriname", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -300),
	SJ("SJM", 744, "Svalbard and Jan Mayen Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	SZ("SWZ", 748, "Swaziland", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	SE("SWE", 752, "Sweden", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	CH("CHE", 756, "Switzerland", "", Language.de, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +100),
	SY("SYR", 760, "Syrian Arab Republic", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	TW("TWN", 158, "Taiwan, Republic of China", "", Language.zh_TW, Currency.TWD, "d MMM yyyy", "HH:mm (z)", true, true, false, +800), //Language.zh_TW, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true),
	TJ("TJK", 762, "Tajikistan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +500),
	TZ("TZA", 834, "Tanzania, United Republic of", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300, "Tanzania"),
	TH("THA", 764, "Thailand", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +700),
	TL("TLS", 626, "Timor-Leste", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +900),
	TG("TGO", 768, "Togo", "", Language.fr, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	TK("TKL", 772, "Tokelau", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1300),
	TO("TON", 776, "Tonga", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1300),
	TT("TTO", 780, "Trinidad and Tobago", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	TN("TUN", 788, "Tunisia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +100),
	TR("TUR", 792, "Turkey", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	TM("TKM", 795, "Turkmenistan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +500),
	TC("TCA", 796, "Turks and Caicos Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -500),
	TV("TUV", 798, "Tuvalu", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200),
	UG("UGA", 800, "Uganda", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	UA("UKR", 804, "Ukraine", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +200),
	AE("ARE", 784, "United Arab Emirates", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +400),
	GB("GBR", 826, "United Kingdom", "", Language.en, Currency.GBP, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	US("USA", 840, "United States of America", "", Language.en, Currency.USD, "MMM d, yyyy", "hh:mma (z)", true, false, true, -700, "United States", "US", "USA"),
	UM("UMI", 581, "United States Minor Outlying Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -1100), //-1100, -1000,+1200
	UY("URY", 858, "Uruguay", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -300),
	UZ("UZB", 860, "Uzbekistan", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +500),
	VU("VUT", 548, "Vanuatu", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1100),
	VE("VEN", 862, "Venezuela (Bolivarian Republic of)", "", Language.es, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, -430, "Venezuela"),
	VN("VNM", 704, "Vietnam", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", false, true, true, +700, "Vietnam"),
	VI("VIR", 850, "Virgin Islands, US", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, -400),
	WF("WLF", 876, "Wallis and Futuna Islands", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +1200, "Wallis"),
	EH("ESH", 732, "Western Sahara", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, 0),
	YE("YEM", 887, "Yemen", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +300),
	ZM("ZMB", 894, "Zambia", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200),
	ZW("ZWE", 716, "Zimbabwe", "", Language.en, Currency.USD, "d MMM yyyy", "HH:mm (z)", true, true, true, +200);


	/************************************************************************************************************************
	 * Constants
	 ************************************************************************************************************************/
	public static final Country DEFAULT = US;


	/************************************************************************************************************************
	 * Fields
	 ************************************************************************************************************************/
	public String alpha3;
	public int numberic3; // ISO 3166-1: http://en.wikipedia.org/wiki/ISO_3166-1
	public String englishName;
	public Language defaultLanguage;
	public Currency currency;
	public String capital;
	public final String dateFormat;
	public final String timeFormat;
	/** True for 123,456.789 false for 123.456,789 */
	public final boolean commaNumberSeparator;
	public final boolean metricUnits;
	/** Does this country use Latin-like characters as the primary alphabet */
	public boolean isLatinChars;
	public List<String> aliases;

	/**
	 * Time zone offset for the country (or for one of the regions of the country) in milliseconds ahead of GMT, notice here that the Enum constructor accept it in +-hhmm format. <br>
	 * Maybe we can use a data base for time zones if we decide to get accurate offset,check http://timezonedb.com/download
	 */
	public int timeZoneOffset;

	// Cache the DateTimeFormat for performance reasons 
	DateFormatter timeFormatter;
	DateFormatter dateTimeFormatter;
	DateFormatter dateFormatter;

	/************************************************************************************************************************
	 * Constructors
	 ************************************************************************************************************************/
	/**
	 * @param timeZoneOffset
	 *            : time zone offset with format +-hhmm
	 */
	private Country(String alpha3, int numberic3, String englishName, String capital, Language defaultLanguage, Currency currency, String dateFormat, String timeFormat, boolean commaNumberSeparator, boolean metricUnits, boolean isLatinChars, int timeZoneOffset, String... aliases) {
		this.alpha3 = alpha3;
		this.numberic3 = numberic3;
		this.englishName = englishName;
		this.capital = capital;
		this.defaultLanguage = defaultLanguage;
		this.currency = currency;
		this.dateFormat = dateFormat;
		this.timeFormat = timeFormat;
		this.commaNumberSeparator = commaNumberSeparator;
		this.metricUnits = metricUnits;
		this.isLatinChars = isLatinChars;
		this.aliases = Arrays.asList(aliases);
	}

	/************************************************************************************************************************
	 * Methods
	 ************************************************************************************************************************/

	@Override
	public String toString() {
		return englishName;
	}

	/************************************************************************************************************************
	 * Static methods
	 ************************************************************************************************************************/
	

	public static Country getCountryByCode(String key) {
		try {
			return valueOf(key.toUpperCase());
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

	public static Country valueOfIgnoreCase(String country) {
		for (Country c : Country.values()) {
			if (c.name().equalsIgnoreCase(country) || c.alpha3.equalsIgnoreCase(country) || c.englishName.equalsIgnoreCase(country) ) {
				return c;
			}
		}
		throw new IllegalArgumentException("not valid country name");
	}
}