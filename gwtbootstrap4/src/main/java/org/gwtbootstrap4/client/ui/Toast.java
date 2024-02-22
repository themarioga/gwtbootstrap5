package org.gwtbootstrap4.client.ui;

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

import org.gwtbootstrap4.client.ui.base.helper.RoleHelper;
import org.gwtbootstrap4.client.ui.constants.Roles;
import org.gwtbootstrap4.client.ui.constants.Styles;
import org.gwtbootstrap4.client.ui.constants.ToastRole;
import org.gwtbootstrap4.client.ui.gwt.HTMLPanel;
import org.gwtbootstrap4.client.ui.html.Div;
import org.gwtbootstrap4.client.ui.html.Small;
import org.gwtbootstrap4.client.ui.html.Span;
import org.gwtbootstrap4.client.ui.html.Strong;

public class Toast extends Div {

    public static final int DEFAULT_DELAY_MS = 5000;

    public Toast(ToastRole toastRole, String title, String subtitle, String msg) {
        super();

        setId(HTMLPanel.createUniqueId());

        setStyleName(Styles.TOAST);
        addStyleName(Styles.HIDE);

        setToastAttributes(toastRole);

        add(generateToastHeader(title, subtitle));

        add(generateToastBody(msg));
    }

    public void init() {
        init(getId());
    }

    public void show() {
        show(getId());
    }

    public void setAnimation(boolean isAnimated, boolean triggerChange) {
        getElement().setAttribute("data-animation", String.valueOf(isAnimated));

        if (triggerChange) {
            setAttribute(getId(), "animation", String.valueOf(isAnimated));
        }
    }

    public void setDelay(int delayMs, boolean triggerChange) {
        getElement().setAttribute("data-delay", String.valueOf(delayMs));

        if (triggerChange) {
            setAttribute(getId(), "delay", String.valueOf(delayMs));
        }
    }

    public void setAutohide(boolean hasAutohide, boolean triggerChange) {
        getElement().setAttribute("data-autohide", String.valueOf(hasAutohide));

        if (triggerChange) {
            setAttribute(getId(), "autohide", String.valueOf(hasAutohide));
        }
    }

    private void setToastAttributes(ToastRole toastRole) {
        RoleHelper.setRole(getElement(), toastRole.getRole());

        getElement().setAttribute("aria-live", toastRole.getAriaLive());
        getElement().setAttribute("aria-atomic", "true");

        setAnimation(true, false);
        setDelay(DEFAULT_DELAY_MS, false);
        setAutohide(true, false);
    }

    private static Div generateToastHeader(String title, String subtitle) {
        Div header = new Div();
        header.setStyleName(Styles.TOAST_HAEDER);

        if (title != null && !title.isEmpty()) {
            Strong titleElement = new Strong();
            titleElement.setStyleName("mr-auto");
            titleElement.setText(title);
            header.add(titleElement);
        }

        if (subtitle != null && !subtitle.isEmpty()) {
            Small subtitleElement = new Small();
            subtitleElement.setText(subtitle);
            header.add(subtitleElement);
        }

        Button closeButton = new Button();
        closeButton.getElement().setAttribute("type", "button");
        closeButton.getElement().setAttribute("data-dismiss", "toast");
        closeButton.getElement().setAttribute("aria-label", "Close");
        closeButton.addStyleName("ml-2 mb-1 close");
        Span closeButtonTitle = new Span();
        closeButtonTitle.getElement().setAttribute("aria-hidden", "true");
        closeButtonTitle.getElement().setInnerHTML("&times;");
        closeButton.add(closeButtonTitle);
        header.add(closeButton);

        return header;
    }

    private static Div generateToastBody(String msg) {
        Div body = new Div();
        body.setStyleName(Styles.TOAST_BODY);
        body.getElement().setInnerText(msg);

        return body;
    }

    private native void init(String elementId) /*-{
        $wnd.jQuery("#" + elementId).toast();
    }-*/;

    private native void setAttribute(String elementId, String attribute, String value) /*-{
        $wnd.jQuery("#" + elementId).toast({attribute: value});
    }-*/;

    private native void show(String elementId) /*-{
        $wnd.jQuery("#" + elementId).toast("show");
    }-*/;

}
