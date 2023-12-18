package org.gwtbootstrap4.client.ui.constants;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 GwtBootstrap4
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
import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

/**
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public enum TextAlignment implements Style.HasCssName {
    LEFT_XS("text-left"),
    LEFT_SM("text-sm-left"),
    LEFT_MD("text-md-left"),
    LEFT_LG("text-lg-left"),
    LEFT_XL("text-xl-left"),
    RIGHT_XS("text-right"),
    RIGHT_SM("text-sm-right"),
    RIGHT_MD("text-md-right"),
    RIGHT_LG("text-lg-right"),
    RIGHT_XL("text-xl-right"),
    CENTER_XS("text-center"),
    CENTER_SM("text-sm-center"),
    CENTER_MD("text-md-center"),
    CENTER_LG("text-lg-center"),
    CENTER_XL("text-xl-center");

    private final String cssClass;

    TextAlignment(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static TextAlignment fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, TextAlignment.class, LEFT_XS);
    }
}
