package org.gwtbootstrap4.client.ui;

import org.gwtbootstrap4.client.ui.constants.InputType;
import org.gwtbootstrap4.client.ui.constants.Styles;

public class InputFile extends Input {

    public InputFile() {
        super();
        setType(InputType.FILE);
        addStyleName(Styles.FORM_CONTROL_FILE);
    }

}
