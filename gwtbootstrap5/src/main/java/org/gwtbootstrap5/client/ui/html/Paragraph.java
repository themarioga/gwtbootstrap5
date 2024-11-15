package org.gwtbootstrap5.client.ui.html;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2017 GwtBootstrap5
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

import org.gwtbootstrap5.client.ui.base.HasAlignment;
import org.gwtbootstrap5.client.ui.base.HasEmphasis;
import org.gwtbootstrap5.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap5.client.ui.base.mixin.HTMLMixin;
import org.gwtbootstrap5.client.ui.constants.Emphasis;
import org.gwtbootstrap5.client.ui.constants.TextAlignment;
import org.gwtbootstrap5.client.ui.gwt.HTMLPanel;

import com.google.gwt.dom.client.ParagraphElement;

/**
 * @author Sven Jacobs
 */
public class Paragraph extends HTMLPanel implements HasAlignment, HasEmphasis {

    private final HTMLMixin<Paragraph> textMixin = new HTMLMixin<Paragraph>(this);

    public Paragraph() {
        this("");
    }

    public Paragraph(final String html) {
        super(ParagraphElement.TAG, html);
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

    @Override
    public void setAlignment(final TextAlignment alignment) {
        StyleHelper.addUniqueEnumStyleName(this, TextAlignment.class, alignment);
    }

    @Override
    public TextAlignment getAlignment() {
        return TextAlignment.fromStyleName(getStyleName());
    }

    @Override
    public void setEmphasis(final Emphasis emphasis) {
        StyleHelper.addUniqueEnumStyleName(this, Emphasis.class, emphasis);
    }

    @Override
    public Emphasis getEmphasis() {
        return Emphasis.fromStyleName(getStyleName());
    }
}
