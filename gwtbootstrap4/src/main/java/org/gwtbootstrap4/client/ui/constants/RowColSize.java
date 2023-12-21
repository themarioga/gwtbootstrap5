package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum RowColSize implements Size, Style.HasCssName {
    DEFAULT(""),

    XS_1("row-cols-1"),
    XS_2("row-cols-2"),
    XS_3("row-cols-3"),
    XS_4("row-cols-4"),
    XS_5("row-cols-5"),
    XS_6("row-cols-6"),

    SM_1("row-cols-sm-1"),
    SM_2("row-cols-sm-2"),
    SM_3("row-cols-sm-3"),
    SM_4("row-cols-sm-4"),
    SM_5("row-cols-sm-5"),
    SM_6("row-cols-sm-6"),

    MD_1("row-cols-md-1"),
    MD_2("row-cols-md-2"),
    MD_3("row-cols-md-3"),
    MD_4("row-cols-md-4"),
    MD_5("row-cols-md-5"),
    MD_6("row-cols-md-6"),

    LG_1("row-cols-lg-1"),
    LG_2("row-cols-lg-2"),
    LG_3("row-cols-lg-3"),
    LG_4("row-cols-lg-4"),
    LG_5("row-cols-lg-5"),
    LG_6("row-cols-lg-6"),

    XL_1("row-cols-xl-1"),
    XL_2("row-cols-xl-2"),
    XL_3("row-cols-xl-3"),
    XL_4("row-cols-xl-4"),
    XL_5("row-cols-xl-5"),
    XL_6("row-cols-xl-6");

    private final String cssClassName;

    RowColSize(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static RowColSize fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, RowColSize.class, DEFAULT);
    }

}
