package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum RowContentVerticalAlign implements Style.HasCssName {
    DEFAULT(""),
    START("align-items-start"),
    CENTER("align-items-center"),
    END("align-items-end");

    private final String cssClassName;

    RowContentVerticalAlign(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static RowContentVerticalAlign fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, RowContentVerticalAlign.class, DEFAULT);
    }
}
