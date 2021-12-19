package pl.mkowalewski

import spock.lang.Specification

class BowlingGameTest extends Specification {

    def "calculate score for 1- 1- 1- 1- 1- 1- 1- 1- 1- 1-"() {
        given:
        BowlingGame bowlingGame = BowlingGameFactory.oneKnockedPinPerFrame()

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 10
    }

    def "calculate score for X X X X X X X X X X X X"() {
        given:
        BowlingGame bowlingGame = BowlingGameFactory.twelveStrikes()

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 300
    }

}
