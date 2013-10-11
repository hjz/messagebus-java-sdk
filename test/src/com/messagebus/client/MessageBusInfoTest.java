/*
 * Copyright (c) 2013 Mail Bypass, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License
 */

package com.messagebus.client;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MessageBusInfoTest {

    @Before
    public void initialize() {
    }

    @Test
    public void testUserAgentCheck() {
        try {
            String ua = Info.getUserAgent();
            boolean b = ua.matches("^MessageBusAPI:4.1.0-JAVA:\\d+.\\d+.\\d+\\_\\d+$");
            assertTrue("Retrieved user agent does not match regex", b);
        } catch (final Exception e) {
            e.printStackTrace();
            fail("An error was thrown:" + e.getMessage());
        }
    }

}
