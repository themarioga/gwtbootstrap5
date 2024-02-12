package org.gwtbootstrap4.client.ui.constants;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 - 2024 GwtBootstrap4
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface IconType extends Type, Style.HasCssName {

    String getOrdinal();

    String getName();

    static List<IconType> getValues() {
        List<IconType> iconTypeList = new ArrayList<>();
        iconTypeList.addAll(Arrays.asList(IconTypeBrands.values()));
        iconTypeList.addAll(Arrays.asList(IconTypeSolid.values()));
        iconTypeList.addAll(Arrays.asList(IconTypeRegular.values()));
        return iconTypeList;
    }

    static IconType fromStyleName(final String styleName) {
        IconType type = EnumHelper.fromStyleName(styleName, IconTypeBrands.class, null);
        if (type == null) EnumHelper.fromStyleName(styleName, IconTypeSolid.class, null);
        if (type == null) EnumHelper.fromStyleName(styleName, IconTypeRegular.class, null);

        return type;
    }

}
