/* null 병합 연산자 */
/*
    좌항의 피연산자가 null이거나 undefined라면 우항의 경과가 남고(함수면 실행),
    그렇지 않으면 좌항이 남는다(함수면 실행)
*/
var test = null ?? '기본 값'; // 우항의 값이 들어 감
console.log('test:',test); //console.log에 두 개의 인수를 주면 중간에 띄어쓰기를 포함해 이어붙여 줌

var value1 = '' || '기본 값2';
var value2 = '' ?? '기본 값2';  // 좌항이 null or undefined가 아니라 공백이 들어 감
console.log('value1:',value1);
console.log('value2:',value2);
