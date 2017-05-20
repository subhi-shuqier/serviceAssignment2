package com.javaeeeee.dwstart.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public enum Language implements Serializable {
	// WHEN ADDING LANGUAGES UPDATE getTypicalCountry()
	en("English", "English", false),
	de("Deutsch", "German", false),
	fr("Français", "French", false),
	it("Italiano", "Italian", false),
	zh_CN("简体中文", "Chinese (simplified)", false), // Chinese simplified
	zh_TW("繁體中文", "Chinese (traditional)", false), // Chinese traditional
	es("Español", "Spanish", false),
	pt_BR("Português (Brasil - demo)", "Portuguese (Brazil)", false),
	ru("русский язык (demo)", "Russian", false),
	pl("Polski (demo)", "Polish", false),
	bg("български (demo)", "Bulgarian", false),
	ja("日本語 (demo)", "Japanese", false);
	//pt("Português (demo)", "Portuguese", false);

	/*iw("עברית", "Hebrew", true),
	ko("한국말; 韓國말", "Korean", false);*/

	/********************************************************************************
	 * Constants
	 ********************************************************************************/
	public static final Language DEFAULT = en;
	/** List of languages currently offered in the GUI */
	public static final List<Language> GUI_LANGUAGES = Arrays.asList(Language.values());

	/********************************************************************************
	 * Fields
	 ********************************************************************************/
	/** The name of the locale/language in that language */
	public final String name;
	/** The name of the locale/language in English */
	public final String englishName;
	/** Is language written right-to-left (Hebrew, Arabic, Urdu) */
	public final boolean rtl;

	/** Country used for flag */

	/********************************************************************************
	 * Constructors
	 ********************************************************************************/
	Language(String name, String englishName, boolean rtl) {
		this.name = name;
		this.englishName = englishName;
		this.rtl = rtl;
	}

	/********************************************************************************
	 * Methods
	 ********************************************************************************/

	/**
	 * Country whose flag best signifies this language
	 */
	public final Country getTypicalCountry() {
		switch (this) {
			case en:
				return Country.GB;
			case zh_CN:
				return Country.CN;
			case zh_TW:
				return Country.HK;
			case de:
				return Country.DE;
			case es:
				return Country.ES;
			case pt_BR:
				return Country.BR;
			case fr:
				return Country.FR;
			case it:
				return Country.IT;
			case ja:
				return Country.JP;
			case ru:
				return Country.RU;
			case pl:
				return Country.PL;
			case bg:
				return Country.BG;
			default:
				throw new IllegalArgumentException("Define a typical country for TLanguage.getTypicalCountry(" + this + ")");
		}
	}

	/**
	 * Returns e.g. en_US or de_DE
	 */
	public final String getLocaleCode() {
		switch (this) {
			case en:
				return "en_US";
			case zh_TW: // Temporarily using zh_CN because that's what PayPal supports
				return "zh_CN";
			default:
				if (name().length() == 5) {
					return name();
				} else {
					return name() + "_" + name().toUpperCase();
				}
		}
	}

	@Override
	public String toString() {
		return this.name + " (" + name() + ")";
	}

	public static boolean isSupportedLanguage(Language Language) {
		return GUI_LANGUAGES.contains(Language);
	}

	/**
	 * @return
	 * 		According to https://cms.paypal.com/us/cgi-bin/?cmd=_render-content&content_ID=developer/e_howto_html_Appx_websitestandard_htmlvariables
	 *         allowed values are:
	 *         AU – Australia
	 *         AT – Austria
	 *         BE – Belgium
	 *         BR – Brazil
	 *         CA – Canada
	 *         CH – Switzerland
	 *         CN – China
	 *         DE – Germany
	 *         ES – Spain
	 *         GB – United Kingdom
	 *         FR – France
	 *         IT – Italy
	 *         NL – Netherlands
	 *         PL – Poland
	 *         PT – Portugal
	 *         RU – Russia
	 *         US – United States
	 *         The following 5-character codes are also supported for languages in specific countries:
	 *         da_DK – Danish (for Denmark only)
	 *         he_IL – Hebrew (all)
	 *         id_ID – Indonesian (for Indonesia only)
	 *         jp_JP – Japanese (for Japan only)
	 *         no_NO – Norwegian (for Norway only)
	 *         pt_BR – Brazilian Portuguese (for Portugal and Brazil only)
	 *         ru_RU – Russian (for Lithuania, Latvia, and Ukraine only)
	 *         sv_SE – Swedish (for Sweden only)
	 *         th_TH – Thai (for Thailand only)
	 *         tr_TR – Turkish (for Turkey only)
	 *         zh_CN – Simplified Chinese (for China only)
	 *         zh_HK – Traditional Chinese (for Hong Kong only)
	 *         zh_TW – Traditional Chinese (for Taiwan only)
	 */
	public String getPayPalLocale() {
		switch (this) {
			case en: {
				return "US";
			}
			default: {
				return this.name();
			}
		}
	}

	/**
	 * Suggest which language is a good source for translating into the current language.
	 * Generally English unless there is a closely related source language like simplified Chinese for traditional Chinese
	 */
	public Language suggestTranslationSource() {
		return this == Language.zh_TW ? Language.zh_CN : Language.DEFAULT;
	}

	public static Language valueOfIgnoreCase(String langStr) {
		for (Language lang : values()) {
			if (lang.name().toLowerCase().equals(langStr)) {
				return lang;
			}
		}
		throw new IllegalArgumentException("Unrecognized TLanguage: " + langStr);
	}
}