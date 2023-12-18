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

public enum ResponsivenessNone implements Type, Style.HasCssName {
    XS("d-none"),
    SM("d-sm-none"),
    MD("d-md-none"),
    LG("d-lg-none"),
    XL("d-xl-none"),
    PRINT("d-print-none");

    private final String cssClass;

    ResponsivenessNone(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static ResponsivenessNone fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, ResponsivenessNone.class, XS);
    }

}
