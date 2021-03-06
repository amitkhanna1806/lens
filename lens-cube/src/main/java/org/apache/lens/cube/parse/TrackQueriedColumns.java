/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.lens.cube.parse;

import java.util.Map;
import java.util.Set;

interface TrackQueriedColumns {

  /**
   * Get tblAlias to column
   * @return map of tblAliasToColumns
   */
  Map<String, Set<String>> getTblAliasToColumns();

  /**
   * Get columns queried by tblAlias
   *
   * @param tblAlias tbl alias name
   *
   * @return set of column names
   */
  Set<String> getColumnsQueried(String tblAlias);

  /**
   * Add given table alias and column
   * @param tblAlias Table alias
   * @param column column
   */
  void addColumnsQueried(String tblAlias, String column);

  /**
   * Add given map of tblAliasToColumns.
   *
   * @param tblAliasToColumns map of tblAliasToColumns
   */
  void addColumnsQueried(Map<String, Set<String>> tblAliasToColumns);
}
