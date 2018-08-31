public class BinaryIterativeSearch implements Practice2Search {
	public String searchName() {
		return "Binary iterative search"; 
	}

	public int search(int [] arr, int target) {
		int lower = 0; 
		int upper = arr.length; 
		int mid; 
		while (upper > lower) {
			mid = (upper + lower) / 2; 
			if (arr[mid] == target) {
				return mid; 
			}
			else if(arr[mid] > target) {
				upper = mid - 1; 
			}
			else {
				lower = mid + 1; 
			}
		}
		return -1; 
	}
}