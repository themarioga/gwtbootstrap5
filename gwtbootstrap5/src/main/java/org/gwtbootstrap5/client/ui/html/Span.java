package org.gwtbootstrap5.client.ui.html;

import org.gwtbootstrap5.client.ui.base.mixin.HTMLMixin;
import org.gwtbootstrap5.client.ui.gwt.HTMLPanel;

import com.google.gwt.dom.client.SpanElement;

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

/**
 * @author Sven Jacobs
 * @author Grant Slender
 */
public class Span extends HTMLPanel {

    private final HTMLMixin<Span> textMixin = new HTMLMixin<Span>(this);

    public Span() {
        super(SpanElement.TAG, "");
    }

    public Span(final String html) {
        this();
        setHTML(html);
    }

    public void setText(final String text) {
        textMixin.setText(text);
    }

    public String getText() {
        return textMixin.getText();
    }

    public String getHTML() {
        return textMixin.getHTML();
    }

    public void setHTML(final String html) {
        textMixin.setHTML(html);
    }
}