package org.gwtbootstrap4.client.ui;

import com.google.gwt.uibinder.client.UiConstructor;
import org.gwtbootstrap4.client.ui.constants.HeadingSize;
import org.gwtbootstrap4.client.ui.constants.Styles;

public class CardTitle extends Heading {

    @UiConstructor
    public CardTitle(HeadingSize size) {
        super(size);

        addStyleName(Styles.CARD_TITLE);
    }

}
