#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

public class HelloResource2Test extends JerseyTest {


    @Override
    protected Application configure() {
        return new ResourceConfig(HelloResource2.class);
    }

    @Test
    public void testGetHello() throws Exception {
        Response response = target("hello2").request().get();
        assertTrue(response.getStatus() == 200);
        assertTrue(response.getEntity() != null);
        assertNotNull(response);
    }
}
