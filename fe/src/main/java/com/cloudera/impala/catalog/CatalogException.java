// Copyright 2012 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.impala.catalog;

import com.cloudera.impala.common.ImpalaException;

/**
 * Base class for exceptions related to accessing objects in the Catalog.
 */
public abstract class CatalogException extends ImpalaException {
  // Dummy serial UID to avoid Eclipse warnings
  private static final long serialVersionUID = -1273205863485997544L;

  public CatalogException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public CatalogException(String msg) {
    super(msg);
  }
}