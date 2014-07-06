#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api

import groovy.util.logging.Slf4j

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.UriInfo

/**
 *
 * Example resource provider.
 * <p>
 * It should be registered to Application. Check {@link ${package}.api.RestApplication}
 * </p>
 *
 * @author Thamme Gowda (thammegowda@simplyphi.com)
 * @version 0.1
 * @since 0.1
 *
 * @see RestApplication
 */

@Path("hello")
@Slf4j
class HelloResource {

    /**
     *  Hello world example that shows Hp
     * @param context  : Context provides access to request parameters
     * @return JSON response with OK status code
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    def getHello(@Context UriInfo context){
        log.debug "hello Get : ${symbol_dollar}{context.requestUri.path}"
        def resp = [
            message : "Hello World (Groovy)",
            request :[
                params : context.queryParameters,
                from: context.requestUri.host
            ]
        ]
        return Response.status(Response.Status.OK).entity(resp).build()
    }
}
