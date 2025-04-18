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

package org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.advanced.DbMediator;

import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.Mediator;

public class DbMediator extends Mediator {

    DbMediatorConnection connection;
    DbMediatorStatement[] statement;
    boolean useTransaction;
    String description;

    public DbMediatorConnection getConnection() {

        return connection;
    }

    public void setConnection(DbMediatorConnection connection) {

        this.connection = connection;
    }

    public DbMediatorStatement[] getStatement() {

        return statement;
    }

    public void setStatement(DbMediatorStatement[] statement) {

        this.statement = statement;
    }

    public boolean isUseTransaction() {

        return useTransaction;
    }

    public void setUseTransaction(boolean useTransaction) {

        this.useTransaction = useTransaction;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}