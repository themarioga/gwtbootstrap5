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

/**
 * A widget that implements this interface can be put in a "readonly"
 * state.
 */
public interface HasReadOnly {

    /**
     * Determines whether or not the widget is read-only.
     * 
     * @return <code>true</code> if the widget is currently read-only,
     *         <code>false</code> if the widget is currently editable
     */
    boolean isReadOnly();

    /**
     * Turns read-only mode on or off.
     * 
     * @param readOnly if <code>true</code>, the widget becomes read-only; if
     *          <code>false</code> the widget becomes editable
     */
    void setReadOnly(boolean readOnly);

}
