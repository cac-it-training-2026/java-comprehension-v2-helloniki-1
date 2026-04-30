package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[4];
		//TODO ここから実装する/
		NonMember nonMember = new NonMember("Sato Kensuke");
		members[0] = nonMember;
		Member member = new Member(1, "Passw0rd", "Miura Manabu ", 28, 2);
		members[1] = member;
		Member member1 = new Member(99, "show_pass", "表示テストメンバー ", 45, 5);
		members[2] = member1;
		NonMember nonMember1 = new NonMember("非表示テストメンバー");
		members[3] = nonMember1;

		MemberManager.showAllMembers(members);
		members[0].buyItem();
		members[1].buyItem();
		members[2].buyItem();
		members[3].buyItem();

	}

}
