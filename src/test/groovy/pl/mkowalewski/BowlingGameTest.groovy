package pl.mkowalewski

import spock.lang.Specification

class BowlingGameTest extends Specification {

    def "calculate score for 1- 1- 1- 1- 1- 1- 1- 1- 1- 1-"() {
        given:
        BowlingGame bowlingGame = new BowlingGame(tenFramesWithOneRolledPinEach())

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 10
    }

    def "calculate score for X X X X X X X X X X X X"() {
        given:
        BowlingGame bowlingGame = new BowlingGame(twelveStrikeRolls())

        when:
        def score = bowlingGame.calculateScore()

        then:
        score == 300
    }

    private Frame[] tenFramesWithOneRolledPinEach() {
        Frame[] frames = new Frame[10]
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame(1, 0)
        }
        return frames
    }

    Frame[] twelveStrikeRolls() {
        Frame[] frames = new Frame[12]
        for (int i = 0; i < 12; i++) {
            frames[i] = new Frame(10, 0);
        }
        return frames
    }
}
