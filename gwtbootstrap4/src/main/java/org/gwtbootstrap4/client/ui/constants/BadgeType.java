package org.gwtbootstrap4.client.ui.constants;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 - 2023 GwtBootstrap4
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

public enum BadgeType implements Style.HasCssName, Type {
    DEFAULT(""),
    PRIMARY("badge-primary"),
    SECONDARY("badge-secondary"),
    SUCCESS("badge-success"),
    DANGER("badge-danger"),
    WARNING("badge-warning"),
    INFO("badge-info"),
    LIGHT("badge-light"),
    DARK("badge-dark");

    private final String cssClassName;

    BadgeType(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    @Override
    public String getCssName() {
        return cssClassName;
    }

    public static BadgeType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, BadgeType.class, DEFAULT);
    }
}
