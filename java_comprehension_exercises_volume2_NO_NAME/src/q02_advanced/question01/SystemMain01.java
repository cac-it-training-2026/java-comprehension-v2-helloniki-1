package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member Member1 = new Member(303, "show_pass", "表示テストメンバー", 40, 2);
		Member Member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		Member1.showMember();
		Member2.showMember();

	}

}
