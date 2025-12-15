/*
    ES11(2020)에 도입된 연산자로 연산자의 좌항이 null 또는 undefined인 경우
    error 대신 undefined를 반환하고 그렇지 않으면 우항의 프로퍼티 참조를 이어간다.
    (.(dot notation)은 객체의 프로퍼티에 접근하는 접근연산자)
*/

var obj = null;
// obj = {
//     'value' : 'abc'
// };

var val = obj?.value;   //NPE 방지 코드
console.log(val);   //undefined

// 좌항이 null 이나 undefined가 아닌라면 "?". 쓸 필요 없이 "." 으로만 사용해도 된다.
var str ='';
console.log(Object.getOwnPropertyDescriptors(str));
var len = str.length;   //문자열의 길이
console.log(len);