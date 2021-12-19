package pl.mkowalewski;

class BowlingGame {

  Frame[] framesInGame;

  public BowlingGame(Frame[] framesInGame) {
    this.framesInGame = framesInGame;
  }

  public int calculateScore() {
    int score = 0;
    for (int i = 0; i < 10; i++) {
      if (framesInGame[i].isStrike()) {
        score += getStrikeFrameScore(i);
      } else {
        score += getFrameScore(framesInGame[i]);
      }
    }
    return score;
  }

  private int getFrameScore(Frame frame) {
    return frame.getKnockedPinsCount();
  }

  private int getStrikeFrameScore(int i) {
    int strikeFrameScore = 0;
    strikeFrameScore += getFrameScore(framesInGame[i]);
    strikeFrameScore += getFrameScore(framesInGame[i + 1]);
    if (framesInGame[i + 1].isStrike()) {
      strikeFrameScore += framesInGame[i + 2].getKnockedInFirstRoll();
    }
    return strikeFrameScore;
  }
}
