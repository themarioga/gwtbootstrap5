package org.gwtbootstrap5.client.ui.form.validator;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2015 GwtBootstrap5
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

import java.util.MissingResourceException;

import com.google.gwt.core.client.GWT;

/**
 * Default implementation of the validator message mixin. This can be replaced with your own version by using
 * a "replace-with" statment in the gwt module file.
 * 
 * Example:
 * 
 * <pre>
 * {@code
 * <replace-with class="...CustomValidatorMessageMixin">
 *     <when-type-is class="org.gwtbootstrap5.client.ui.form.validator.ValidatorMessageMixin" />
 * </replace-with>
 * }
 * </pre>
 * 
 * @author Steven Jardine
 */
public class DefaultValidatorMessageMixin implements ValidatorMessageMixin {

    protected ValidationMessages messages = GWT.create(ValidationMessages.class);

    /** {@inheritDoc} */
    public String lookup(String key) {
        try {
            // Replace "." with "_" in the key.
            return key == null ? null : messages.getString(key.replace(".", "_"));
        } catch (MissingResourceException e) {
            return null;
        }
    }

    /** {@inheritDoc} */
    @Override
    public String lookup(String key, Object[] msgValues) {
        String msg = lookup(key);
        if (msg != null) {
            msg = MessageFormat.format(msg, msgValues);
        }
        return msg;
    }

}
