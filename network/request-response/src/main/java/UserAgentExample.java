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

 import com.teamdev.jxbrowser.chromium.Browser;
 import com.teamdev.jxbrowser.chromium.BrowserPreferences;
 import com.teamdev.jxbrowser.chromium.swing.BrowserView;

 import javax.swing.*;
 import java.awt.*;

 /**
  * The example demonstrates how to configure user-agent string
  * for all Browser instances.
  */
 public class UserAgentExample {
     public static void main(String[] args) {
         // It's very important to configure user-agent string
         // before any Browser instance is created.
         BrowserPreferences.setUserAgent("My User Agent String");

         Browser browser = new Browser();
         BrowserView browserView = new BrowserView(browser);

         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         frame.add(browserView, BorderLayout.CENTER);
         frame.setSize(700, 500);
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);

         browser.loadURL("http://whatsmyuseragent.com/");
     }
 }