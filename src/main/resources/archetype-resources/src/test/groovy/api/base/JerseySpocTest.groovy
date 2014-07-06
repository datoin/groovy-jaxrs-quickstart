#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.base

import ${package}.api.RestApplication
import org.glassfish.jersey.client.ClientConfig
import org.glassfish.jersey.media.multipart.MultiPartFeature
import org.glassfish.jersey.test.JerseyTest
import spock.lang.Specification

import javax.ws.rs.client.WebTarget
import javax.ws.rs.core.Application

/**
 *
 * This class serves as base class for test cases by providing combined
 * functionality of both {@link JerseyTest} and
 * Spock Test's {@link Specification}
 *
 * @author Thamme Gowda N (thammegowda@simplyphi.com)
 *
 */
abstract class JerseySpocTest extends Specification {

    protected JerseyTest client = new JerseyTest() {

        @Override
        protected Application configure() {
            new RestApplication()
        }

        @Override
        protected void configureClient(ClientConfig config) {
            super.configureClient(config)
            config.register(MultiPartFeature.class)
        }
    };

    // dispatchers from spock testers to to Jersey tester
    void setup() {
        client.setUp()
    }

    void cleanup() {
        client.tearDown()
    }

    WebTarget target(){
        return client.target()
    }

    WebTarget target(String path){
        return client.target(path)
    }
}
