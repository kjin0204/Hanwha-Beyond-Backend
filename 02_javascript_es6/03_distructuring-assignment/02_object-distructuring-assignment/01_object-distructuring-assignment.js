/* 객체 구조 분해 할당 */
let pants = {
    productName: '배기팬츠',
    color: '검은색',
    price: 30000,
    getInfo: function(){
        console.log(this.color, this.productName, '좋아!');
    },
    
    getInfo2: () =>
        console.log(this.color, this.productName, '좋아!')
    
};

let productNamePast = pants.productName;
let colorPast = pants.color;

/*
    배열 구조 분해 할당과 달리 프로퍼티 순서는 중요하지 않지만
    반드시 기존의 프로퍼티명과 일치해야 한다.
*/
let {color,getInfo, getInfo2, productName } = pants
console.log('productName:',productName);    // productName: 배기팬츠
console.log('color:',color);                // color: 검은색

/* pants.을 안 써도 동일한 함수지만 this.을 활용할 때는 메소드와 일반함수의 차이가 발생할 수 있다. */
pants.getInfo();// 검은색 배기팬츠 좋아!

// this가 적용된 메소드일 경우 변수에 담고나면 this의 의미는 전역 객체
getInfo();      // undefined undefined 좋아!
getInfo2();     // undefined undefined 좋아!

// 객체 구조 분해 할당 시 변수명을 원하는 것으로 교체 가능(:(콜론) 활용)
let {color:co, productName:pr, price: pr2} = pants;
console.log(co,pr,pr2);                     // 검은색 배기팬츠 30000