package pl.mkowalewski

class BowlingGameFactory {

    private static BowlingGame oneKnockedPinPerFrame() {
        Frame[] frames = new Frame[10]
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame(1)
        }
        return new BowlingGame(frames)
    }

    private static BowlingGame nineKnockedPinPerFrame() {
        Frame[] frames = new Frame[10]
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame(9)
        }
        return new BowlingGame(frames)
    }

    private static BowlingGame twelveStrikes() {
        Frame[] frames = new Frame[12]
        for (int i = 0; i < 12; i++) {
            frames[i] = Frame.strike()
        }
        return new BowlingGame(frames)
    }

    private static BowlingGame pairsOfFiveAndSpareWithFinalFive() {
        Frame[] frames = new Frame[11]
        for (int i = 0; i < 10; i++) {
            frames[i] = Frame.spare(5)
        }
        frames[10] = new Frame(5)
        return new BowlingGame(frames)
    }
}
