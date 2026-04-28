package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		System.out.println("input id>>");
		try {
			cr.inputNumber();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			inputId = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("error!");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		System.out.println("input password>>");
		try {
			cr.inputString();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			inputPassword = reader.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		Member member = new Member(inputId, inputPassword, "Miura Manabu", 28, 2);

		member.showMember();

	}

}
