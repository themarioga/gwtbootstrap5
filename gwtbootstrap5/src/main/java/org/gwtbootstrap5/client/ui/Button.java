package org.gwtbootstrap5.client.ui;

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

import org.gwtbootstrap5.client.ui.base.button.AbstractToggleButton;
import org.gwtbootstrap5.client.ui.constants.IconType;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;
import org.gwtbootstrap5.client.ui.constants.Styles;

/**
 * Button based on {@code <button>} element with different types and sizes.
 * <p/>
 * <h3>UiBinder example</h3>
 * <p/>
 * <pre>
 * {@code
 *     <b:Button type="PRIMARY">Save</b:Button>
 *     <b:Button type="DANGER">Delete</b:Button>
 *     <b:Button type="INFO" block="true>I'm a block level button</b:Button>
 * }
 * </pre>
 *
 * @author Sven Jacobs
 * @see org.gwtbootstrap5.client.ui.base.button.AbstractToggleButton
 * @see SubmitButton
 */
public class Button extends AbstractToggleButton {

    /**
     * Creates button with DEFAULT type.
     */
    public Button() {
        super();
    }

    /**
     * Creates button with specified text
     *
     * @param text Text contents of button
     */
    public Button(final String text) {
        this();
        setText(text);
    }

    public Button(final String text, final ClickHandler handler) {
        this(text);
        super.addClickHandler(handler);
    }

    public Button(final String text, final IconType iconType, final ClickHandler clickHandler) {
        this(text, clickHandler);
        setIconType(iconType);
    }

    @Override
    protected Element createElement() {
        return Document.get().createPushButtonElement().cast();
    }

    public void setNoWrap(boolean noWrap) {
        if (noWrap) {
            addStyleName(Styles.TEXT_NOWRAP);
        } else {
            removeStyleName(Styles.TEXT_NOWRAP);
        }
    }
}
