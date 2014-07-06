#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * An example REST resource in Java. See {@link ${package}.api.HelloResource}
 * for groovy implementations
 *
 * @author Thamme Gowda N (thammegowda@simplyphi.com)
 * @see ${package}.api.HelloResource
 */
@Path("hello2")
public class HelloResource2 {

    private static final Logger LOG = LoggerFactory.getLogger(HelloResource2.class);
    /**
     * Get Hello World Message
     * @param context : request context which provides deeper info of HTTP request
     * @return JSON response with status code OK
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(@Context final UriInfo context){
        LOG.debug("Get Hello," + context.getPath());
        Map<String, Object> resp = new HashMap<String, Object>(){{
            put("message", "Hello World, (Java)!");
            put("params", context.getQueryParameters());
        }};
        return Response.status(Response.Status.OK).entity(resp).build();
    }
}
