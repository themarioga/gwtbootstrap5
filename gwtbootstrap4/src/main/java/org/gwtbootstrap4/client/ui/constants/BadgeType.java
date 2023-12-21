package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum BadgeType implements Style.HasCssName, Type {
    DEFAULT(""),
    PRIMARY("badge-primary"),
    SECONDARY("badge-secondary"),
    SUCCESS("badge-success"),
    DANGER("badge-danger"),
    WARNING("badge-warning"),
    INFO("badge-info"),
    LIGHT("badge-light"),
    DARK("badge-dark");

    private final String cssClassName;

    BadgeType(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static BadgeType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, BadgeType.class, DEFAULT);
    }
}
