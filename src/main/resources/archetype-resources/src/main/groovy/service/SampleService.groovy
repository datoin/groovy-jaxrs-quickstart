#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service

import groovy.util.logging.Slf4j

/**
 * An example Service. This class has a singleton
 * @author Thamme Gowda N (thammegowda@simplyphi.com)
 *
 */
@Slf4j
@Singleton(lazy = true)
class SampleService {

    /**
     * This block demonstrates the power of Groovy's {@link ConfigSlurper}.
     * Say good bye to java's properties and say hello to groovy's config blocks!
     */
    static def config
    static {
        def CONFIG_FILE = "config.groovy"
        def resourceUri = SampleService.class.classLoader.getResource(CONFIG_FILE)
        assert resourceUri
        config = new ConfigSlurper().parse(resourceUri)
        log.info "Initialised Config from ${symbol_dollar}resourceUri"
    }

    /**
     * Sample Task performed by this service
     * @return "ok"
     */
    def sampleTask(){
        log.info("task called")
        log.info "Config Example : ${symbol_dollar}{config.config1}"
        return "ok"
    }
}
