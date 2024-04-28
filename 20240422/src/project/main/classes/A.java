package project.main.classes;

// 다이아몬드 확장 문제는 매우 심각한 문제
// 자바에서는 확장은 무조건 1:1
// A extends 1개
// 그래서 어쩔수 없이 여러개를 확장해야 하는 경우 -> 변수로 포함

public class A {}
class B extends A{}
class C extends A{}
// class D extends B extends C {}
