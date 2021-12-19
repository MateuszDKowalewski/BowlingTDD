package pl.mkowalewski

import spock.lang.Specification

class BowlingGameTest extends Specification {

    def "should calculate score without strikes or spares"() {
        given:
        BowlingGame bowlingGame = new BowlingGame(tenFramesWithOneRolledPin())

        when:
        def score = bowlingGame.calculateScore()

        then:
        score = 10
    }

    private Frame[] tenFramesWithOneRolledPin() {
        Frame[] frames = new Frame[10]
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame(1, 0)
        }
        return frames
    }

}
