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
/*
 *
 */
package org.apache.lens.api.query;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The Class PersistentQueryResult.
 */
@XmlRootElement
/**
 * Instantiates a new persistent query result.
 *
 * @param persistedURI
 *          the persisted uri
 * @param numRows
 *          the num rows
 */
@AllArgsConstructor
/**
 * Instantiates a new persistent query result.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PersistentQueryResult extends QueryResult {

  /**
   * The persisted uri.
   */
  @XmlElement
  @Getter
  private String persistedURI;

  /**
   * The num rows.
   */
  @XmlElement
  @Getter
  private Integer numRows;

  /**
   * The file size.
   */
  @XmlElement
  @Getter
  private Long fileSize;

  @XmlElement
  @Getter
  private String httpResultUrl;

  @Override
  public String toPrettyString() {
    StringBuilder sb = new StringBuilder().append("Result available at ").append(persistedURI).append(".");
    if (numRows != null) {
      sb.append(" Number of rows: ").append(numRows).append(".");
    }
    if (fileSize != null) {
      sb.append(" File size: ").append(fileSize).append(".");
    }
    if (httpResultUrl != null) {
      sb.append(" Downloadable from ").append(httpResultUrl).append(".");
    }
    else {
      sb.append(" Result can not be downloaded directly. It can only be consumed from provided File System location");
    }
    return sb.toString();
  }
}
