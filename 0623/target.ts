// import { User } from "./type";
// import { UserEncode  } from "./function";
// let user:User = {
//     id:"MyID",
//     pw:"Why",
//     gender:"Male"
// }
// let encrypt:any = UserEncode(user);
// console.log(encrypt.id);
// console.log(encrypt.pw);
// console.log(encrypt.gender);
// console.log(encrypt.json);
// console.log(encrypt.jsonEncrypt);

// -----------------------------------------------------------------------
// Person 정의
// 이름, 나이, 탄생년도, 거주지
// 20 ~ 30대 추출 (비동기)
// 김씨 모두 추출 (동기)
// 1980년대생 모두 추출 (비동기)
// 프록시로 거주지 정보는 일반적으로 획득 불가능하게
// 거주지 정보는 백도어로 #persnalplacedataget으로 획득
// 암호화된 정보를 excrypt

import { Person } from "./type";
import { PersonEncode, PrototypeListToList, EnableList } from "./function";

let persons:Person = {
    name:"hong", age:28, birth:new Date(2020, 5, 25), location:"seoul"
};
let en:any = PersonEncode(persons);
console.log(en.name);