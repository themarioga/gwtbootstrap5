package org.gwtbootstrap5.client.ui.constants;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2024 GwtBootstrap5
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

public enum ToastRole {
    ALERT("alert", "assertive"),
    STATUS("status", "polite");

    String role;
    String ariaLive;

    ToastRole(String role, String ariaLive) {
        this.role = role;
        this.ariaLive = ariaLive;
    }

    public String getRole() {
        return role;
    }

    public String getAriaLive() {
        return ariaLive;
    }
}
