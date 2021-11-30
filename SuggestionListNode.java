class SuggestionListNode {
  private Suggestion payload;
  private SuggestionListNode head;

  public SuggestionListNode(Suggestion payload, SuggestionListNode head) {
    this.payload = payload;
    this.head = head;

  }

  public Suggestion getSuggestion() {
    return this.payload;
  }

  public SuggestionListNode getNext() {
    return this.head;
  }


}
