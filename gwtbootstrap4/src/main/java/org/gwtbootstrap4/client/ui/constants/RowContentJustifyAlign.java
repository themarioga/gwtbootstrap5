package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum RowContentJustifyAlign implements Style.HasCssName {
    DEFAULT(""),
    START("align-items-start"),
    CENTER("align-items-center"),
    END("align-items-end"),
    AROUND("align-items-around"),
    BETWEEN("align-items-between");

    private final String cssClassName;

    RowContentJustifyAlign(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static RowContentJustifyAlign fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, RowContentJustifyAlign.class, DEFAULT);
    }
}
