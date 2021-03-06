/*
 *  Copyright 2018, TeamDev. All rights reserved.
 *
 *  Redistribution and use in source and/or binary forms, with or without
 *  modification, must retain the above copyright notice and the following
 *  disclaimer.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 *  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 *  OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 *  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 *  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.teamdev.jxbrowser.demo;

final class Tab {

    static final String DEFAULT_URL = "about:blank";

    private final TabCaption caption;
    private final TabContent content;

    Tab(TabCaption caption, TabContent content) {
        this.caption = caption;
        this.content = content;
    }

    TabCaption getCaption() {
        return caption;
    }

    TabContent getContent() {
        return content;
    }

    final static class Event {

        static final String CLICKED = "TabClicked";
        static final String SELECTED = "TabSelected";
        static final String CLOSED = "TabClosed";
        static final String PAGE_TITLE_CHANGED = "PageTitleChanged";
        static final String CLOSE_BUTTON_PRESSED = "CloseButtonPressed";

        /** Prevents instantiation of this constant holder class. */
        private Event() {
        }
    }
}
