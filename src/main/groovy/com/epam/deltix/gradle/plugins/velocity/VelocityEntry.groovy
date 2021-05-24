/*
 * Copyright 2021 EPAM Systems, Inc
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.epam.deltix.gradle.plugins.velocity

/**
 * Created by PastushenyaV on 7/26/2016.
 */
class VelocityEntry {
    final String name
    String from
    String to           //can be with parameters @{param_name}
    List<Map> contexts

    VelocityEntry(String name) {
        this.name = name
    }

    String toString() {
        return String.format('%s: %s %s %s', name, from, to, contexts)
    }
}