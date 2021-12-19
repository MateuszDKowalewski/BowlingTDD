package pl.mkowalewski;

class Frame {

  int knockedInFirstRoll;
  int knockedInSecondRoll;

  public Frame(int knockedInFirstRoll, int knockedInSecondRoll) {
    this.knockedInFirstRoll = knockedInFirstRoll;
    this.knockedInSecondRoll = knockedInSecondRoll;
  }

  public Frame(int knockedInFirstRoll) {
    this.knockedInFirstRoll = knockedInFirstRoll;
  }

  public static Frame strike() {
    return new Frame(10);
  }

  public static Frame spare(int knockedInFirstRoll) {
    return new Frame(knockedInFirstRoll, 10 - knockedInFirstRoll);
  }

  public int getKnockedPinsCount() {
    return knockedInFirstRoll + knockedInSecondRoll;
  }

  public boolean isStrike() {
    return knockedInFirstRoll == 10;
  }

  public boolean isSpare() {
    return knockedInFirstRoll + knockedInSecondRoll == 10;
  }

  public int getKnockedInFirstRoll() {
    return knockedInFirstRoll;
  }
}
