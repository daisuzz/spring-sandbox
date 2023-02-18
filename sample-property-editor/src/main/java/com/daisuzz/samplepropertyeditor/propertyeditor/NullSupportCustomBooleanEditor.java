package com.daisuzz.samplepropertyeditor.propertyeditor;

import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.lang.Nullable;

public class NullSupportCustomBooleanEditor extends CustomBooleanEditor {

    public NullSupportCustomBooleanEditor(boolean allowEmpty) {
        super(allowEmpty);
    }

    @Override
    public void setAsText(@Nullable String text) throws IllegalArgumentException {
        String input = (text != null ? text.trim() : null);
        if ("null".equalsIgnoreCase(input)) {
            setValue(Boolean.FALSE);
            return;
        }
        super.setAsText(text);
    }
}
