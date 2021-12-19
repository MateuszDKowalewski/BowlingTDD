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
}
