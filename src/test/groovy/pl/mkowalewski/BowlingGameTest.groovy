package pl.mkowalewski

import spock.lang.Specification

class BowlingGameTest extends Specification {

    def "calculate score for 1- 1- 1- 1- 1- 1- 1- 1- 1- 1- game"() {
        given:
        BowlingGame bowlingGame = BowlingGameFactory.oneKnockedPinPerFrame()

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 10
    }

    def "calculate score for X X X X X X X X X X X X game"() {
        given:
        BowlingGame bowlingGame = BowlingGameFactory.twelveStrikes()

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 300
    }

    def "calculate score for 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 game"() {
        given:
        BowlingGame bowlingGame = BowlingGameFactory.pairsOfFiveAndSpareWithFinalFive()

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 150
    }

}
