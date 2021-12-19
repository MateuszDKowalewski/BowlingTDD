package pl.mkowalewski;

class BowlingGame {

  Frame[] framesInGame;

  public BowlingGame(Frame[] framesInGame) {
    this.framesInGame = framesInGame;
  }

  public int calculateScore() {
    int score = 0;
    for (int i = 0; i < 10; i++) {
      score += calculateFrameScore(i);
    }
    return score;
  }

  private int calculateFrameScore(int i) {
    if (framesInGame[i].isStrike()) {
      return getStrikeFrameScore(i);
    } else if (framesInGame[i].isSpare()) {
      return getSpareFrameScore(i);
    } else {
      return getFrameScore(i);
    }
  }

  private int getFrameScore(int frameIndex) {
    return framesInGame[frameIndex].getKnockedPinsCount();
  }

  private int getStrikeFrameScore(int i) {
    int strikeFrameScore = 0;
    strikeFrameScore += getFrameScore(i);
    strikeFrameScore += getFrameScore(i + 1);
    if (framesInGame[i + 1].isStrike()) {
      strikeFrameScore += framesInGame[i + 2].getKnockedInFirstRoll();
    }
    return strikeFrameScore;
  }

  private int getSpareFrameScore(int i) {
    return getFrameScore(i) + framesInGame[i + 1].getKnockedInFirstRoll();
  }
}
