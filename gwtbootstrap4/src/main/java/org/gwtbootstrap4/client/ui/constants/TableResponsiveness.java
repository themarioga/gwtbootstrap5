package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum TableResponsiveness implements Style.HasCssName {
    DEFAULT("table-responsive"),
    SM("table-responsive-sm"),
    MD("table-responsive-md"),
    LG("table-responsive-lg"),
    XL("table-responsive-xl");

    private final String cssClass;

    TableResponsiveness(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static TableResponsiveness fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, TableResponsiveness.class, DEFAULT);
    }

}
