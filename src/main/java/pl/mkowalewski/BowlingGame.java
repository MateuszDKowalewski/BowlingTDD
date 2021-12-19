package pl.mkowalewski;

class BowlingGame {

  Frame[] framesInGame;

  public BowlingGame(Frame[] framesInGame) {
    this.framesInGame = framesInGame;
  }

  public int calculateScore() {
    int score = 0;
    for (Frame frame : framesInGame) {
      score += frame.getKnockedPinsCount();
    }
    return score;
  }
}
