/* 단축 평가 구문 */
/* 논리 연산의 결과를 결정지을 항만 남는다. */
/* 1. OR의 경우 */
console.log('apple' || 'banana');   // apple
console.log('' || 'banana');        // banana
console.log('apple' || false);      // apple
console.log(true || false);      // true
console.log('=====================');
/* 2. AND의 경우 */
console.log('apple' && 'banana');   // banana
console.log('' && 'banana');        // ''
console.log('apple' && false);      // false
console.log(true && false);      // false
console.log('=====================');

/* 3. 단축 평가 구문 */
var num = 2;
num % 2 == 0 && console.log('짝수입니다.')  // 짝수입니다.
num % 2 == 0 || console.log('홀수입니다.')  // 결과가 나오지 않음(좌측(num % 2 == 0)이 이미 true 여서 우측 항이 연산 되지 않음)