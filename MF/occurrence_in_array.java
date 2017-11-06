import java.util.HashMap;

public class occurrence_in_array{
  public static void main(String[] args){
  
  //testing
  int[] array1 ={1, 3, 1, 3, 2, 1};
  int[] array2 ={3, 3, 1, 3, 2, 1};
  }
  
  public static Integer mostFrequent(int[] givenArray){
    Integer maxCount = -1;
    Integer maxItem = null;
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    
    for(int i: givenArray){
      if(count.containsKey(i)){
        Integer newVal = count.get(i) + i；
        count.put(i, newVal);
      }else{
        count.put(i,1);
      }
      if(count.get(i) >maxCount){
        maxCount = count.get(i);
        maxItem = i;
      }
    }
    return maxItem;
  }
}
