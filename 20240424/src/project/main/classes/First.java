package project.main.classes;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

// annotation -> @interface

// retention -> 주기(수명)
@Retention(RUNTIME)
// Target 이야 말로 매우 중요한 대상
// 대상이 변수다
@Target(FIELD)
public @interface First {
	String A() default "기본값";
	int B() default 2;
	// annotation 에 default 값이 없으면 무조건 넣어야 하는 값
	int value(); // value 가 기본 명칭
}
