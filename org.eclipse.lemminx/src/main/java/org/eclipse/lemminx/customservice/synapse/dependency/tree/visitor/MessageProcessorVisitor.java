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

package org.eclipse.lemminx.customservice.synapse.dependency.tree.visitor;

import org.eclipse.lemminx.customservice.synapse.dependency.tree.DependencyLookUp;
import org.eclipse.lemminx.customservice.synapse.dependency.tree.DependencyVisitorUtils;
import org.eclipse.lemminx.customservice.synapse.dependency.tree.pojo.Dependency;
import org.eclipse.lemminx.customservice.synapse.dependency.tree.pojo.DependencyTree;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.MessageProcessor;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.STNode;

public class MessageProcessorVisitor extends AbstractDependencyVisitor {

    public MessageProcessorVisitor(DependencyTree dependencyTree, String projectPath) {

        super(dependencyTree, projectPath, new DependencyLookUp());

    }

    public MessageProcessorVisitor(DependencyTree dependencyTree, String projectPath,
                                   DependencyLookUp dependencyLookUp) {

        super(dependencyTree, projectPath, dependencyLookUp);
    }

    @Override
    public void visit(STNode node) {

        MessageProcessor messageProcessor = (MessageProcessor) node;

        if (messageProcessor.getMessageStore() != null) {
            Dependency dependency =
                    DependencyVisitorUtils.visitMessageStore(messageProcessor.getMessageStore(), projectPath,
                            dependencyLookUp);
            addDependency(dependency);
        }

        if (messageProcessor.getTargetEndpoint() != null) {
            Dependency dependency =
                    DependencyVisitorUtils.visitEndpoint(projectPath, messageProcessor.getTargetEndpoint(),
                            dependencyLookUp);
            addDependency(dependency);
        }
    }
}
