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

    def "calculate score for 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- game"() {
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

    def "calculate score for 2/4 X 3/ 4- 7/2 -/4 8/1 -/- 9/ 7/1 game"() {
        given:
        BowlingGame bowlingGame = BowlingGameFactory.ninetyOnePointsGame()
    }

}
