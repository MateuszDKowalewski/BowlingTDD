package pl.mkowalewski;

class Frame {

  int knockedInFirstRoll;
  int knockedInSecondRoll;

  public Frame(int knockedInFirstRoll, int knockedInSecondRoll) {
    this.knockedInFirstRoll = knockedInFirstRoll;
    this.knockedInSecondRoll = knockedInSecondRoll;
  }

  public int getKnockedPinsCount() {
    return knockedInFirstRoll + knockedInSecondRoll;
  }

  public boolean isStrike() {
    return knockedInFirstRoll == 10;
  }

  public int getKnockedInFirstRoll() {
    return knockedInFirstRoll;
  }

}
