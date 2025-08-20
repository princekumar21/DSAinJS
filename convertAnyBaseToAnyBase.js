function anyBaseToDecimal(num, base) {
    let counter = 0;
    let result = 0;

    while (Math.floor(num) > 0) {
        let rem = num % 10;
        num = Math.floor(num / 10);
        result += rem * Math.pow(base, counter);
        counter += 1;
    }

    return result;

}

function decimalToAnyBase(decimal, b2) {
    let counter = 0;
    let result = 0;

    while (Math.floor(decimal) > 0) {
        let rem = decimal % b2;
        decimal = Math.floor(decimal / b2);
        result += rem * Math.pow(10, counter);
        counter += 1;
    }
    return result;
}

function anyBaseToAny(n1, b1, b2) {

    let decimalvalue = anyBaseToDecimal(n1, b1);
    return decimalToAnyBase(decimalvalue, b2)
}

console.log(anyBaseToAny(110011100, 2, 8))
