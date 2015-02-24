package com.nwalsh.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.atteo.classindex.IndexAnnotated;

/**
 * Created by ndw on 2/19/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@IndexAnnotated
public @interface SaxonExtensionFunction {
    // This annotation identifies a class that implements a Saxon 9.x extension function
}
