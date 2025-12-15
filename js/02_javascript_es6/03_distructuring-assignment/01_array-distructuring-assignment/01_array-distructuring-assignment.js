/* 배열 구조 분해 할당 */
let nameArr = ["Gildong", 'Hong', '!'];

/* 1. 일반적인 방식 */
// let firstName = nameArr[0];
// let lastName = nameArr[1];

/* 2.구조 분해 할당 */
/* 1번과 2번은 동일하며 , 배열에 있는 각 요소의 위치에 맞는 값을뽑아 해당 위치의 변수에 담는다. */
let [firstName, lastName] = nameArr;

console.log('firstName:',firstName); // firstName: Gildong
console.log('lastName:',lastName);   // lastName: Hong

let name = 'Saimdang Shin';
let [firstName2, lastName2] = name.split(' ');

/* String의 메소드를 통해 배열이 나오면 배열 구조 분해 할당 가능
    (feat.String 자체도 유사배열이라 한자씩 뜯을 수 도 있긴 함) 
*/
console.log('firstName2:',firstName2); // firstName2: Saimdang
console.log('lastName2:',lastName2);   // lastName2: Shin

/* 정규표현식을 활용한 배열도 동일하게 활용 가능 */
let [firstName3, lastName3] = name.match(/[a-z]+/gi);
console.log('firstName3:',firstName3); // firstName3: Saimdang
console.log('lastName3:',lastName3);   // lastName3: Shin