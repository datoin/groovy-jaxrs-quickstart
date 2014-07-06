#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service

import spock.lang.Specification

public class SampleServiceTest extends Specification{

    def "Test Sample Service"() {
        expect:
          assert SampleService.instance.sampleTask() == "ok"
    }
}
