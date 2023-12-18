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

import org.gwtbootstrap4.client.ui.base.helper.EnumHelper;

import com.google.gwt.dom.client.Style;

/**
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public enum FloatCSS implements Style.HasCssName {
    NONE_XS("float-none"),
    NONE_SM("float-sm-none"),
    NONE_MD("float-md-none"),
    NONE_LG("float-lg-none"),
    NONE_XL("float-xl-none"),
    LEFT_XS("float-left"),
    LEFT_SM("float-sm-left"),
    LEFT_MD("float-md-left"),
    LEFT_LG("float-lg-left"),
    LEFT_XL("float-xl-left"),
    RIGHT_XS("float-right"),
    RIGHT_SM("float-sm-right"),
    RIGHT_MD("float-md-right"),
    RIGHT_LG("float-lg-right"),
    RIGHT_XL("float-xl-right");

    private final String cssClass;

    FloatCSS(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static FloatCSS fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, FloatCSS.class, NONE_XS);
    }
}
