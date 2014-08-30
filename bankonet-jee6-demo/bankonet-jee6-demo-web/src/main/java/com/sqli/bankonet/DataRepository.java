package com.sqli.bankonet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * This is the CDI {@link Qualifier} that can be used to determine what objects
 * qualify for which injection points. For this application, it is used to
 * qualify the {@link EntityManager} injection point.
 * 
 */
@Qualifier
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataRepository {}
