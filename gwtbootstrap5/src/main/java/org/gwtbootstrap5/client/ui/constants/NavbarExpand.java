package org.gwtbootstrap5.client.ui.constants;

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

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap5.client.ui.base.helper.EnumHelper;

/**
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public enum NavbarExpand implements Style.HasCssName {
    XS("navbar-expand"),
    SM("navbar-expand-sm"),
    MD("navbar-expand-md"),
    LG("navbar-expand-lg"),
    XL("navbar-expand-xl"),
    XXL("navbar-expand-xxl");

    private final String cssClass;

    NavbarExpand(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static NavbarExpand fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, NavbarExpand.class, XS);
    }
}
