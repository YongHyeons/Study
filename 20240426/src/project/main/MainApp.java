package project.main;

import java.util.Scanner;

import project.main.classes.BBS;
import project.main.classes.DataOverException;
import project.main.classes.DateException;
import project.main.classes.IdNullException;
import project.main.classes.LessCountException;
import project.main.classes.TitleException;

public class MainApp {
	public static void main(String[] args) {
		
		// 내가 예측하지 못한 값이 들어오는 경우를 제외하고 싶은 상황이 온다
		// 예외 처리라는 하나의 방법 -> if
		
		// 자동으로 오류를 탐지하고 예외처리를 하기 위해서 나온 기능
		// try-catch
		// 원래 if 로 내가 어떤 오류인지 직접 제어했어야 했던 예외처리를
		// 자동으로 처리하도록 만들어주는 기능
		
		// try -> 내가 동작하고 싶은 내용을 적고
		// catch -> 동작에 실패했을때 하고싶은 동작을 적는다
		
//		try {
//			int a = 5 , b = 0;
//			// 에러가 발생하는 순간 발생하는 에러의 정보를 던지고
//			System.out.println(a/b);
//		} 
//		catch (Exception e) 
//		{	// Exception -> 오류를 저장하기위한 클래스
//			// e -> 변수명
//			// 던진 에러의 정보를 catch 에서 받아서 후처리를 한다
//			System.out.println("예외로 인해 오류 감지");
//			e.printStackTrace();
//		}
//		
//		System.out.println("예외 처리 후 동작");
		
		// try-catch 이용시 한가지 유의할 사항
//		Test a = new Test();
//		a.run();
		 
		// try-catch를 이용하면 여러 중첩된 메서드 안에서의 오류들을
		// 외부에서 따로 처리하는 기능도 구현이 가능하다 -> Outlet
//		try {
//			a.run();
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("run / by zero 메서드 실행 오류");
//		}
//		catch (Exception e) {
//			System.out.println("run 메서드 실행 오류");
//		}

		/*
		 * SignupUser 수정
		 * 아이디, 나이, 주소 입력
		 * 아이디가 빈 문자열(.length < 1) 이거나 나이가 15보다 작은 경우 예외 처리
		 * 아이디가 비어있으면 아이디를 입력하세요 출력
		 * 나이가 15보다 작으면 15세 이하는 가입 불가 출력
		 * 주소는 상관없음
		 * Signup 메서드로 가입처리
		 */
		
//		SignupUser a = new SignupUser(scan.nextLine(), scan.next(), scan.next(), scan.nextInt(), scan.next());
//		while(true) {
//			try {
//				a.Signup();
//				break;
//			} catch (IDException e) {
//				System.out.println("아이디를 입력하세요");
//				a.id = scan.nextLine();
//			} catch (PasswordException e) {
//				System.out.println("비밀번호가 서로 다릅니다");
//				System.out.println("비밀번호 입력");
//				a.pw = scan.next();
//				System.out.println("비밀번호 재입력");
//				a.pwre = scan.next();
//			} catch (AgeException e) {
//				System.out.println("15세 이하는 가입 불가");
//				break;
//			} catch (Exception e) {
//				e.printStackTrace();
//				break;
//			}
//		}
		
//		try {
//			return;
//		} 
//		catch (Exception e) {
//			return;
//		}
		// 최종적으로
		// try 의 실행 여부나 catch 의 실행 여부와 상관 없이 무조건 마지막에 호출
//		finally {
//			System.out.println("마지막 호출");
//			scan.close();	
//		}
		
//		StreamingOTT a = new StreamingOTT();
//		
//		a.On();
//		
//		try {
//			a.Watch("종이의집");
//			a.Run();
//			a.Exit();
//		} catch (TurnOffStreamingException e) {
//			System.out.println("스트리밍 서비스를 켜주세요");
//		} catch (DoNotExitStreamingException e) {
//			System.out.println("스트리밍 서비스를 종료 후 나가주세요");
//		} finally {
//			a.Off();
//			try {
//				a.Exit();
//			} catch (DoNotExitStreamingException e) {}
//		}
		
		// 아에 자동으로 finally 동작이 되도록 기능을 추가하면 어떨까?
//		try
//			(
//				Scanner scan = new Scanner(System.in);
//				StreamingOTT streaming = new StreamingOTT();
//				Scanner scan2 = new Scanner(System.in);
//			)
//		{
//			// 오토 클로징 -> try 변수
//		}
//		catch(Exception e) {
//			
//		}
		
		/*
		 * 게시글 작성 프로그래밍
		 * 게시글은 제목, 본문, 작성자, 작성일, 조회수, 좋아요 수를 가진다
		 * 제목, 작성자, 작성일은 필수
		 * 조회수나 좋아요수가 음수인 경우 오류
		 * 제목, 작성자, 작성일이 비어있으면 오류
		 * 본문 내용이 50자를 넘어가면 오류
		 * 오류시 다시 한번 입력하도록 한 후 재 작성
		 * 게시글 작성 후 close로 작성창 종료라고 출력
		 */
		
//		BBS b = new BBS("123","123","123","123",1,1);
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			try {
//				b.InputBoard();
//			} catch (TitleException e) {
//				System.out.println("제목 미입력, 다시 입력하세요");
//				b.title = s.nextLine();
//			} catch (IdNullException e) {
//				System.out.println("작성자 미입력, 다시 입력하세요");
//				b.id = s.nextLine();
//			} catch (DateException e) {
//				System.out.println("작성일 미입력, 다시 입력하세요");
//				b.date = s.nextLine();
//			} catch (DataOverException e) {
//				System.out.println("50자 이하로 입력하세요");
//				b.data = s.nextLine();
//			} catch (LessCountException e) {
//				System.out.println("조회수 또는 좋아요수 음수 오류");
//				b.view = s.nextInt(); 
//				b.like = s.nextInt();
//			} finally { s.close(); }
//		}
//		-----------------------------------------------------------------
		
		try(Scanner scan = new Scanner(System.in);){
			Board board = new Board("", "", "");
			while(true) {
				try {
					System.out.println("Title >>");
					board.Title(scan.next());
				} catch (Exception e) { continue; }
				break;
			}
			while(true) {
				try {
					System.out.println("Body >>");
					board.Body(scan.next());
				} catch (Exception e) { continue; }
				break;
			}
			while(true) {
				try {
					System.out.println("Author >>");
					board.Author(scan.next());
				} catch (Exception e) { continue; }
				break;
			}
			while(true) {
				try {
					System.out.println("Date >>");
					board.Date(scan.next());
				} catch (Exception e) { continue; }
				break;
			}
			while(true) {
				try {
					System.out.println("View >>");
					board.View(scan.nextInt());
				} catch (Exception e) { continue; }
				break;
			}
			while(true) {
				try {
					System.out.println("Like >>");
					board.Like(scan.nextInt());
				} catch (Exception e) { continue; }
				break;
			}
		}catch(Exception e){
			
		}
		
		
	}
}
