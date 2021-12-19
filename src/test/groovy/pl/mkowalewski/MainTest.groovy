package pl.mkowalewski

import spock.lang.Specification

class MainTest extends Specification {

    def "spock test"() {
        given:
        def a

        when:
        a = 1

        then:
        a == 1
    }

}
