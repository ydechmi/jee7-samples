/*
 * Copyright 2012-2015  the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yd.ejb.bean;

import javax.ejb.Stateless;

/**
 * This bean implements functions to calculate
 * the area of plane shapes
 */
@Stateless
public class AreaCalculatorBean {

    /**
     * Method to compute the area of rectangle shapes
     *
     * @param width  width of rectangle
     * @param height height of rectangle
     * @return area of rectangle
     */
    public double calculateRectangleArea(double width, double height) {
        return width*height;
    }
}
