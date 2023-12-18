package org.gwtbootstrap4.client.ui;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap4
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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.SimplePager;
import org.gwtbootstrap4.client.ui.base.HasPaginationSize;
import org.gwtbootstrap4.client.ui.base.HasResponsiveness;
import org.gwtbootstrap4.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap4.client.ui.constants.IconType;
import org.gwtbootstrap4.client.ui.constants.PaginationSize;
import org.gwtbootstrap4.client.ui.constants.Styles;
import org.gwtbootstrap4.client.ui.html.UnorderedList;

/**
 * Support for Bootstrap pagination (http://getbootstrap.com/components/#pagination)
 *
 * @author Joshua Godi
 */
public class PaginationItem extends ListItem {

    public PaginationItem() {
        setStyleName(Styles.PAGINATION_ITEM);
    }

}
