import java.util.Scanner;

class JingleWriterCli {
  private Game game;

  public static void playGame(Game game) {
    boolean loop = false;

    do {

      System.out.println("History:");
      if (game.getHistory() == null) {
        System.out.println("No History");
      }

      for (SuggestionListNode cursor = game.getHistory(); cursor != null; cursor =
          cursor.getNext()) {

        System.out.println(cursor.getSuggestion());

      }
      char[] guess = new char[5];
      Scanner kbd = new Scanner(System.in);
      System.out.println("Enter melody:");


      for (int i = 0; i < 5; i++) {
        guess[i] = kbd.next().charAt(0);
      }

      Melody game1 = new Melody(guess);
      if (game.suggestMelody(game1) == true) {
        loop = true;
      }

    } while (loop == false);
    System.out.println("Congratulations!");

  }

  public static void main(String[] args) {
    Game start = new Game();
    Game start1 = new Game(start.getSolution());
    playGame(start1);
  }
}
