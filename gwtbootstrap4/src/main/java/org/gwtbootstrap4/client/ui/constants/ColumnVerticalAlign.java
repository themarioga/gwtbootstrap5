package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum ColumnVerticalAlign implements Style.HasCssName {
    DEFAULT(""),
    START("align-self-start"),
    CENTER("align-self-center"),
    END("align-self-end");

    private final String cssClassName;

    ColumnVerticalAlign(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static ColumnVerticalAlign fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, ColumnVerticalAlign.class, DEFAULT);
    }
}
