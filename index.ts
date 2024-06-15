// . => ~ 안에 console 이라는 정보 안에 log 라는 메서드
// console.log => log 안에 들어온 대상을 출력해
// console.log(3, 5, "Hello");
// console.error => log와 다르게 에러 검출용 출력
// console.error(3, 5);
// console.assert(condition, value, ...) => ~ 라면
// console.assert(2 > 3, 2,3,4);
// console.group => 그룹화 기능
// console.groupCollapsed => 그룹화하는데 처음에는 접힌 상태
// console.group(2,3,4);
// console.groupEnd();

// console.trace => 현재 이 위치를 추적해줄게
// console.trace(1,2,3);

// TS의 자료형
// 자료형의 종류
// 원시타입과 주소형

// 자료형 변수명 => 변수명 자료형
// Web Script에는 자료형과 변수명 외에 필요한게 또 있기 때문
// 변수가 언제 삭제될지를 명시하기위한 스코프를 추가해야한다
// 스코프 변수명:자료형 => 형태로 제작
// var, let, const => 스코프
// let value:number = 0;
// var => 전역, 내부에 생성이 안되고 외부에 생성
// let, const => 지역, 내부에 생성이 된다
// const => 지역, 값을 변화시키지 못해
// const value2:number = 4;
// value2 = 5;
// value = 5;

// 스코프 변수명 : 자료형 => 내가 원하는 변수를 만들 수 있다
// 변수에는 호이스팅

// console.log(b); // Typescript는 오류로 잡아주기 때문

// let a:number = 0;
// var b:number = 1; // a보다 밑에 작성했음에도 먼저 만들어져야 한다
// 변수가 밑에 작성됨에도 위에서 미리 생성되는 구조 -> 호이스팅

// 자료형의 종류 -> number 부터 한개씩
// number => 숫자
// let a:number = 5;
// let b:number = 3.5;
// let c:number = Infinity;
// 무한대의 연산결과가 나오거나 혹은 잘못된 연산결과가 나올때를 대비해서 숫자 외에 타입
// console.log(Infinity); // 무한대
// console.log(-Infinity); // 음수 무한대
// console.log(NaN);   // 결과 없음
// console.log(1 / 0);
// console.log(1 + "ABC");
// console.log(1 + false);

// string
// String = 클래스, 원시타입
// let a:string = "ABC";
// let b:string = "ABCDEF";
// let c:string = 'ABCDEF';
// let d:string = `abcefg${3+2}`;
// 문자를 표시할때 사용하는 따옴표에 제한이 없다
// console.log(d);

// boolean
// let a:boolean = true;   // 맞다
// let b:boolean = false;  // 틀리다

// 변수를 만들고 아무것도 안넣으면 => 쓰레기값
// 스크립트 변수에는 쓰레기값 대신에 명시되지 않은값 또는 비어있는 값
// undefined, null => 자료형과 상관이없는 정보
// let a:number = undefined;   // 명시되지 않은 값
// let b:string = null;    // 비어있는 값

// 자료형의 위치에 undefined나 null 과 같이 값을 넣어서 자료형으로 이용할 수 도 있다
// let a:3|4 = 3;
// let b:string | undefined = undefined;

// any => 무엇이든
// let a:any;

// 원시타입 자료형 => number, string, undefined, boolean, null, |, any ...
// 주소타입 자료형 => class, object, array, function

// array => 배열 => 동일한 자료형 여러개를 묶은 자료형
// let a:number[] = [1,2,3,4];

// object => 객체형 => 프로토타입
// let a:{key:string} = { key:"문자열" };
// console.log(a.key);

// { apple:5000 } // 프로토타입 형태의 데이터(객체형 데이터)

// function
// 프로토타입에 메서드를 추가하기 위해서 만들어진 함수 자료형
// 스크립트의 메서드(함수) 클래스와 상관없이 독자적인 코드의 묶음

// 함수 만드는 방법
// function A(a:number):number { // 타입 스크립트에서의 리턴타입
//     console.log(a);
//     return 0;
// }
// A(5); // 변수에 담을 수 도 있다

// let func:(a:number)=>number = A; // 함수의 매개변수와 리턴타입만 적은것 => 함수의 자료형
// func(5);
// A(5);
// function A(data:number):number{
//     return data + 5;
// }
// let obj:{value:number, func:(data:number)=>number} = {value:5, func:A};
// console.log(obj.func(obj.value));

// ---------------------------------------------------------------------------------------------------

// class
// 자바에 있는 클래스와 대동소이
// extends, super
// class A{}
// class Name extends A{    // 주소형 변수 클래스
//     a:number;
//     #b:number; // 변수 이름 앞에 #을 붙이면 된다 => private 변수의 대용
//     static g:number;
//     // 생성자
//     // Name(){} 스크립트에서 클래스의 생성자는 특별한 이름이 존재
//     constructor() {
//         // 변수를 만들면서 초기화하는건 좋지 않은 방법
//         super();
//         this.a = 5;
//         this.#b = 6;
//         console.log('생성자');
//         // this(5);
//     }
//     // constructor(a:number){} // 내부가 프로토타입
//     // constructor Name() {}
//     A(a:number):number{
//         return a + 5;
//     }
// }
// let a:Name = new Name();
// a.a = 5;
// a.#b = 5; // 외부 접근을 막는 변수이름
// private 변수처럼 이용할 수 있다

// 클래스의 변화는 이게 전부이냐?
// class A{
//     #a:number; #b:number;
//     constructor(a:number, b:number){
//         this.#a = a; this.#b = b;
//     }
//     get a(){ return this.#a; }
//     get b(){ return this.#b; }
//     set a(a:number){ this.#a = a; }
//     set b(b:number){ this.#b = b; }
// }
// let a:A = new A(3,4);
// a.b = 5; // a.setB(5);
// console.log(a.a);// console.log(a.getA());
// console.log(a.b);// console.log(a.getB());

// 책 3권을 저장한 후 출력
// class Book {
//     #name:string;
//     #author:string;
//     #price:number;
//     constructor(name:string, author:string, price:number){
//         this.#author = author;
//         this.#name = name;
//         this.#price =price;
//     }
//     get name():string { return this.#name; } set name(name:string){ this.#name = name; }
//     get author():string { return this.#author; } set author(author:string){ this.#author = author; }
//     get prive():number { return this.#price; } set prive(price:number){ this.#price = price; }
//     Show(){
//         console.log(`제목 : ${this.#name}`);
//         console.log(`작가 : ${this.#author}`);
//         console.log(`가격 : ${this.#price}`);
//     }
// }

// let books:Book[] = [
//     new Book("어린왕자", "생텍쥐베리", 7500), 
//     new Book("종이여자", "기욤뮈소", 4500), 
//     new Book("해리포터와 마법사의 돌", "J.K.롤링", 22500)
// ];
// books[0].Show();
// books[1].Show();
// books[2].Show();

// let books:{
//     name:string,
//     author:string,
//     prive:number,
//     Show:(name:string,author:string,price:number)=>void
// }[] = [{name:이름, author:작가,price:가격,Show:show},{},{}];


// 유저 3명의 정보를 출력하시오
// 유저는 아이디, 비밀번호, 주소, 성별, 나이를 가짐
// 출력시 비밀번호는 출력이 안됨

// 위 프로그램을 class, prototype 두가지를 이용해서 각각 만들 보시오

// class User{
//     #id:string;
//     #pw:string;
//     #location:string;
//     #gender:string;
//     #age:number;
//     constructor(id:string, pw:string, location:string, gender:string, age:number){
//         this.#id=id; this.#pw=pw; this.#location = location; this.#gender=gender; this.#age=age;
//     }
//     get id():string{return this.#id;} set id(id:string){this.#id = id;}
//     get pw():string{return this.#pw;} set pw(pw:string){this.#pw = pw;}
//     get location():string{return this.#location;} set location(location:string){this.#location = location;}
//     get gender():string{return this.#gender;} set gender(gender:string){this.#gender = gender;}
//     get age():number{return this.#age;} set age(age:number){this.#age = age;}

//     Show(){
//         console.log(`아이디 : ${this.#id}`);
//         console.log(`패스워드 : ${this.#pw}`);
//         console.log(`주소 : ${this.#location}`);
//         console.log(`성별 : ${this.#gender}`);
//         console.log(`나이 : ${this.#age}`);
//     }
// }
// let users:User[] = [
//     new User("아이디1","패스워드1","주소1","성별1",1),
//     new User("아이디2","패스워드2","주소2","성별2",2),
//     new User("아이디3","패스워드3","주소3","성별3",3),
// ];
// users[0].Show();
// users[1].Show();
// users[2].Show();

// function Show(id:string, pw:string, location:string, gender:string, age:number){
//     console.log(`아이디 : ${id}`);
//     console.log(`패스워드 : ${pw}`);
//     console.log(`주소 : ${location}`);
//     console.log(`성별 : ${gender}`);
//     console.log(`나이 : ${age}`);
// }
// let users:{
//     id:string,
//     pw:string,
//     location:string,
//     gender:string,
//     age:number,
//     Show:(id:string, pw:string, location:string, gender:string, age:number)=>void
// }[] = [
//     {id:"아이디1",pw:"패스워드1",location:"주소1",gender:"성별1", age:1, Show:Show},
//     {id:"아이디2",pw:"패스워드2",location:"주소2",gender:"성별2", age:2, Show:Show},
//     {id:"아이디3",pw:"패스워드3",location:"주소3",gender:"성별3", age:3, Show:Show},
// ];

// users[0].Show(users[0].id, users[0].pw, users[0].location, users[0].gender, users[0].age);
// users[1].Show(users[1].id, users[1].pw, users[1].location, users[1].gender, users[1].age);
// users[2].Show(users[2].id, users[2].pw, users[2].location, users[2].gender, users[2].age);

// let a:[string, number] = ["문자열", 50]; // tuple
// enum A {a, b}; // enum
// type a = string; // 자료형 변환


