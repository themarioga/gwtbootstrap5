package org.gwtbootstrap4.client.ui;

import com.google.gwt.uibinder.client.UiConstructor;
import org.gwtbootstrap4.client.ui.constants.CardImagePosition;
import org.gwtbootstrap4.client.ui.constants.HeadingSize;
import org.gwtbootstrap4.client.ui.constants.Styles;

public class CardImage extends Image {

    @UiConstructor
    public CardImage(CardImagePosition cardImagePosition) {
        super();

        setStyleName(cardImagePosition.getCssName());
    }

    public void setImagePosition(CardImagePosition cardImagePosition) {
        setStyleName(cardImagePosition.getCssName());
    }

}
