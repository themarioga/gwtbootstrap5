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

import org.gwtbootstrap4.client.ui.constants.Styles;
import org.gwtbootstrap4.client.ui.constants.ToastRole;
import org.gwtbootstrap4.client.ui.gwt.HTMLPanel;
import org.gwtbootstrap4.client.ui.html.Div;
import org.gwtbootstrap4.client.ui.html.Span;
import org.gwtbootstrap4.client.ui.html.Strong;

public class Toast extends Div {

    public Toast(ToastRole toastRole, String title, String subtitle, String msg) {
        setId(HTMLPanel.createUniqueId());

        setStyleName(Styles.TOAST);
        addStyleName(Styles.HIDE);

        setToastAttributes(toastRole);

        add(generateToastHeader(title, subtitle));

        add(generateToastBody(msg));

        init(getId());
    }

    public void setAnimation(boolean isAnimated) {
        getElement().setAttribute("data-animation", String.valueOf(isAnimated));
    }

    public void setDelay(int delayMs) {
        getElement().setAttribute("data-delay", String.valueOf(delayMs));
    }

    public void setAutohide(boolean hasAutohide) {
        getElement().setAttribute("data-autohide", String.valueOf(hasAutohide));
    }

    private void setToastAttributes(ToastRole toastRole) {
        getElement().setAttribute("role", toastRole.getRole());
        getElement().setAttribute("aria-live", toastRole.getAriaLive());
        getElement().setAttribute("aria-atomic", "true");

        setAnimation(true);
        setDelay(5000);
        setAutohide(true);
    }

    private static Div generateToastHeader(String title, String subtitle) {
        Div header = new Div();
        header.setStyleName(Styles.TOAST_HAEDER);

        Strong titleElement = new Strong();
        titleElement.setStyleName("mr-auto");
        titleElement.setText(title);
        header.add(titleElement);

        Strong subtitleElement = new Strong();
        subtitleElement.setText(subtitle);
        header.add(subtitleElement);

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

}
