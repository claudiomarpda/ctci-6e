package org.coding.ctci6e


import spock.lang.Specification

class IQ12_PermutationTest extends Specification {

    def subject = new IQ12_Permutation()

    def "permutes - strings are permutation - true"(String s1, String s2) {
        when:
        def permutes = subject.permutes(s1, s2)
        then:
        permutes
        where:
        s1    | s2
        "abc" | "abc" // equal strings
        "bac" | "abc" // equal number of chars
    }

    def "permutes - strings are not permutation - false"(String s1, String s2) {
        when:
        def permutes = subject.permutes(s1, s2)
        then:
        !permutes
        where:
        s1    | s2
        "abc" | "ab" // s1 > s2
        "ab"  | "abc" // s1 < s2
        "abc" | "edf" // same length but different chars
    }

}
