function anyBaseAddition(num1, num2, base) {

    let counter = 0;
    let result = 0;
    let carryLeftOut = 0;


    while (Math.floor(num1) > 0 || Math.floor(num2) > 0) {

        let rem1 = num1 % 10;
        let rem2 = num2 % 10;
        num1 = Math.floor(num1 / 10);
        num2 = Math.floor(num2 / 10);

        let sum = rem1 + rem2 + carryLeftOut;

        let carry = sum - base;

        if (carry > 0) {

            result += carry * Math.pow(10, counter);
            carryLeftOut = 1

        } else if (carry === 0) {
            result += carry * Math.pow(10, counter);
            carryLeftOut = 1
        } else {
            result += sum * Math.pow(10, counter);
            carryLeftOut = 0
        }

        counter += 1;
    }

    if ((num1 === 0 || num2 === 0) && carryLeftOut > 0) {
        result += carryLeftOut * Math.pow(10, counter)
    }

    return result;

}

console.log(anyBaseAddition(767, 421, 8))