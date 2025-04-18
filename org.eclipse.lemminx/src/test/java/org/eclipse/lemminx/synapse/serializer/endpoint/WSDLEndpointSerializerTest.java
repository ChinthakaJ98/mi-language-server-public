/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.eclipse.lemminx.synapse.serializer.endpoint;

import org.junit.jupiter.api.Test;

public class WSDLEndpointSerializerTest extends EndpointSerializerTest {

    @Test
    public void testWSDLEndpoint() {

        String xml = "<endpoint xmlns=\"http://ws.apache.org/ns/synapse\" name=\"wsdl\">" +
                "<wsdl uri=\"http://folce.com\" service=\"service\" port=\"4315\">" +
                "<suspendOnFailure>" +
                "<initialDuration>-1</initialDuration>" +
                "<progressionFactor>1.0</progressionFactor>" +
                "</suspendOnFailure>" +
                "<markForSuspension>" +
                "<retriesBeforeSuspension>0</retriesBeforeSuspension>" +
                "</markForSuspension>" +
                "</wsdl>" +
                "</endpoint>";
        testSerializeEndpoint(xml);
    }
}
