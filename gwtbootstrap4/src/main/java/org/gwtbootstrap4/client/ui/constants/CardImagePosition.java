package org.gwtbootstrap4.client.ui.constants;

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

public enum CardImagePosition implements Type, Style.HasCssName {
    DEFAULT("card-img"),
    TOP("card-img-top"),
    BOTTOM("card-img-bottom");

    private final String cssClassName;

    CardImagePosition(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static CardImagePosition fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, CardImagePosition.class, DEFAULT);
    }

}
