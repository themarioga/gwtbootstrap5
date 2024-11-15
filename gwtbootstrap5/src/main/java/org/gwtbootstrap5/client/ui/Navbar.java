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
import org.gwtbootstrap5.client.ui.constants.*;

import com.google.gwt.dom.client.Document;

/**
 * @author Sven Jacobs
 * @author Joshua Godi
 * @see NavbarBrand
 * @see NavbarNav
 * @see NavbarForm
 * @see NavbarText
 */
public class Navbar extends ComplexWidget implements HasType<NavbarType> {
    private static final String NAVIGATION = "navigation";

    public Navbar() {
        super();

        setElement(Document.get().createElement(ElementTags.NAV));
        setStyleName(Styles.NAVBAR);
        setType(NavbarType.DEFAULT);
        setExpand(NavbarExpand.LG);
        getElement().setAttribute(Attributes.ROLE, NAVIGATION);
    }

    @Override
    public void setType(final NavbarType type) {
        StyleHelper.addUniqueEnumStyleName(this, NavbarType.class, type);
    }

    @Override
    public NavbarType getType() {
        return NavbarType.fromStyleName(getStyleName());
    }

    public void setExpand(NavbarExpand expand) {
        StyleHelper.addUniqueEnumStyleName(this, NavbarExpand.class, expand);
    }

    public NavbarExpand getExpand() {
        return NavbarExpand.fromStyleName(getStyleName());
    }

    public void setPosition(final NavbarPosition type) {
        StyleHelper.addUniqueEnumStyleName(this, NavbarPosition.class, type);
    }

    public NavbarPosition getPosition() {
        return NavbarPosition.fromStyleName(getStyleName());
    }
}
