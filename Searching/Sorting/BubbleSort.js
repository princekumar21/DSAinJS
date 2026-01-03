function swapItem(arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

}

var bubbleSort = function (nums) {
    if (nums.length === 0) return -1;
    if (nums.length === 1) return "Already Sorted";

    for (let k = nums.length - 1; k >= 1; k--) {
        for (let i = 0; i < k; i++) {

            if (nums[i] > nums[i + 1]) {
                swapItem(nums, i, i + 1);
            }
        }
    }
    return nums;
};

console.log(bubbleSort([4, 5, 2, 3, 1]));

// use cases
// []
// [5] target = 5, target = 2
// [-1, 0, 3, 5, 9, 12];

