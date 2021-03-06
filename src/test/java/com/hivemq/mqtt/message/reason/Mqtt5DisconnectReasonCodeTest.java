/*
 * Copyright 2019 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.mqtt.message.reason;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Florian Limpöck
 * @since 4.0.0
 */
public class Mqtt5DisconnectReasonCodeTest {

    @Test
    public void test_all_disconnect_reason_codes_available() {

        for (final Mqtt5DisconnectReasonCode reasonCode : Mqtt5DisconnectReasonCode.values()) {
            assertNotNull(Mqtt5DisconnectReasonCode.toPluginCode(reasonCode));
        }

    }
}