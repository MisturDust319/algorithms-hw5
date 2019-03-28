// brute force iterative
public int[] minMax(int[] nums, int begin, int end) {
	// find the min value
	int min = nums[begin];
	for(int i = 1; i <= end; i++) {
		if(nums[i] < min) {
			min = nums[i];
		}
	}

	// find max val
	int max = nums[begin];
	for(int i = 1; i <= end; i++) {
		if(nums[i] > max) {
			max = nums[i];
		}
	}

	// compile results
	int[] results = new int[2];
	results[0] = min;
	results[1] = max;

	return results;
}
