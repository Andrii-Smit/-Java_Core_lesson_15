package task1;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("¬ведите 1, чтобы зарегистрировать нового участника зооклуба");
		System.out.println("¬ведите 2, чтобы добавить животное участнику зооклуба");
		System.out.println("¬ведите 3, чтобы удалить животное у участника зооклуба");
		System.out.println("¬ведите 4, чтобы удалить участника из зооклуба");
		System.out.println("¬ведите 5, чтобы удалить введенное животное у всех участников зооклуба");
		System.out.println("¬ведите 6, чтобы вывести зооклуб на экран");
		System.out.println("¬ведите 0, чтобы выйти из программы");
	}
	
	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				zooClub.addZooClubMember();
				break;
			}

			case 2: {
				zooClub.addAnimal();
				break;
			}

			case 3: {
				zooClub.removeAnimal();
				break;
			}

			case 4: {
				zooClub.removeZooClubMember();
				break;
			}

			case 5: {
				zooClub.removeAnimalFromAllMembers();
				break;
			}

			case 6: {
				zooClub.viewZooClub();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("¬ведите число от 0 до 6!");
				break;
			}
			}
		}		

	}

}
