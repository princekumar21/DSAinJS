var search = function (nums, target) {
    if (target < nums[0] || target > nums[nums.length - 1]) return - 1;

    let firstIndex = 0;
    let lastIndex = nums.length - 1;

    while (firstIndex <= lastIndex) {
        let mid = Math.floor((lastIndex + firstIndex) / 2);

        if (nums[mid] === target) return mid;
        else if (target < nums[mid]) lastIndex = mid - 1;
        else if (target > nums[mid]) firstIndex = mid + 1;
    }
    return -1;
};

console.log(search([-1, 0, 3, 5, 9, 12], 2));

// use cases
// []
// [5] target = 5, target = 2
// [-1, 0, 3, 5, 9, 12];

