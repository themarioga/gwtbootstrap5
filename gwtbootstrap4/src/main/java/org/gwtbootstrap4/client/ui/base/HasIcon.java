package org.gwtbootstrap4.client.ui.base;

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

import org.gwtbootstrap4.client.ui.constants.*;

/**
 * Interface for all the properties of Icons
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public interface HasIcon {

    void setIcon(String icon);

    String getIcon();

    void setIconType(IconType iconType);

    IconType getIconType();

    void setIconSize(IconSize iconSize);

    IconSize getIconSize();

    void setIconFlip(IconFlip iconFlip);

    IconFlip getIconFlip();

    void setIconRotate(IconRotate iconRotate);

    IconRotate getIconRotate();

    void setIconBordered(boolean iconBordered);

    boolean isIconBordered();

    void setIconInverse(boolean iconInverse);

    boolean isIconInverse();

    void setIconSpin(boolean iconSpin);

    boolean isIconSpin();

    void setIconPulse(boolean iconPulse);

    boolean isIconPulse();

    void setIconFixedWidth(boolean iconFixedWidth);

    boolean isIconFixedWidth();

    void setIconColor(String iconColor);

}
