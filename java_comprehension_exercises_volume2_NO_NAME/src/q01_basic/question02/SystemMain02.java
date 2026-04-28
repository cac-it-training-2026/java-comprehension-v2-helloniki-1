package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member = new Member();
		member.setAge(20);
		member.setRank(1);
		member.setName("Miura Manabu");
		member.showMember();

		member.rankUp();

		System.out.println("---GET RANK--- ");
		System.out.println("newRank:2 " + member.getRank());
		Member member1 = new Member();
		member1.setAge(28);
		member1.setRank(4);
		member1.setName("高橋三郎");
		member1.showMember();
	}
}
