package org.gwtbootstrap5.client.ui.constants;

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
 * @author Joshua Godi
 */
public enum InputType implements Type {
    PASSWORD("password"),
    DATETIME("datetime"),
    DATETIME_LOCAL("datetime-local"),
    DATE("date"),
    MONTH("month"),
    TIME("time"),
    WEEK("week"),
    NUMBER("number"),
    EMAIL("email"),
    FILE("file"),
    URL("url"),
    SEARCH("search"),
    TEL("tel"),
    TEXT("text"),
    COLOR("color"),
    RANGE("range");

    private final String type;

    InputType(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
