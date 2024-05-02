/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 - 2015 GwtBootstrap4
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

function _gwtbootstrap4_Create(parent, name, value) {
    if (typeof parent[name] === 'undefined') parent[name] = value;
}

_gwtbootstrap4_Create(this, "org", {});
_gwtbootstrap4_Create(org, "gwtbootstrap4", {});
_gwtbootstrap4_Create(org.gwtbootstrap4, "client", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client, "ui", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui, "base", {});

// AbstractTooltip
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.base, "AbstractTooltip", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.base.AbstractTooltip, "updateString",
    function(dataTarget, e, option, value) {
        window.jQuery(e).data(dataTarget).options[option] = value;
    });
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.base.AbstractTooltip, "updateBool",
    function(dataTarget, e, option, value) {
        window.jQuery(e).data(dataTarget).options[option] = value;
    });
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.base.AbstractTooltip, "updateDelay",
function(dataTarget, e, showDelay, hideDelay) {
    window.jQuery(e).data(dataTarget).options['delay'] = {
        show : showDelay,
        hide : hideDelay
    };
});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.base.AbstractTooltip, "updateViewport",
function(dataTarget, e, selector, padding) {
    window.jQuery(e).data(dataTarget).options['viewport'] = {
        selector : selector,
        padding : padding
    };
});

// Affix
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui, "Affix", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.Affix, "internalAffix",
function(e, offset) {
    window.jQuery(e).affix({
        offset: offset
    });
});

// Carousel
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui, "Carousel", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.Carousel, "carousel",
function(e, interval, pause, wrap) {
    window.jQuery(e).carousel({
        interval: interval,
        pause: pause,
        wrap: wrap
    });
});

// ScrollSpy
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui, "ScrollSpy", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.ui.ScrollSpy, "init",
function(e, target) {
    window.jQuery(e).scrollspy({
        target: target
    });
});

// EntryPoint
_gwtbootstrap4_Create(org.gwtbootstrap4.client, "GwtBootstrap4EntryPoint", {});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.GwtBootstrap4EntryPoint, "isBootstrapLoaded",
function () {
    return typeof window['jQuery'].fn.emulateTransitionEnd !== 'undefined';
});
_gwtbootstrap4_Create(org.gwtbootstrap4.client.GwtBootstrap4EntryPoint, "isjQueryLoaded",
function () {
    return (typeof window['jQuery'] !== 'undefined');
});
