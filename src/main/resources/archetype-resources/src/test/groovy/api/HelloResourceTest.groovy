#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api

import ${package}.api.base.JerseySpocTest

import javax.ws.rs.client.WebTarget
import javax.ws.rs.core.Response

class HelloResourceTest extends JerseySpocTest {
   // Test HelloResource by combining Jersey Testing framework with Spock

    def "Test Hello API endpoint"() {
        given :
            WebTarget target = target("hello")
        when:
          Response response = target.request().get()
        then :
          assert response.status == 200
          def result = response.readEntity(HashMap)
          assert result.message == "Hello World (Groovy)"
    }
}
