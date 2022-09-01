package com.urieban.testDome.exersice3;

import java.util.ArrayList;
import java.util.Collection;

public class LanguageStudent {
	
	private Collection<String> languages;

	public void addLanguage(String language) {
		if(null == languages) {
			languages = new ArrayList<String>();
		}
		this.getLanguages().add(language);
	}
	
	public Collection<String> getLanguages() {
		return languages == null ? new ArrayList<String>():languages;
	}

	public void setLanguages(Collection<String> languages) {
		this.languages = languages;
	}

}
