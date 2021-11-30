class Suggestion {
  private Melody suggestion;
  private Melody solution;


  public Suggestion(Melody suggestion, Melody solution) {
    this.suggestion = suggestion;
    this.solution = solution;

  }

  public Melody getMelody() {
    return suggestion;
  }

  public int getNumCorrect() {
    return suggestion.getNumSamePosition(solution);
  }

  public int getNumOutOfOrder() {
    if ((suggestion.getNumSameNoPosition(solution) - suggestion.getNumSamePosition(solution)) > 0) {
      return suggestion.getNumSameNoPosition(solution) - suggestion.getNumSamePosition(solution);
    } else {
      return 0;
    }
  }

  public String toString() {
    return suggestion + " Correct " + getNumCorrect() + " Out of Order " + getNumOutOfOrder();
  }

  public boolean isCorrect() {
    if (suggestion.getNumSamePosition(solution) == 5) {
      return true;
    } else {
      return false;
    }
  }

}
