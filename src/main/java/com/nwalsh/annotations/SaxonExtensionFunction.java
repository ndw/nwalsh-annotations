package com.nwalsh.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.atteo.classindex.IndexAnnotated;

/**
 * An annotation for identifying classes that implement SaxonExtensionFunctions.
 * <p>
 * XML Calabash will automatically attempt to register any extension functions that so annotated.
 *
 * @author ndw
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@IndexAnnotated
public @interface SaxonExtensionFunction {
    /**
     * A logging level hint.
     *
     * The warning level is a hint to the runtime processor about how agressively to report
     * instantiation (and other errors). For completely standalone classes, it's reasonable
     * to give quite assertive warnings (e.g. INFO). For classes that rely on third party
     * libraries that may or may not be present, a less assertive warning (e.g. DEBUG)
     * might be more reasonable.
     *
     * @return the warning level
     */
    String warnLevel() default "INFO";
}
