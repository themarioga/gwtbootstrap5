package org.gwtbootstrap5.client.ui;

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
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap5.client.ui.constants.IconType;
import org.gwtbootstrap5.client.ui.constants.IconTypeBrands;
import org.gwtbootstrap5.client.ui.constants.Placement;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.DomEvent;

/**
 * Tooltip help block. Tooltips can be styled by specifiying the tooltip-danger class in your css.
 * 
 * @author Steven Jardine
 */
public class TooltipHelpBlock extends Tooltip {

    private static final String TOOLTIP_DANGER_CLASS = "tooltip-danger";

    /**
     * Constructor.
     */
    public TooltipHelpBlock() {
        super();
        setPlacement(Placement.RIGHT);
        addTooltipClassName(TOOLTIP_DANGER_CLASS);
        // Create the help block.
        InlineHelpBlock helpBlock = new InlineHelpBlock() {

            @Override
            public String getHTML() {
                return TooltipHelpBlock.this.getTitle();
            }

            @Override
            public String getText() {
                return TooltipHelpBlock.this.getTitle();
            }

            @Override
            public void setHTML(final String html) {
                setText(html);
                TooltipHelpBlock.this.setIsHtml(true);
            }

            @Override
            public void setText(final String value) {
                String oldValue = TooltipHelpBlock.this.getTitle();
                TooltipHelpBlock.this.setIsHtml(false);
                TooltipHelpBlock.this.setTitle(value);
                if (oldValue != null && !oldValue.equals(value)) {
                    DomEvent.fireNativeEvent(Document.get().createChangeEvent(), this);
                }
            }
        };
        helpBlock.getElement().getStyle().setPaddingLeft(0, Unit.PX);
        helpBlock.setIconType(IconTypeBrands.EXCLAMATION_TRIANGLE);
        setWidget(helpBlock);
    }

    /**
     * Gets the icon type.
     *
     * @return the icon type
     */
    public IconType getIconType() {
        return ((HelpBlock) getWidget()).getIconType();
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText() {
        return getTitle();
    }

    /**
     * Sets the icon type.
     *
     * @param iconType the new icon type
     */
    public void setIconType(final IconType iconType) {
        ((HelpBlock) getWidget()).setIconType(iconType);
    }

}
