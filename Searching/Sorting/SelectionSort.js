function swapItem(arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

}

var selectionSort = function (nums) {
    if (nums.length === 0) return -1;
    if (nums.length === 1) return nums;

    for(let i = 0; i < nums.length - 1; i++){
        let min = i;
        for(let j = i + 1; j < nums.length; j++){
            if(nums[j] < nums[min]){
                min = j;
            }
        }
        if(min !== i){
            swapItem(nums, i, min);
        }
    }
    return nums;
};

console.log(selectionSort([4, 9, 2, -4, 1]));

