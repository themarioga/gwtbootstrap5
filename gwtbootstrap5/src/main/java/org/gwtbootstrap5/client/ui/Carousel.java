package org.gwtbootstrap5.client.ui;

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

import org.gwtbootstrap5.client.shared.event.CarouselSlidEvent;
import org.gwtbootstrap5.client.shared.event.CarouselSlidHandler;
import org.gwtbootstrap5.client.shared.event.CarouselSlideEvent;
import org.gwtbootstrap5.client.shared.event.CarouselSlideHandler;
import org.gwtbootstrap5.client.shared.js.JQuery;
import org.gwtbootstrap5.client.ui.constants.Attributes;
import org.gwtbootstrap5.client.ui.constants.Styles;
import org.gwtbootstrap5.client.ui.html.Div;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Event;

import jsinterop.annotations.JsMethod;

/**
 * @author Joshua Godi
 */
public class Carousel extends Div {
    public static final String HOVER = "hover";
    public static final String CAROUSEL = "carousel";
    public static final String CYCLE = "cycle";
    public static final String PAUSE = "pause";
    public static final String PREV = "prev";
    public static final String NEXT = "next";

    // Bootstrap default values: http://getbootstrap.com/javascript/#carousel
    private int interval = 5000;
    private String pause = HOVER;
    private boolean wrap = true;

    public Carousel() {
        super();

        // Set the default styles
        setStyleName(Styles.CAROUSEL);
        addStyleName(Styles.SLIDE);

        // Set the default attribute
        getElement().setAttribute(Attributes.DATA_RIDE, CAROUSEL);
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        // Bind jquery events
        bindJavaScriptEvents(getElement());

        // Configure the carousel
        carousel(getElement(), interval, pause, wrap);
    }

    @Override
    protected void onUnload() {
        super.onUnload();

        // Unbind events
        unbindJavaScriptEvents(getElement());
    }

    public void setInterval(final int interval) {
        this.interval = interval;
    }

    public void setPause(final String pause) {
        this.pause = pause;
    }

    public void setWrap(final boolean wrap) {
        this.wrap = wrap;
    }

    public void setFade(final boolean fade) {
        if (fade) {
            addStyleName(Styles.CAROUSEL_FADE);
        } else {
            removeStyleName(Styles.CAROUSEL_FADE);
        }
    }

    public void setDark(final boolean dark) {
        if (dark) {
            addStyleName(Styles.CAROUSEL_DARK);
        } else {
            removeStyleName(Styles.CAROUSEL_DARK);
        }
    }

    /**
     * Causes the carousel to cycle
     */
    public void cycleCarousel() {
        fireMethod(getElement(), CYCLE);
    }

    /**
     * Causes the carousel to pause movement
     */
    public void pauseCarousel() {
        fireMethod(getElement(), PAUSE);
    }

    /**
     * Causes the carousel to jump to that slide
     */
    public void jumpToSlide(final int slideNumber) {
        fireMethod(getElement(), slideNumber);
    }

    /**
     * Causes the carousel to go back
     */
    public void goToPrev() {
        fireMethod(getElement(), PREV);
    }

    /**
     * Causes the carousel to go to the next slide
     */
    public void goToNext() {
        fireMethod(getElement(), NEXT);
    }

    public HandlerRegistration addSlideHandler(final CarouselSlideHandler carouselSlideHandler) {
        return addHandler(carouselSlideHandler, CarouselSlideEvent.getType());
    }

    public HandlerRegistration addSlidHandler(final CarouselSlidHandler slidHandler) {
        return addHandler(slidHandler, CarouselSlidEvent.getType());
    }

    /**
     * Fired when the carousel is starting to change slides
     *
     * @param evt event
     */
    private void onSlide(final Event evt) {
        fireEvent(new CarouselSlideEvent(this, evt));
    }

    /**
     * Fired when the carousel is finished changing slides
     *
     * @param evt event
     */
    private void onSlid(final Event evt) {
        fireEvent(new CarouselSlidEvent(this, evt));
    }

    private void bindJavaScriptEvents(final com.google.gwt.dom.client.Element e) {
        JQuery carousel = JQuery.jQuery(e);

        carousel.on("slide.bs.carousel", this::onSlide);

        carousel.on("slid.bs.carousel", this::onSlid);
    }

    private void unbindJavaScriptEvents(final com.google.gwt.dom.client.Element e) {
        JQuery.jQuery(e).off("slide.bs.carousel");
        JQuery.jQuery(e).off("slid.bs.carousel");
    }

    @JsMethod
    private static native void carousel(final com.google.gwt.dom.client.Element e, final int interval, final String pause,
                                        final boolean wrap);

    private void fireMethod(final com.google.gwt.dom.client.Element e, String method) {
        JQuery.jQuery(e).carousel(method);
    }

    private void fireMethod(final com.google.gwt.dom.client.Element e, int slideNumber) {
        JQuery.jQuery(e).carousel(slideNumber);
    }
}
