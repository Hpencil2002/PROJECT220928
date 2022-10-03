import java.util.Scanner;
class Player {
	String name;
	String getWordFromUser() {
		Scanner scanner2 = new Scanner(System.in);
		String word = scanner2.next();
		return word;
	}
	void checkSuccess(char last, char first) {
		if (last != first) {
			System.out.print(name + "이 졌습니다.");
			System.exit(0);
		}
	}
}

public class OpenChallenge {
	
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		run();
	}

	static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니다>>");
		int num = scanner.nextInt();
		Player player[] = new Player[num];
		
		for (int i = 0; i < num; i++)
			player[i] = new Player();
		for (int i = 0; i < num; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			player[i].name = scanner.next();
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		String word = "아버지";
		int lastIndex = word.length() - 1;
		char last = word.charAt(lastIndex);
		char first = word.charAt(0);
		for (int i = 0; i < num; i++) {
			System.out.print(player[i].name + ">>");
			word = player[i].getWordFromUser();
			first = word.charAt(0);
			player[i].checkSuccess(last, first);
			
			if (i == num - 1)
				i = -1;
			
			lastIndex = word.length() - 1;
			last = word.charAt(lastIndex);
		}
	}
}
