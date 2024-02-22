package org.gwtbootstrap4.client.ui.base.helper;

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


import com.google.gwt.dom.client.Element;
import org.gwtbootstrap4.client.ui.constants.Attributes;

public class RoleHelper {

    public static void setRole(Element element, String role) {
        element.setAttribute(Attributes.ROLE, role);
    }

    public static void removeRole(Element element) {
        element.removeAttribute(Attributes.ROLE);
    }

    public static String getRole(Element element) {
        return element.getAttribute(Attributes.ROLE);
    }

    public static boolean hasRole(Element element) {
        return element.getAttribute(Attributes.ROLE) != null;
    }

}
