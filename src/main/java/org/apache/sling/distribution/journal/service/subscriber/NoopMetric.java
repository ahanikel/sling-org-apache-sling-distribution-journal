/*
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
package org.apache.sling.distribution.journal.service.subscriber;

import java.util.concurrent.TimeUnit;

import org.apache.sling.commons.metrics.Counter;
import org.apache.sling.commons.metrics.Histogram;
import org.apache.sling.commons.metrics.Meter;
import org.apache.sling.commons.metrics.Timer;

enum NoopMetric implements Counter, Histogram, Timer, Meter{
    INSTANCE;

    @Override
    public long getCount() {
        return 0;
    }

    @Override
    public void increment() {

    }

    @Override
    public void decrement() {

    }

    @Override
    public void increment(long n) {

    }

    @Override
    public void decrement(long n) {

    }

    @Override
    public void mark() {

    }

    @Override
    public void mark(long n) {

    }

    @Override
    public void update(long duration, TimeUnit unit) {

    }

    @Override
    public Context time() {
        return NoopContext.INSTANCE;
    }

    @Override
    public void update(long value) {

    }

    @Override
    public <AdapterType> AdapterType adaptTo(Class<AdapterType> type) {
        return null;
    }

    private enum NoopContext implements Context {
        INSTANCE;

        @Override
        public long stop() {
            return 0;
        }

        @Override
        public void close() {

        }
    }
}
