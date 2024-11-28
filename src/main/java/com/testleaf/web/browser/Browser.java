package com.testleaf.web.browser;

import com.testleaf.constants.LocatorType;
import com.testleaf.web.element.*;

public interface Browser {
	
	
	
	// Core methods in the Browser
	void navigateTo(String url);
	void maximize();
	void releaseBrowser();
	void closeBrowser();
	String getTitle();
	
	// method >> locate Element !!
	Element locateElement(LocatorType locatorType, String element);
	Edit locateEdit(LocatorType locatorType, String element);
	Button locateButton(LocatorType locatorType, String element);
	Link locateLink(LocatorType locatorType, String element);
	Dropdown locateDropdown(LocatorType locatorType, String element);

}
