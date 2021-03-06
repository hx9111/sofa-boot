/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.healthcheck.bean;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 *
 * @author liangen
 * @version $Id: HealthIndicatorB.java, v 0.1 2018年03月11日 下午1:44 liangen Exp $
 */
public class HealthIndicatorB implements HealthIndicator {

    private static boolean health = false;

    @Override
    public Health health() {
        if (health) {
            return Health.up().withDetail("hard disk", "hard disk is ok").build();
        } else {
            return Health.down().withDetail("hard disk", "hard disk is bad").build();

        }
    }

    public static void setHealth(boolean health) {
        HealthIndicatorB.health = health;
    }
}