package org.gwtbootstrap4.client.ui;

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
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap4.client.ui.base.HasSize;
import org.gwtbootstrap4.client.ui.constants.ButtonSize;
import org.gwtbootstrap4.client.ui.constants.ContainerSize;
import org.gwtbootstrap4.client.ui.html.Div;

/**
 * Div element that automatically centers contents. Fixed-width.
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 * @see Row
 * @see Column
 */
public class Container extends Div implements HasSize<ContainerSize> {

    public Container() {
        setStyleName(ContainerSize.DEFAULT.getCssName());
    }

    @Override
    public void setSize(ContainerSize size) {
        setStyleName(size.getCssName());
    }

    @Override
    public ContainerSize getSize() {
        return ContainerSize.fromStyleName(getStyleName());
    }
}