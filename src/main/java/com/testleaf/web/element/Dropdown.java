package com.testleaf.web.element;

import java.util.List;

public interface Dropdown {

    void selectOptionByVisibleText(String optionName);
    void selectOptionByValue(String optionValue);
    void selectOptionByIndex(int index);
    List<Element> getAllOptions();
    boolean isMultiselect();
}
