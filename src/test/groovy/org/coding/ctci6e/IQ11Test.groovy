package org.coding.ctci6e

import org.coding.ctci6e.IQ11
import spock.lang.Specification

class IQ11Test extends Specification{

    def subject = new IQ11()

    def "is unique - unique chars - true"() {
        when:
        def unique = subject.isUnique(s)
        then:
        unique
        where:
        s << ["a", "a", "ab", "12", ",.", "a1."]
    }

    def "is unique - not unique chars - false"() {
        when:
        def unique = subject.isUnique(s)
        then:
        !unique
        where:
        s << ["aa", "aab", "11", "a1,1", ".."]
    }

    def "is unique without data structure - unique chars - true"() {
        when:
        def unique = subject.isUniqueWithoutDataStructure(s)
        then:
        unique
        where:
        s << ["a", "a", "ab", "12", ",.", "a1."]
    }

    def "is unique without data structure - not unique chars - false"() {
        when:
        def unique = subject.isUniqueWithoutDataStructure(s)
        then:
        !unique
        where:
        s << ["aa", "aab", "11", "a1,1", ".."]
    }

}
