package org.gwtbootstrap5.client.ui;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap5
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


import org.gwtbootstrap5.client.ui.base.HasType;
import org.gwtbootstrap5.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap5.client.ui.constants.ImageType;

/**
 * An anchor that contains an image as the click action, used in Media Objects
 *
 * @author Joshua Godi
 */
public class ImageAnchor extends Anchor implements HasType<ImageType> {

    private final Image image = new Image();

    /**
     * Creates the base anchor with the image
     */
    public ImageAnchor() {
        super();

        add(image);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setType(final ImageType type) {
        StyleHelper.addEnumStyleName(this, type);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageType getType() {
        return ImageType.fromStyleName(getStyleName());
    }

    /**
     * Set the URL of the image
     *
     * @param url String image url
     */
    public void setUrl(final String url) {
        image.setUrl(url);
    }

    /**
     * Gets the URL of the image
     *
     * @return String image url
     */
    public String getUrl() {
        return image.getUrl();
    }

    /**
     * Sets the alt text of the image
     *
     * @param alt String image alt text
     */
    public void setAlt(final String alt) {
        image.setAltText(alt);
    }

    /**
     * Gets the alt text of the image
     *
     * @return String image alt text
     */
    public String getAlt() {
        return image.getAltText();
    }
}
