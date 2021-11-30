import java.util.*;


class Melody {

  private char[] Note = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};


  public Melody(char[] Note) {
    this.Note = Note;
  }

  public char getNote(int i) {
    return Note[i];


  }

  public String toString() {
    String word = Arrays.toString(Note);
    word = word.toString().replace("[", "").replace("]", "").replace(",", "");
    return word;
  }

  public int getNumSamePosition(Melody other) {
    int sumPosition = 0;
    for (int i = 0; i < other.Note.length; i++) {
      if (other.Note[i] == this.Note[i]) {
        sumPosition += 1;
      }
    }
    return sumPosition;
  }


  public int getNumSameNoPosition(Melody other) {

    int sumPosition2 = 0;

    for (char count = 'A'; count <= 'G'; count++) {

      int sum = 0;
      int sum1 = 0;

      for (int i = 0; i < this.Note.length; i++) {
        if (this.Note[i] == count) {
          sum += 1;
        }
        if (other.Note[i] == count) {
          sum1 += 1;
        }
      }

      if (sum < sum1) {
        sumPosition2 += sum;
      }
      if (sum1 < sum) {
        sumPosition2 += sum1;
      } else if (sum > 0 && sum1 > 0) {
        if (sum == sum1) {
          sumPosition2 += 1;
        }
      }

    }
    return sumPosition2;
  }



}
