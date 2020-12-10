import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    otherseq.reset();
    for (int i = 0; i < otherseq.length(); i++){
      data[i] = otherseq.next();
    }
    otherseq.reset();
    currentIndex = 0;
  }
  public void reset(){
    currentIndex = data[0];
  }
  public int length(){
    return data.length;
  }
  public boolean hasNext(){
    return (currentIndex < data.length);
  }
  public int next(){
    int tempCurrent = currentIndex;
    if (hasNext()){
      currentIndex++;
    }else{
      throw new NoSuchElementException("Sequence has no more elements");
    }
    return data[tempCurrent];
  }
}
