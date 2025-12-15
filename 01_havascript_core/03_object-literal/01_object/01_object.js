/*
    자바스크립트는 프로토타입 기반의 객체 지향(기반) 프로그래밍 언어로 원시 값을 제외한 나머지 값
    (함수, 배열, 정규표현식 등)은 모두 객체이다.(프로토타입을 가지면 객체)
*/
var name = '홍씨';
var age = 10;

var t = function(){
    return '가나다'
}
var student = {
    /* 속성 프로퍼티 */
    name: '유관순',
    age: 16,
    /* 기능 프로퍼티(=메서드) 
        this를 사용하지 않으면 객체의 프로퍼티가 아닌 전역에 설정한 global 변수로 전근 하게 됨
        this를 사용 하지 않을 경우 객체의 프로퍼티에 접근 불가    
    */
    getInfo: function(){
        return `${this.name}(은)는 ${this.age}세 입니다.`;  // this는 메서드를 포함한 객체를 의미
    },
    getInfo1: t
};


console.log('student:',student);
console.log('이름: ', student.name);
console.log('나이: ', student.age);
console.log('정보: ', student.getInfo());   //메서드는 소괄호(())를 통해 실행도 가능
console.log('정보: ', student.getInfo1());  //가나다