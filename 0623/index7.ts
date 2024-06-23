// 외부에 미리 만들어둔 내용을 가져오도록 기능화
import { PasswordBlind, PasswordChange } from "./proxy";

// JS import의 2가지 방식 => CommonJS, Module
// exports.module = {};
// require('file');
 
let a = {
    id:"아이디",
    pw:"비번"
};
let p = PasswordBlind(a);
console.log(p.pw);