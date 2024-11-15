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

import org.gwtbootstrap5.client.ui.base.HasActive;
import org.gwtbootstrap5.client.ui.base.HasType;
import org.gwtbootstrap5.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap5.client.ui.base.mixin.ActiveMixin;
import org.gwtbootstrap5.client.ui.constants.ProgressType;
import org.gwtbootstrap5.client.ui.constants.Styles;
import org.gwtbootstrap5.client.ui.html.Div;

/**
 * @author Joshua Godi
 */
public class Progress extends Div implements HasType<ProgressType>, HasActive {
    private final ActiveMixin<Progress> activeMixin = new ActiveMixin<>(this);

    public Progress() {
        super();

        setStyleName(Styles.PROGRESS);
    }

    @Override
    public void setActive(final boolean active) {
        activeMixin.setActive(active);
    }

    @Override
    public boolean isActive() {
        return activeMixin.isActive();
    }

    @Override
    public void setType(final ProgressType type) {
        StyleHelper.addUniqueEnumStyleName(this, ProgressType.class, type);
    }

    @Override
    public ProgressType getType() {
        return ProgressType.fromStyleName(getStyleName());
    }
}
