package org.gwtbootstrap5.client.ui.base.mixin;

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

import org.gwtbootstrap5.client.ui.base.HasDataToggle;
import org.gwtbootstrap5.client.ui.constants.Attributes;
import org.gwtbootstrap5.client.ui.constants.Toggle;

import com.google.gwt.user.client.ui.UIObject;

/**
 * @author Sven Jacobs
 */
public class DataToggleMixin<T extends UIObject & HasDataToggle> extends AbstractMixin implements HasDataToggle {

    public DataToggleMixin(final T uiObject) {
        super(uiObject);
    }

    @Override
    public void setDataToggle(final Toggle toggle) {
        if (toggle != null) {
            uiObject.getElement().setAttribute(Attributes.DATA_TOGGLE, toggle.getToggle());
        } else {
            uiObject.getElement().removeAttribute(Attributes.DATA_TOGGLE);
        }
    }

    @Override
    public Toggle getDataToggle() {
        final String toggle = uiObject.getElement().getAttribute(Attributes.DATA_TOGGLE);
        return toggle != null ? Toggle.valueOf(toggle) : null;
    }
}
