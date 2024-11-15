package org.gwtbootstrap5.client.ui.base.modal;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 GwtBootstrap5
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap5.client.ui.constants.Styles;

import com.google.gwt.user.client.ui.FlowPanel;

/**
 * @author Sven Jacobs
 * @see org.gwtbootstrap5.client.ui.Modal
 */
public class ModalDialog extends FlowPanel {

    public ModalDialog() {
        setStyleName(Styles.MODAL_DIALOG);
    }

    void setScrollable(boolean isScrollable) {
        if (isScrollable) {
            addStyleName(Styles.MODAL_DIALOG_SCROLLABLE);
        } else {
            removeStyleName(Styles.MODAL_DIALOG_SCROLLABLE);
        }
    }

    void setCentered(boolean isCentered) {
        if (isCentered) {
            addStyleName(Styles.MODAL_DIALOG_CENTERED);
        } else {
            removeStyleName(Styles.MODAL_DIALOG_CENTERED);
        }
    }

}
