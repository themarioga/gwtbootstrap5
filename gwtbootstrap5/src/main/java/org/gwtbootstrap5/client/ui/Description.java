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
import org.gwtbootstrap5.client.ui.base.DescriptionComponent;
import org.gwtbootstrap5.client.ui.constants.Styles;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Joshua Godi
 */
public class Description extends ComplexWidget {

    public Description() {
        super();

        setElement(Document.get().createDLElement());
    }

    public void setHorizontal(final boolean horizontal) {
        setStyleName(Styles.ROW, horizontal);
    }

    @Override
    public void add(final Widget child) {
        if (!(child instanceof DescriptionComponent)) {
            throw new IllegalArgumentException(
                    "Description can only have children of type DescriptionData and DescriptionTitle");
        }
        super.add(child);
    }
}
