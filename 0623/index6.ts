// proxy란?
// 프로토타입 자료형({}) 의 데이터에서 특정 데이터에 대한 접근을 막고싶거나
// 혹은 접근시 자동 암호화를 하고 싶을때 그런 동작들을 해당 데이터에 추가시키는 기능 => 프록시
// 스크립트의 프록시 => 함수 대리자, 필터
// 보안 
// 개발자, 팀원, 사용자, 불법 사용자

// 프록시는 일종의 클래스
// new Proxy(); // 생성 후 이용
// let target:any = {
//     id:"아이디",
//     pw:"비밀번호"
// };

// let proxyTarget:any = new Proxy(target, {
//     get(target, prop, receiver) {   // 값을 받아올때
//         if(prop == 'pw' || prop == 'password' || prop == 'pwd') return undefined;
//         return target[prop];
//     },
//     set(target, prop, value, receiver):boolean {    // 값을 넣거나 수정
//         if(prop == 'id' || prop == 'identified') return true;   // ID 값은 못바꾸고 에러는 없게, false는 못바꾸고 에러를 띄운다.
//         target[prop] = value;
//         return true;
//     }
// });
// console.log(proxyTarget.id);
// console.log(proxyTarget.pw);
// proxyTarget.id = "바꾸고싶어";
// console.log(proxyTarget.id);
// console.log(proxyTarget.pw);
// --------------------------------------------------------------------------------------------------------------------------

// let target:any = {
//     id:"아이디",
//     pw:"Password",
//     Func(data:number){}
// };
// let proxy = new Proxy(target, {
//     get(target, p, receiver) {
//         if(p == 'pw' || p == 'password' || p == 'pwd') return atob(target[p]);  // pw는 암호화해서 리턴 (암호화에 한글이 안된다)
//         return target[p];
//     },
//     set(target, p, newValue, receiver){
//         target[p] = newValue;
//         return true;
//     },
//     has(target, p) {    // target 안에 p가 들어있는지 여부 => p in target
//         return p in target;
//     },
//     apply(target, thisArg, argArray) {  // 함수 호출
//         console.log(target);
//         console.log(thisArg);
//         console.log(argArray);
//     },
//     // defineProperty(target, property, attributes) {}, 원래 없던 값을 추가
//     // deleteProperty(target, p) {}, 원래 있던 값 삭제
// });

// console.log(proxy.pw);
// console.log(proxy.Func(1234));

// --------------------------------------------------------------------------------------------------------------------------
// 값을 넣거나 가져오는 코드를 작성하는게 조금 어려운 경우
// let a:any = {};
// a.a;
// a['a'];

// proxy와 함께 이용하기 편리한 데이터 자료형 => Reflect
// let target = {};
// Reflect.get(target, 'key'); // 키값에 해당하는 값을 가져와

// let target = {}
// new Proxy(target, {
//     get(target, p, receiver){
//         return Reflect.get(target, p);
//     },
// });

// --------------------------------------------------------------------------------------------------------------------------
// proxy.ts 파일 생성