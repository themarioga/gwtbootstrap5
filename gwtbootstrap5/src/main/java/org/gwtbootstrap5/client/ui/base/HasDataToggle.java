package org.gwtbootstrap5.client.ui.base;

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

import org.gwtbootstrap5.client.ui.constants.Toggle;

/**
 * @author Sven Jacobs
 */
public interface HasDataToggle {
    /**
     * Sets the attribute data-toggle on the widget
     *
     * @param toggle Toggle toggle attribute
     */
    void setDataToggle(Toggle toggle);

    /**
     * Gets the data-toggle attribute on the widget
     *
     * @return Toggle data-toggle attribute
     */
    Toggle getDataToggle();
}
