/* 재귀 함수 사용시 탈출 조건을 반드시 명시 할 것 */
function factorial(n) {
    if( n <= 1) return 1;
    return n * factorial (n - 1);
}

console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(5));