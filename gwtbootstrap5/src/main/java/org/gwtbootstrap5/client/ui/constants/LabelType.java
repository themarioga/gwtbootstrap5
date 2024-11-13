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

import org.gwtbootstrap5.client.ui.base.helper.EnumHelper;

import com.google.gwt.dom.client.Style;

/**
 * @author Sven Jacobs
 */
public enum LabelType implements Type, Style.HasCssName {
    DEFAULT("label-default"),
    PRIMARY("label-primary"),
    SUCCESS("label-success"),
    INFO("label-info"),
    WARNING("label-warning"),
    DANGER("label-danger");

    private final String cssClass;

    LabelType(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static LabelType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, LabelType.class, DEFAULT);
    }
}