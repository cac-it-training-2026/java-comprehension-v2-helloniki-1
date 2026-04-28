package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		Member Member1 = new Member(1234, "test123", "鈴木一郎", 40, 5);
		Member Member2 = new Member(9999, "defaultPass", "デフォルト太郎 ", 0, 0);
		members[0] = Member1;
		members[1] = Member2;

		MemberManager.showAllMembers(members);

	}

}
