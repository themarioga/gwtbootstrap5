package org.gwtbootstrap5.client.ui.base.button;

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

import org.gwtbootstrap5.client.ui.base.HasBadge;
import org.gwtbootstrap5.client.ui.base.HasIcon;
import org.gwtbootstrap5.client.ui.base.HasIconPosition;
import org.gwtbootstrap5.client.ui.base.mixin.IconTextMixin;
import org.gwtbootstrap5.client.ui.constants.*;

import com.google.gwt.user.client.ui.HasText;

/**
 * Base class for buttons that can contain an icon.
 *
 * @author Sven Jacobs
 * @see org.gwtbootstrap5.client.ui.Icon
 */
public abstract class AbstractIconButton extends AbstractButton implements HasText, HasIcon, HasIconPosition, HasBadge {

    IconTextMixin<AbstractIconButton> iconTextMixin = new IconTextMixin<>(this);

    protected AbstractIconButton() { }

    protected AbstractIconButton(final ButtonType type) {
        super(type);
    }

    @Override
    public void setText(final String text) {
        iconTextMixin.setText(text);
    }

    @Override
    public String getText() {
        return iconTextMixin.getText();
    }

    @Override
    public void setIcon(final String icon) {
        iconTextMixin.setIcon(icon);
    }

    @Override
    public String getIcon() {
        return iconTextMixin.getIcon();
    }

    @Override
    public void setIconType(final IconType iconType) {
        iconTextMixin.setIconType(iconType);
    }

    @Override
    public IconType getIconType() {
        return iconTextMixin.getIconType();
    }

    @Override
    public void setIconPosition(final IconPosition iconPosition) {
        iconTextMixin.setIconPosition(iconPosition);
    }

    @Override
    public IconPosition getIconPosition() {
        return iconTextMixin.getIconPosition();
    }

    @Override
    public void setIconSize(final IconSize iconSize) {
        iconTextMixin.setIconSize(iconSize);
    }

    @Override
    public IconSize getIconSize() {
        return iconTextMixin.getIconSize();
    }

    @Override
    public void setIconFlip(final IconFlip iconFlip) {
        iconTextMixin.setIconFlip(iconFlip);
    }

    @Override
    public IconFlip getIconFlip() {
        return iconTextMixin.getIconFlip();
    }

    @Override
    public void setIconRotate(final IconRotate iconRotate) {
        iconTextMixin.setIconRotate(iconRotate);
    }

    @Override
    public IconRotate getIconRotate() {
        return iconTextMixin.getIconRotate();
    }

    @Override
    public void setIconBordered(final boolean iconBordered) {
        iconTextMixin.setIconBordered(iconBordered);
    }

    @Override
    public boolean isIconBordered() {
        return iconTextMixin.isIconBordered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setIconInverse(final boolean iconInverse) {
        iconTextMixin.setIconInverse(iconInverse);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isIconInverse() {
        return iconTextMixin.isIconInverse();
    }

    @Override
    public void setIconSpin(final boolean iconSpin) {
        iconTextMixin.setIconSpin(iconSpin);
    }

    @Override
    public boolean isIconSpin() {
        return iconTextMixin.isIconSpin();
    }

    @Override
    public void setIconPulse(boolean iconPulse) {
        iconTextMixin.setIconPulse(iconPulse);
    }

    @Override
    public boolean isIconPulse() {
        return iconTextMixin.isIconPulse();
    }

    @Override
    public void setIconFixedWidth(final boolean iconFixedWidth) {
        iconTextMixin.setIconFixedWidth(iconFixedWidth);
    }

    @Override
    public boolean isIconFixedWidth() {
        return iconTextMixin.isIconFixedWidth();
    }

    @Override
    public void setBadgeText(String badgeText) {
        iconTextMixin.setBadgeText(badgeText);
    }

    @Override
    public String getBadgeText() {
        return iconTextMixin.getBadgeText();
    }

    @Override
    public void setBadgePosition(BadgePosition badgePosition) {
        iconTextMixin.setBadgePosition(badgePosition);
    }

    @Override
    public BadgePosition getBadgePosition() {
        return iconTextMixin.getBadgePosition();
    }

    @Override
    public void setIconColor(String iconColor) {
        iconTextMixin.setIconColor(iconColor);
    }

    @Override
    public String getIconColor() {
        return iconTextMixin.getIconColor();
    }

}
