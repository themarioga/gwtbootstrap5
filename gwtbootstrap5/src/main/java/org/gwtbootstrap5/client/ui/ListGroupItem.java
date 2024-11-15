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

import org.gwtbootstrap5.client.ui.base.ComplexWidget;
import org.gwtbootstrap5.client.ui.base.HasType;
import org.gwtbootstrap5.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap5.client.ui.constants.ListGroupItemType;
import org.gwtbootstrap5.client.ui.constants.Styles;
import org.gwtbootstrap5.client.ui.html.Span;

import com.google.gwt.dom.client.Document;

/**
 * @author Joshua Godi
 */
public class ListGroupItem extends ComplexWidget implements HasType<ListGroupItemType> {
    private final Span span = new Span();

    public ListGroupItem() {
        super();

        setElement(Document.get().createLIElement());
        setStyleName(Styles.LIST_GROUP_ITEM);

        add(span);
    }

    public String getText() {
        return span.getText();
    }

    public void setText(final String text) {
        span.setText(text);
    }

    public String getHTML() {
        return span.getHTML();
    }

    public void setHTML(String html) {
        span.setHTML(html);
    }

    @Override
    public void setType(final ListGroupItemType type) {
        StyleHelper.addUniqueEnumStyleName(this, ListGroupItemType.class, type);
    }

    @Override
    public ListGroupItemType getType() {
        return ListGroupItemType.fromStyleName(getStyleName());
    }

    public void setFlush(boolean flush) {
        if (flush) {
            addStyleName(Styles.LIST_GROUP_FLUSH);
        } else {
            removeStyleName(Styles.LIST_GROUP_FLUSH);
        }
    }

}
