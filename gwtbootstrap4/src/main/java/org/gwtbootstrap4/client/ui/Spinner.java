package org.gwtbootstrap4.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiConstructor;
import org.gwtbootstrap4.client.ui.base.HasEmphasis;
import org.gwtbootstrap4.client.ui.base.HasType;
import org.gwtbootstrap4.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap4.client.ui.constants.Emphasis;
import org.gwtbootstrap4.client.ui.constants.SpinnerType;
import org.gwtbootstrap4.client.ui.constants.Styles;
import org.gwtbootstrap4.client.ui.html.Div;

public class Spinner extends Div implements HasType<SpinnerType>, HasEmphasis {

    public Spinner(SpinnerType spinnerType) {
        this(spinnerType, "Loading...");
    }

    @UiConstructor
    public Spinner(SpinnerType spinnerType, String defaultText) {
        getElement().setAttribute("role", "status");

        SpanElement spanElement = Document.get().createSpanElement();
        spanElement.setClassName(Styles.SR_ONLY);
        spanElement.setInnerText(defaultText);
        getElement().appendChild(spanElement);

        setType(spinnerType);
    }

    @Override
    public void setType(SpinnerType type) {
        StyleHelper.addUniqueEnumStyleName(this, SpinnerType.class, type);
    }

    @Override
    public SpinnerType getType() {
        return SpinnerType.fromStyleName(getStyleName());
    }

    @Override
    public void setEmphasis(Emphasis emphasis) {
        StyleHelper.addUniqueEnumStyleName(this, Emphasis.class, emphasis);
    }

    @Override
    public Emphasis getEmphasis() {
        return Emphasis.fromStyleName(getStyleName());
    }

    public void setSmall(boolean isSmall) {
        if (isSmall) {
            if (getType() == SpinnerType.BORDER) {
                addStyleName(Styles.SPINNER_BORDER_SM);
            } else if (getType() == SpinnerType.GROW) {
                addStyleName(Styles.SPINNER_GROW_SM);
            }
        } else {
            if (getType() == SpinnerType.BORDER) {
                removeStyleName(Styles.SPINNER_BORDER_SM);
            } else if (getType() == SpinnerType.GROW) {
                removeStyleName(Styles.SPINNER_GROW_SM);
            }
        }
    }


}
