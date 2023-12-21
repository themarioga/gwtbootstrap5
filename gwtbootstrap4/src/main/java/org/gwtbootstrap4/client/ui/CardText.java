package org.gwtbootstrap4.client.ui;

import com.google.gwt.uibinder.client.UiConstructor;
import org.gwtbootstrap4.client.ui.constants.HeadingSize;
import org.gwtbootstrap4.client.ui.constants.Styles;

public class CardText extends TextBox {

    @UiConstructor
    public CardText() {
        addStyleName(Styles.CARD_TEXT);
    }

}
