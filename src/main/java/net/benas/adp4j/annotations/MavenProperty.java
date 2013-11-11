package net.benas.adp4j.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation injects a property from a Maven context in the annotated field.
 *
 * @author lhottois (natlantisprog@gmail.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MavenProperty {

    /**
     * The property source file containing maven properties ( by default "pom.properties", as generated by maven archiver).
     * @return The property source file containing maven properties
     */
    public String source() default "pom.properties";

    /**
     * The field name in MAVEN context.
     * By default, we get the version ID.
     * @return The value in MAVEN context
     */
    public String key() default "version";

    /**
     * The artifactId of the maven JAR to search.
     */
    public String artifactId() ;

    /**
     * The groupId of the maven JAR to search.
     */
    public String groupId() ;

}
