/* 다양한 사용법 */
let shirts = {
    productName : '베이직 셔츠'
};

/* pr을 제외한 다른 변수는 기본 값이 할당 됨 */
let {productName :pr = '어떤 상품', color= '어떤 색상', price = 0} = shirts;
console.log('pr:', pr);         // pr: 베이직 셔츠
console.log('color:', color);   // color: 어떤 색상
console.log('price:', price);   // price: 0

/* rest */
let pants = {
    productName : '밀리터리팬츠',
    color : '국방색',
    price: 25000
};

// 할당 되지 않은 나머지 프로퍼티는 객체로 반환 됨
let {productName, ...rest} = pants;
console.log(productName);
console.log(rest);                  // 나머지가 객체로 생성 됨 { color: '국방색', price: 25000 }
console.log('color:' ,rest.color);  // color: 국방색
console.log('price:' ,rest.price);  // price: 25000