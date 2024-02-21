package org.gwtbootstrap4.client.ui;

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

import org.gwtbootstrap4.client.ui.base.HasActive;
import org.gwtbootstrap4.client.ui.base.mixin.ActiveMixin;
import org.gwtbootstrap4.client.ui.constants.Styles;

public class AnchorNavLink extends Anchor implements HasActive {

    private final ActiveMixin<AnchorNavLink> activeMixin = new ActiveMixin<>(this);

    public AnchorNavLink() {
        addStyleName(Styles.NAV_LINK);
    }

    @Override
    public void setActive(boolean active) {
        activeMixin.setActive(active);
    }

    @Override
    public boolean isActive() {
        return activeMixin.isActive();
    }

}
