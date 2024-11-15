package org.gwtbootstrap5.client.ui.base.mixin;

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

import org.gwtbootstrap5.client.ui.base.HasPull;
import org.gwtbootstrap5.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap5.client.ui.constants.FloatCSS;

import com.google.gwt.user.client.ui.UIObject;

/**
 * @author Sven Jacobs
 */
public class PullMixin<T extends UIObject & HasPull> extends AbstractMixin implements HasPull {

    public PullMixin(final T uiObject) {
        super(uiObject);
    }

    @Override
    public void setPull(final FloatCSS aFloatCSS) {
        StyleHelper.addUniqueEnumStyleName(uiObject, FloatCSS.class, aFloatCSS);
    }

    @Override
    public FloatCSS getPull() {
        return FloatCSS.fromStyleName(uiObject.getStyleName());
    }
}
