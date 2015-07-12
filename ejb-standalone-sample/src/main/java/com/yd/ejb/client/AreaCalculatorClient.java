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

package com.yd.ejb.client;

import com.yd.ejb.bean.AreaCalculatorBean;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.io.File;
import java.util.Properties;

/**
 * Client of AreaCalculatorBean with an embedded EJB container
 * This client creates an embedded EJB container to deploy AreaCalculatorBean
 * and call method of AreaCalculatorBean.
 */
public class AreaCalculatorClient {

    static EJBContainer ec;

    public static void main(String[] args) {
        System.out.println("Start embedded ejb container");
        Properties prop = new Properties();
        File ejbJarFile = new File("ejb-standalone-sample\\target\\ejb-standalone-sample.jar");
        prop.put(EJBContainer.MODULES, ejbJarFile);
        ec = EJBContainer.createEJBContainer(prop);
        System.out.println("Embedded ejb container is started");
        Context context = ec.getContext();
        try {
            System.out.println("Lookup of AreaCalculatorBean");
            AreaCalculatorBean service = (AreaCalculatorBean) context.lookup("java:global/ejb-standalone-sample/AreaCalculatorBean");
            double width=Double.parseDouble(args[0]);
            double height=Double.parseDouble(args[1]);
            System.out.println("Call calculateRectangleArea() method of AreaCalculatorBean");
            double area=service.calculateRectangleArea(width,height);
            System.out.println("Width of rectangle :"+width+" m");
            System.out.println("Height of rectangle:"+height+" m");
            System.out.println("Area of rectangle  :"+area+ " m2");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != ec) {
                ec.close();
                System.out.println("Embedded ejb container stopped");
            }

        }
    }
}
