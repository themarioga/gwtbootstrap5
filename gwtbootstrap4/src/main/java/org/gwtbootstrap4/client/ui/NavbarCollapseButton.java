package org.gwtbootstrap4.client.ui;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 GwtBootstrap4
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

import java.util.List;

import org.gwtbootstrap4.client.ui.base.HasDataTarget;
import org.gwtbootstrap4.client.ui.base.HasPull;
import org.gwtbootstrap4.client.ui.base.HasResponsiveness;
import org.gwtbootstrap4.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap4.client.ui.base.mixin.PullMixin;
import org.gwtbootstrap4.client.ui.constants.*;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap4.client.ui.html.Span;

/**
 * Special button to toggle collapsible area of {@link Navbar}.
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 * @see NavbarCollapse
 */
public class NavbarCollapseButton extends Composite implements HasDataTarget, HasResponsiveness, HasPull {

    private final PullMixin<NavbarCollapseButton> pullMixin = new PullMixin<NavbarCollapseButton>(this);
    private final Button button;

    public NavbarCollapseButton() {
        super();

        button = new Button();
        button.setStyleName(Styles.NAVBAR_TOGGLER);
        button.setDataToggle(Toggle.COLLAPSE);

        Span navbarIcon = new Span();
        navbarIcon.setStyleName(Styles.NAVBAR_TOGGLER_ICON);
        button.add(navbarIcon);

        initWidget(button);
    }

    @Override
    public void setDataTargetWidgets(final List<Widget> widgets) {
        button.setDataTargetWidgets(widgets);
    }

    @Override
    public void setDataTargetWidget(final Widget widget) {
        button.setDataTargetWidget(widget);
    }

    @Override
    public void setDataTarget(final String dataTarget) {
        button.setDataTarget(dataTarget);
    }

    @Override
    public String getDataTarget() {
        return button.getDataTarget();
    }

    public void setAriaControls(final String ariaControls) {
        if (ariaControls != null) {
            button.getElement().setAttribute(Attributes.ARIA_CONTROLS, ariaControls);
        } else {
            button.getElement().removeAttribute(Attributes.ARIA_CONTROLS);
        }
    }

    public String getAriaControls() {
        return button.getElement().getAttribute(Attributes.ARIA_CONTROLS);
    }

    public void setAriaExpanded(final String ariaExpanded) {
        if (ariaExpanded != null) {
            button.getElement().setAttribute(Attributes.ARIA_EXPANDED, ariaExpanded);
        } else {
            button.getElement().removeAttribute(Attributes.ARIA_EXPANDED);
        }
    }

    public String getAriaExpanded() {
        return button.getElement().getAttribute(Attributes.ARIA_EXPANDED);
    }

    public void setAriaLabel(final String ariaLabel) {
        if (ariaLabel != null) {
            button.getElement().setAttribute(Attributes.ARIA_LABEL, ariaLabel);
        } else {
            button.getElement().removeAttribute(Attributes.ARIA_LABEL);
        }
    }

    public String getAriaLabel() {
        return button.getElement().getAttribute(Attributes.ARIA_LABEL);
    }

    @Override
    public void setVisibleOn(final DeviceSize deviceSize) {
        StyleHelper.setVisibleOn(this, deviceSize);
    }

    @Override
    public void setHiddenOn(final DeviceSize deviceSize) {
        StyleHelper.setHiddenOn(this, deviceSize);
    }

    @Override
    public void setPull(final FloatCSS aFloatCSS) {
        pullMixin.setPull(aFloatCSS);
    }

    @Override
    public FloatCSS getPull() {
        return pullMixin.getPull();
    }

}
