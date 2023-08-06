import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner vyborIgry = new Scanner(System.in);
        boolean newGame = true;

        while (newGame) {
            newGame = false;
            System.out.println("��������:");
            System.out.println("1 - ��������");
            System.out.println("2 - ������");
            System.out.println();
            System.out.println("0 - �����");
            int choice = 0;
            if (vyborIgry.hasNextInt()) choice = vyborIgry.nextInt();
            Game game = null;
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> game = new Piramid();
                case 2 -> game = new Snake();
                default -> System.out.println("�������� ����");
            }
            if (game != null) game.play();
            System.out.println("��������:");
            System.out.println("1 - ������ ���");
            System.out.println("����� ������ ���� - �����");
            if (vyborIgry.hasNextInt()) choice = vyborIgry.nextInt();
            if (choice == 1) newGame = true;
        }


    }
}