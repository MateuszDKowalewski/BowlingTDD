package pl.mkowalewski;

class BowlingGame {

  Frame[] framesInGame;

  public BowlingGame(Frame[] framesInGame) {
    this.framesInGame = framesInGame;
  }

  public int calculateScore() {
    int score = 0;
    for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
      score += calculateFrameScore(frameIndex);
    }
    return score;
  }

  private int calculateFrameScore(int frameIndex) {
    if (framesInGame[frameIndex].isStrike()) {
      return getStrikeFrameScore(frameIndex);
    } else if (framesInGame[frameIndex].isSpare()) {
      return getSpareFrameScore(frameIndex);
    } else {
      return getFrameScore(frameIndex);
    }
  }

  private int getFrameScore(int frameIndex) {
    return framesInGame[frameIndex].getKnockedPinsCount();
  }

  private int getStrikeFrameScore(int frameIndex) {
    int strikeFrameScore = 0;
    strikeFrameScore += getFrameScore(frameIndex);
    strikeFrameScore += getFrameScore(frameIndex + 1);
    if (framesInGame[frameIndex + 1].isStrike()) {
      strikeFrameScore += framesInGame[frameIndex + 2].getKnockedInFirstRoll();
    }
    return strikeFrameScore;
  }

  private int getSpareFrameScore(int frameIndex) {
    return getFrameScore(frameIndex) + framesInGame[frameIndex + 1].getKnockedInFirstRoll();
  }
}
