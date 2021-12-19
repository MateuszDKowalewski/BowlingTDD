package pl.mkowalewski

class BowlingGameFactory {

    private static BowlingGame oneKnockedPinPerFrame() {
        Frame[] frames = new Frame[10]
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame(1, 0)
        }
        return new BowlingGame(frames)
    }

    private static BowlingGame twelveStrikes() {
        Frame[] frames = new Frame[12]
        for (int i = 0; i < 12; i++) {
            frames[i] = new Frame(10, 0);
        }
        return new BowlingGame(frames)
    }
}
