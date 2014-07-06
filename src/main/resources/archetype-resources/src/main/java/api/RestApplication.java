#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Jersey2.x Rest API web application, configured with POJO to JSON mapping and multi-part
 * support.
 * <p>
 *     This needs to be registered in webapp/WEB_INF/web.xml as javax.ws.rs.Application
 * </p>
 * @author Thamme Gowda N(thammegowda@simplyphi.com)
 * @since 0.1
 * @version 0.1
 */

@ApplicationPath("/")
public class RestApplication extends ResourceConfig {

    public RestApplication() {
        super(
            HelloResource.class,   //sample resource provider class in groovy
            HelloResource2.class,  // sample resource provider class in java
            MultiPartFeature.class // required for multi-part support
        );
    }
}
