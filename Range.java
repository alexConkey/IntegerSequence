import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int starting,  int ending){
    start = starting;
    end = ending;
    current = start;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return end + 1 - start;
  }
  public boolean hasNext(){

  }

  //@throws NoSuchElementException
  public int next(){

  }

}
