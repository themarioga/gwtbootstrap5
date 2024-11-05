package org.gwtbootstrap5.client.ui.form.validator;

import org.gwtbootstrap5.client.ui.form.validator.ValidationMessages.Keys;

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

/**
 * Decimal max validator. Checks to see if the decimal value is over the maximum value.
 *
 * @param <T> the generic type
 * @author Steven Jardine
 */
public class DecimalMaxValidator<T> extends AbstractValidator<T> {

    private Number maxValue;

    /**
     * Constructor.
     *
     * @param maxValue the max value
     */
    public DecimalMaxValidator(Number maxValue) {
        super(Keys.DECIMAL_MAX, new Object[] { maxValue.toString() });
        this.maxValue = maxValue;
    }

    /**
     * Constructor.
     *
     * @param maxValue the max value
     * @param invalidMessageOverride the invalid message override
     */
    public DecimalMaxValidator(Number maxValue, String invalidMessageOverride) {
        super(invalidMessageOverride);
        this.maxValue = maxValue;
    }

    /** {@inheritDoc} */
    @Override
    public int getPriority() {
        return Priority.MEDIUM;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isValid(T value) {
        if (value == null) { return true; }
        if (value instanceof Number) {
            return ((Number) value).doubleValue() <= maxValue.doubleValue();
        } else {
            return Double.valueOf(value.toString()).doubleValue() <= maxValue.doubleValue();
        }
    }

}
