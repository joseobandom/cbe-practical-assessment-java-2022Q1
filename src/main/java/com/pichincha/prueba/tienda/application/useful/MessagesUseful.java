package com.pichincha.prueba.tienda.application.useful;


import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessagesUseful {

	private static ResourceBundle bundle;
	private static String ficheroMessages = "messages_pichincha";
	public static final Locale Locale = new Locale("es", "EC");
	private static final String LOCALE_ES="es-EC";
	private static final String LOCALE_ING="en-US";

	public static String getMessage(String strKey, Locale locale) {
		
		if(isKey(strKey)) {
			bundle = ResourceBundle.getBundle(ficheroMessages, locale);	
			return new String(bundle.getString(strKey).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
		}else {
			return strKey; 
		}
	}

	public static String getMessage(String strKey, Object[] arrParametros, Locale locale) {
		bundle = ResourceBundle.getBundle(ficheroMessages, locale);
		String strMensaje = new String(bundle.getString(strKey).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
		if (arrParametros != null && arrParametros.length > 0) {
			for (int i = 0; i < arrParametros.length; i++) {
				strMensaje = strMensaje.replace("{" + i + "}",
						(isKey(arrParametros[i].toString())
								? new String(bundle.getString(arrParametros[i].toString())
										.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8)
								: arrParametros[i].toString()));
			}
		}
		return strMensaje;
	}
	
	private static boolean isKey(String strKey) {
		if (strKey != null && (strKey.contains(".warn.") || strKey.contains(".error.") || strKey.contains(".info.")
				|| strKey.contains(".field.") || strKey.contains(".header.")|| strKey.contains(".response.")|| strKey.contains(".node.")))
			return true;
		else
			return false;
	}
	
	public static String getMessageCampoObligatorio(String strKeyCampo, Locale locale) {
		return MessagesUseful.getMessage("msg.warn.obligatoryField",
				new Object[] { MessagesUseful.getMessage(strKeyCampo, locale) }, locale);
	}
	
	public static Locale validateSupportedLocale(String strLanguage) {
		if(strLanguage == null || (!LOCALE_ES.equals(strLanguage) && !LOCALE_ING.equals(strLanguage)))
			strLanguage=LOCALE_ES;
		String[] arrLang = strLanguage.split("-");
    	return new Locale(arrLang[0], arrLang[1]);
	}

}
