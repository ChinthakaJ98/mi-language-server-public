/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
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

package org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.transformation.enrich;

import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.STNode;

public class TargetEnrich extends STNode {

    TargetEnrichAction action;
    TargetEnrichType type;
    String xpath;
    String property;

    public TargetEnrichAction getAction() {

        return action;
    }

    public void setAction(TargetEnrichAction action) {

        this.action = action;
    }

    public TargetEnrichType getType() {

        return type;
    }

    public void setType(TargetEnrichType type) {

        this.type = type;
    }

    public String getXpath() {

        return xpath;
    }

    public void setXpath(String xpath) {

        this.xpath = xpath;
    }

    public String getProperty() {

        return property;
    }

    public void setProperty(String property) {

        this.property = property;
    }
}
