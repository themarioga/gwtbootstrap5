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

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.UIObject;
import org.gwtbootstrap5.client.shared.js.JQuery;

/**
 * @author Grant Slender
 */
public class HTMLMixin<T extends UIObject> extends TextMixin<T> {

    public HTMLMixin(final T uiObject) {
        super(uiObject);
    }

    public String getHTML() {
        return uiObject.getElement().getInnerHTML();
    }

    public void setHTML(final String html) {
        try {
            uiObject.getElement().setInnerHTML(html);
        } catch (Exception e) {
            // try using jQuery.html() for handling IE, etc.
            setInnerHTML(uiObject.getElement(), html);
        }
    }

    private void setInnerHTML(Element e, String html) {
        JQuery.jQuery(e).html(html);
    }

}
