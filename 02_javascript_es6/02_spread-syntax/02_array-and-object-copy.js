/* 스프레드 문법을 활용한 배열 및 객체 복사 */

/* 1. 배열 복사(깊은 복사) */
let arr = [10, 40, 80];
let arrCopy = [...arr];

console.log(arr)
console.log(arrCopy)
console.log(arr === arrCopy)    //false

/* 2. 객체 복사 */
let obj = {
    name: '홍길동',
    age: 20,
    addr: '서울',
    hobiies: ['축구', '농구']   // 객체 이기 때문에 같은 배열을 참조하게 되서 얉은 복사가 일어 남
};

console.log({...obj});
let objCopy = {...obj};         //객체의 프로퍼티 전개
console.log(obj);
console.log(objCopy);
console.log(obj === objCopy);   //false, obj와 objCopy는 각각 다른 객체 이지만 내부의 배열은 동일한 배열을 가르킴

/* 객체만 복사하고 내부 배열을 따로 복사하지 않았을 경우 */
console.log(obj.hobiies);
console.log(objCopy.hobiies);
objCopy.hobiies.unshift('야구');
console.log(obj.hobiies);


console.log(obj.hobiies === objCopy.hobiies);   //true
/* 내부 배열도 복사 했을 경우 
    복사하는 객체 내부에 이와 같이 추가적인 객체(또는 배열)이 잇다면 추가적으로 복사해 주어야
    정확한 의미의 사본(깊은 복사)이 만들어 진다.
*/
objCopy.hobiies = [...obj.hobiies];
console.log(obj.hobiies === objCopy.hobiies);   //false

/* 기존에 존재하는 객체 및 변수를 활용해서 새로운 객체를 만들 수 있다. 
    기존 객체에 존재 하지 않는 프로퍼티는 추가 되고 기존에 있던 프로퍼티는 수정이 일어 남
*/
let classNum = 30;      //추가
let name = '강감찬';    //수정이 일어 남

let newObj = {classNum , ...obj, name};     //수정해야 할 프로퍼티로 쓰일 변수는 해당 객체 뒤에 작성할 것(순서에 유의)
console.log(newObj);
