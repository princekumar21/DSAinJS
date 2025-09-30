function anyBaseSubtraction(num1, num2, base) {
    let result = 0;
    let carryExtraTaken = 0;
    let counter = 0;
    while (num1 > 0 && num2 > 0) {
        console.log(num1, num2)
        let rem1 = num1 % 10;
        let rem2 = num2 % 10;
        num1 = Math.floor(num1 / 10);
        num2 = Math.floor(num2 / 10);

        let sub = (rem1 - carryExtraTaken) - rem2;
        if (sub < 0) {
            if (num1 > 0) {
                sub = ((rem1 - carryExtraTaken) + base) - rem2;
                carryExtraTaken = 1;
            }
        } else carryExtraTaken = 0;

        result += sub * Math.pow(10, counter);
        counter++;
    }

    if (num1 > 0) {
        result += (num1 - carryExtraTaken) * Math.pow(10, counter)
    }

    return result;
}

console.log(anyBaseSubtraction(1000, 1, 8))
