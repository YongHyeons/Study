// 20240611
// * Ctrl + Shift + k

// class
// let a:[string, number] = ["이름", 5];
// 기본적인 자료형에 추가적인 변형을 가해서 만든 자료형
// |
// let a:number | undefined = 3;
// enum
// 특정 값을 이름으로 치환해서 호출하기위한 자료형
// enum Color { red, blue, green };
// let background:Color = Color.red;

// void, never
// void => 자료형 없음 => undefined의 다른 이름
// undefined는 "정의되지않음"임으로 가능, null은 불가능
// let a:void = undefined;
// function A():void { // undefined만 돌려줄 수 있는 함수
//     return undefined;
// }
// function A():void{ return undefined; }
// let b:any = A();    // undefined값을 b에 넣다

// 절대로 자료형이 없어
// never => 함수 반환형에만 이용할 수 있고 반환을 절대 못하도록 하는 자료형
// function A():never{ return; }
// let b:any = A();

// |
// literal type, union type
// let a:string | number = 5; // 두개의 자료형중 한개를 골라 => union type;
// let b: 3 | 4 = 3; // 두개의 값 중 한개를 골라 => literal type
// let a:{key:string, func:()=>void} | { key:string } | {function:()=>void} | {}; // 키와 함수가 있을때, 키만 있을때,  ...
// let b:any; // any는 아무거나 받아올 수 있다 => JS형식

// unknown
// let c:unknown = 3;  // 알수없음

// 원래 있던 자료형을 조금씩 변형시킨 자료형

// 자료형을 적는게 좀 일이다

// 숫자를 저장하기위한 Integer라는 변수를 만들고 싶다
// let Integer:number | undefined | null | string = 0;
// 내가 특정 자료형의 묶음등을 특정 이름의 자료형으로 만들 수 있다면 더 좋겠다
// type aliases
// type Numberic = number | undefined | null | string;
// let Integer1:Numberic = 0;
// let Integer2:Numberic = undefined;
// let Integer3:Numberic = null;
// let Integer4:Numberic = "123";

// type ID = {id:string, pw:string} | {id:string, password:string}; // id, pw, password
// type PureNumber = number | null;
// type ExtendType = string | undefined;
// type ExtendNumber = PureNumber | ExtendType;
// let a:ExtendNumber = "3";

// type Product = {name:string, price:number, count:number};
// type Delivery = {location:string, name:string}; // name이 겹치더라도 가능
// // type DeliveryProduct = Product | Delivery;  // 불가능 (object형이라서?)
// type DeliveryProduct = Product & Delivery;
// // intersection types
// // 프로토타입형 자료형을 서로 섞어주는 자료형
// let a:DeliveryProduct = {count:10, name:"상품명", price:5000, location:"주소"}
// console.log(a);

// count:number를 필요할때 빼고싶다
// 단순하게 자료형을 섞는것이 아니라 내가 원하는대로 자료형을 변형시키는 자료형
// mapped types
// 2종류의 방식
// type Product = {
//     [key: string]:string | number   // 키값은 문자열, 데이터는 문자열 또는 숫자
// };
// let a: Product = {
//     "키값":"데이터",
//     "정할수":5
// };
// 제한을 조금 풀어주는 방식
// 2번째 방식이 mapped types에 조금더 어울리는 방식

// type Product<T> = {
//     [k in keyof T]: T[k] // 원래 자료형
// };
// type Product<T> = {
//     // [k in keyof T]: string  // 자료형 변경
//     [k in keyof T]: string | T[k] // 원래 자료형에 자료형 추가
// };
// type test = { readonly name:number, location:number};
// type target = Product<test>;

// let a:target = {name:"이름", location:"문자열"};
// a.name = "변경"; // readonly로 인해 값 변경 불가

// type Product = {name:string, price:number};
// type Read<T> = {
//     readonly [k in keyof T]: T[k]
// };
// type ProductRead = Read<Product>;
// let a:ProductRead = {name:"상품명", price:5000}; // 값을 변경하지 못하는 Product
// a.price = 5000;

// 원본 클래스에 추가적인 정보를 추가하기위한 방법 => 인터페이스
// interface A {
//     C():void;   // 클래스와 이름 겹침 x, 반환타입 지정
// }
// interface D extends A{ // 인터페이스끼리 extends 가능
//     C():number;
// }
// class B implements A{
//     C():void{};
// }
// class H implements D{
//     C():number{return 0;}
// }
// type G = B | H;

// 자바 인터페이스의 가장 큰 장점
// 람다 메서드 => 익명 메서드 => 익명 클래스 => 메서드형 인터페이스
// interface Consumer{
//     act():void;
// }
// function Func(consumer:Consumer){
//     consumer.act();
// }
// 익명 클래스가 지원이 안된다 -> 프로토타입과 구분이 안되기 때문
// new Consumer(){
//     function act(){}
// };
// ()->{};

// interface Consumer{
//     act():void;
// }
// function Func(consumer:Consumer){
//     consumer.act();
// }
// // Func({act(){
// //     console.log("이게 된다면 좋겠다");
// // }}); // 가능은 하다
// Func({act:()=>{
//     console.log("람다 메서드")
// }});

// 자바에서의 람다 메서드는 인터페이스를 기반으로 동작
// 스크립트에서의 람다 메서드는 독립적인 함수를 기반으로 동작

// function Func(func:()=>void){
//     func();
// }
// Func(()=>{
//     console.log("람다 메서드만 따로 함수단위로 제어가 가능");
// });

// interface A{
//     A():void;
// }
// interface A{
//     B():void;
// }
// class C implements A{
//     A(){}
//     B(){}
// }

// Declaration Merging => 인터페이스 머징
// 인터페이스를 동일한 이름으로 여러개 만들면 자동으로 병합되어서 새로운 인터페이스가 된다

// Generic
// class Type<T>{
//     a:T | undefined;
// }

// Decorator
// Annotation과 유사
// @Decorator
// class A{}

// function AutoLog(prefix:string, suffix:string){
//     console.log("뭔가 업데이트하면서 많이 바뀌었다");
//     return function (target:any){
//         console.log(prefix, suffix);
//         target(3,4);
//     };
// }

// class Calculator {
//     @AutoLog(prefix = "결과 = ", suffix = " ]")
//     Plus(a:number, b:number):number{
//         return a+b;
//     }
// }
// new Calculator().Plus(3,4);

// Decorator => 실험적 기능

// 변형 자료형까지 모두 배움
// 원하는 자료형을 만들수도, 섞을수도, 변형시킬수도 있는 구조

// 자료형만으로는 큰 의미가 없다
// 만든 자료형을 이용할 수 있도록 연산자
// +,-,*,/
// 동일하게 이용하는데 약간 차이점이 있는 자료형들이 있다

// 제곱
// console.log(2**10);
// 관계 연산자의 변환과 논리 연산자의 변환
// let a:number = 3;
// let b:string = "3";
// console.log(a == b);

// == => 의미론적으로 값을 비교하기 때문에 자료형이 달라도 의미가 같다면 true
// === => 형변환 없이 해당 값을 그대로 비교하기 때문에 자료형이 틀리면 값이 같아도 false
// !=, !== => 의미론적 값을 비교하냐, 그대로의 값을 비교하냐

// 논리 연산자 => &&, ||, !
// 결과값이 정해져있지 않다
// let a:number = 3 && 4;
// console.log(a);
// if(1 < 2 && 2 > 3){ // && => 양쪽 모두 true일떄 true
//     console.log("둘다 맞아");
// }

// let a:number = 3;
// let b:number = 3;
// let big:number | boolean;
// big = a < b && b;
// let unknown:number | undefined;
// let target:number = 1 && unknown;

// || 도 비슷하게 바뀌었다
// if(1 < 2 || 2 < 3){} // 양쪽이 false 일때 false
// 왼쪽이 true면 왼쪽값, 왼쪽이 false면 오른쪽값
// let a:number = 3 || 4;
// let b:number | boolean = 3 < 4 ||5;

// 프로젝트 
// 논리 연산자에 아주아주 특별한 연산자
// 3 ?? 4;
// Nullish Coalescing
// undefind, null 하나의 자료형
// 변수에 정의되지 않음 또는 비어있음이 있는지 검사
// value != undefind || result => value ?? result
// 왼쪽에 undefined 또는 null이 오면 오른쪽을 선택하고 아니면 왼쪽값을 이용해
// let a:number | undefined = undefined; // 3을 넣으면 3이 나온다
// a = a ?? 5;
// console.log(a);

// 매우 특수한 기능을 위한 연산자 -> 배열을 위한 연산자
// 배열이라고 쓰지만 => 클래스
// let a:number[] = [1,2,3,4];
// 배열에 값을 추가
// a.push(2);
// console.log(a);

// // 삭제 연산자
// delete a[0];
// console.log(a);
// // 확인 연산자
// // 키값을 확인 
// console.log(1 in a);

// let a:any = {key:"value"};
// console.log("key" in a);

// Spread
// ...a; // 흩뿌려 진다
// 흩뿌려 지면 각각의 값이 a,b,c,.. 흩뿌려진것 처럼 이용이 가능
// a = [...a, 5]; // a랑 동일한 배열
// console.log(a);

// 배열의 값을 한개씩 제어하지 않고 일괄적으로 흩뿌리고 사용하는 제어법 => 스프레드 배열

// ---------------------------------------------------------------------------------------

// 자료형 혼합을 이용해서 책을 만들고 2권의 책을 출력하는 프로그램

// type Book = { name:string, author:string };
// type Product = { price:number };
// type BookProduct = Book & Product;
// type Shower = { Show:(value:BookProduct)=>void };
// type BookProductShower = BookProduct & Shower;

// function ShowBookProduct(value:BookProduct):void{
//     console.log(`제목 : ${value.name}`);
//     console.log(`작가 : ${value.author}`);
//     console.log(`가격 : ${value.price}`);
// }

// let books:BookProductShower[] = [];
// books = [...books, {
//     name:"어린왕자",
//     author:"생텍쥐베리",
//     price:7500,
//     Show:ShowBookProduct
// }];
// books = [...books, {
//     name:"종이여자",
//     author:"기욤뮈소",
//     price:6500,
//     Show:ShowBookProduct
// }];

// books[0].Show(books[0]);
// books[1].Show(books[1]);

// // function ArrayPlus(array:any[], array2:any[]):any[]{
// //     return [...array, ...array2];
// // }

// // @Decorator
// function ShowChanger(target:BookProductShower, prefix:()=>void, suffix:()=>void):BookProductShower{
//     let Func:(value:BookProduct)=>void = target.Show;
//     target.Show = (value:BookProduct)=>{
//         prefix ? prefix() : undefined;
//         Func(value);
//         suffix ? suffix() : undefined;
//     }
//     return target;
// }

// books[0] = ShowChanger(books[0], ()=>{
//     console.log("=============== 시작 ===============");
// }, ()=>{
//     console.log("=============== 끝 ===============");
// });

// books[0].Show(books[0]);

// 유저를 만들고 출력
// 유저는 일반 유저, 관리자, VIP로 구분
// 계정명, 비밀번호를 공통적으로 가지며 관리자는 2차 비밀번호, VIP는 혜택을 추가적으로 가진다
// 각 유저를 1명씩 만들고 출력

// type Product<T> = {
//     [k in keyof T]: string | T[k]
// };

// type user = {id:string, pw:string};
// type manager = {secondid:string | undefined};
// type vip = {benefit:string | undefined}
// type person = user & manager & vip;
// type Shower = { Show:(value:person)=>void };
// type UsersShower = person & Shower;
// function ShowUsers(value:person):void{
//         console.log(`ID : ${value.id}`);
//         console.log(`PW : ${value.pw}`);
//         console.log(`2차 PW : ${value.secondid}`);
//         console.log(`혜택 : ${value.benefit}`);
// }

// let users:UsersShower[] = [];
// users = [...users, {
//     id:"유저",
//     pw:"비밀번호",
//     secondid:undefined,
//     benefit:undefined,
//     Show:ShowUsers
// }];
// users = [...users, {
//     id:"관리자",
//     pw:"비밀번호",
//     secondid:"2차 비밀번호",
//     benefit:undefined,
//     Show:ShowUsers
// }];
// users = [...users, {
//     id:"vip",
//     pw:"비밀번호",
//     secondid:undefined,
//     benefit:"혜택",
//     Show:ShowUsers
// }];
// users[0].Show(users[0]);
// users[1].Show(users[1]);
// users[2].Show(users[2]);