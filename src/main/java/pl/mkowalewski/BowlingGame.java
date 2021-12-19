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
        score += framesInGame[i].getKnockedPinsCount();
        if (framesInGame[i + 1].isStrike()) {
          score += framesInGame[i + 2].getKnockedInFirstRoll();
        }
        score += framesInGame[i + 1].getKnockedPinsCount();
      } else {
        score += framesInGame[i].getKnockedPinsCount();
      }
    }
    return score;
  }
}
