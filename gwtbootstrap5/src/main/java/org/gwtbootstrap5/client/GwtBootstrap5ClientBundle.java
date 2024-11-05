package org.gwtbootstrap5.client;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap5
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

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Sven Jacobs
 */
public interface GwtBootstrap5ClientBundle extends ClientBundle {

    GwtBootstrap5ClientBundle INSTANCE = GWT.create(GwtBootstrap5ClientBundle.class);

    @Source("resource/js/gwtbootstrap5.js")
    TextResource gwtBootstrap5();

    @Source("resource/js/jquery-3.7.1.min.cache.js")
    TextResource jQuery();

    @Source("resource/js/jquery-migrate-3.5.0.min.cache.js")
    TextResource jQueryMigrate();

    @Source("resource/js/bootstrap-5.3.3.min.cache.js")
    TextResource bootstrap();
}
