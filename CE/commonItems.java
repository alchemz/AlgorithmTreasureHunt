import java.util.ArrayList;

public class commonElements{
	public static void main(String[] args){
		int[] arr1 = {1, 3, 4, 6, 7, 9};
		int[] arr2 = {1, 2, 4, 5, 9, 10};
	}

	public staic Integer[] commonElements(int[] arr1, int arr2){
		int p1 =0;
		int p2=0;

		ArrayList<Integer> result = new ArrayList();
		while(p1 < arr1.length && p2 < arr2.length){
			if(arr1[p1] == arr2[p2]){
				result.add(arr1[p1]);
				p1 +=1;
				p2 +=1;
			}else if(arr1[p1] > arr2[p2]){
				p2 +=1；
			}else{
				p1 +=1;
			}
		}

		//Convert ArrayList to Array to print out
		Integer[] resultInArray = new Integer[result.size()];
		return result.toArray（resultArray);
	}
}