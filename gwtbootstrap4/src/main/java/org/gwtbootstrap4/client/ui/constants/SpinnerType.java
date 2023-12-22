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
 */
public enum SpinnerType implements Type, Style.HasCssName {
    BORDER("label-default"),
    GROW("label-primary");

    private final String cssClass;

    SpinnerType(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static SpinnerType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, SpinnerType.class, BORDER);
    }
}
