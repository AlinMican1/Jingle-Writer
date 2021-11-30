import java.util.Random;

class Game {
  private Melody solution;
  private SuggestionListNode head;

  public Game() {

    char[] RandomNotes = new char[5];
    Random rand = new Random();
    for (int i = 0; i < 5; i++) {
      int rand_int1 = rand.nextInt(7);
      char note = (char) ('A' + rand_int1);
      RandomNotes[j] = note; 
    }
    solution = new Melody(RandomNotes);
  }

  public Game(Melody solution) {
    this.solution = solution;
    this.head = null;
  }

  public boolean suggestMelody(Melody suggestion) {
    Suggestion newMelody = new Suggestion(suggestion, solution);
    SuggestionListNode newList = new SuggestionListNode(newMelody, head);
    this.head = newList;
    return newMelody.isCorrect();
  }

  public SuggestionListNode getHistory() {
    return head;
  }

  public Melody getSolution() {
    return solution;
  }


}
