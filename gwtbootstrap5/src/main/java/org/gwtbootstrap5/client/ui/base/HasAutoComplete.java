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

public interface HasAutoComplete {
    public static final String AUTO_COMPLETE = "autocomplete";
    public static final String ON = "on";
    public static final String OFF = "off";

    /**
     * Sets the auto complete property on the widget
     *
     * @param autoComplete auto complete setting for the widget
     */
    void setAutoComplete(boolean autoComplete);

    /**
     * Get the auto complete attribute from the widget
     *
     * @return auto complete attribute
     */
    String getAutoComplete();
}
