function removeDuplicate(nums) {
    let i = 0, j = 1;

    while (j < nums.length) {
        if (nums[i] !== nums[j]) {

            nums[i + 1] = nums[j];
            i += 1;

        }
        j++;
    }
    return i + 1;
}

console.log(removeDuplicate([1, 1, 2, 3, 3, 4, 5, 5,]));
//[1,2,3,2,2,3,3,3,3,4]
