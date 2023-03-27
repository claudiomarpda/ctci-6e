package org.coding.ctci6e

import spock.lang.Specification

class IQ11Test extends Specification{

    def subject = new IQ11()
    def static uniqueChars = ["a", "a", "ab", "12", ",.", "a1."]
    def static notUniqueChars = ["aa", "aab", "11", "a1,1", ".."]

    def "is unique - unique chars - true"() {
        when:
        def unique = subject.isUnique(s)
        then:
        unique
        where:
        s << uniqueChars
    }

    def "is unique - not unique chars - false"() {
        when:
        def unique = subject.isUnique(s)
        then:
        !unique
        where:
        s << notUniqueChars
    }

    def "is unique without data structure - unique chars - true"() {
        when:
        def unique = subject.isUniqueBySorting(s)
        then:
        unique
        where:
        s << uniqueChars
    }

    def "is unique without data structure - not unique chars - false"() {
        when:
        def unique = subject.isUniqueBySorting(s)
        then:
        !unique
        where:
        s << notUniqueChars
    }

    def "is unique ascii - unique chars - true"() {
        when:
        def unique = subject.isUniqueAscii(s)
        then:
        unique
        where:
        s << uniqueChars
    }

    def "is unique ascii - not unique chars - false"() {
        when:
        def unique = subject.isUniqueAscii(s)
        then:
        !unique
        where:
        s << notUniqueChars
    }

}
