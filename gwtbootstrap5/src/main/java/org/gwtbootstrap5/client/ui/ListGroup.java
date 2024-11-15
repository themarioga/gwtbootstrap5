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

import org.gwtbootstrap5.client.ui.constants.Styles;
import org.gwtbootstrap5.client.ui.html.UnorderedList;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Joshua Godi
 */
public class ListGroup extends UnorderedList {

    public ListGroup() {
        super();

        setStyleName(Styles.LIST_GROUP);
    }

    @Override
    public void add(final Widget child) {
        if (!(child instanceof ListGroupItem)) {
            throw new IllegalArgumentException("Only ListGroupItems can be inside a ListGroup.");
        }

        add(child, (Element) getElement());
    }

    public void setNumbered(final boolean numbered) {
        if (numbered) {
            getElement().addClassName(Styles.LIST_GROUP_NUMBERED);
        } else {
            getElement().removeClassName(Styles.LIST_GROUP_NUMBERED);
        }
    }

}
