package pl.mkowalewski;

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    Frame[] frames = new Frame[12];
    for (int i = 0; i < 12; i++) {
      int firstRoll = myObj.nextInt();
      int secondRoll = myObj.nextInt();
      frames[i] = new Frame(firstRoll, secondRoll);
    }
    BowlingGame game = new BowlingGame(frames);
    int score = game.calculateScore();
    System.out.println(score);
  }

}
