package org.gwtbootstrap4.client.ui;

import org.gwtbootstrap4.client.ui.constants.InputType;
import org.gwtbootstrap4.client.ui.constants.Styles;

public class InputRange extends Input {

    public InputRange() {
        super();
        setType(InputType.RANGE);
        addStyleName(Styles.FORM_CONTROL_RANGE);
    }

}
