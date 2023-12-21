package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum ContainerSize implements Size, Style.HasCssName {
    DEFAULT("container"),
    XS("container"),
    SM("container-sm"),
    MD("container-md"),
    LG("container-lg"),
    XL("container-xl"),
    FLUID("container-fluid");

    private final String cssClassName;

    ContainerSize(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static ContainerSize fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, ContainerSize.class, DEFAULT);
    }

}
