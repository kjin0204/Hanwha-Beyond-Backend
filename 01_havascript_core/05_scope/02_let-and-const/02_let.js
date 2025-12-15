/* 1. 동일 스코프내 변수의 중복 선언 방지 */
let msg = '안녕';
// let msg = '잘가'; 중복 으로 인한 선언 불가

/* 2. 블록 레벨 스코프 인정 */
let i = 0;
for (let i = 0; i < 10; i++) {

}
console.log('i:', i);    // 0

/* 3. 변수 호이스팅 방지 */
/* 에러 메시지 : Cannot access 'x' before initialization 
    호이스팅이 일어나지만 내부적 으로 let 키워드를 사용 한 경우 호이스팅을 막는 로직이 내부적으로 동작
*/
console.log(x);
let x = 1;