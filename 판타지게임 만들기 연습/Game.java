import java.util.Scanner;

class MakeStatus {
    String name;
    String job;
    int hp = 20;
    int str = 5;
    int dex = 5;
    int def = 5;
    int luk = 5;

    void lvup() {
        hp += 2;
        str += 3;
        dex += 1;
        def += 1;
        luk += 0;
    }

    int attack() {
        return (int) (str + 0.1 * dex + 0.1 * luk);
    }

    int defence() {
        return (int) (def + 0.1 * dex + 0.1 * luk);
    }

    void reutrnStaus() {
        System.out.println("이름: " + name);
        System.out.println("직업: " + job);
        System.out.println("체력: " + hp);
        System.out.println("공격력: " + str);
        System.out.println("방어력: " + def);
        System.out.println("민첩성: " + dex);
        System.out.println("행운: " + luk);
    }

}

class Monster {
    int hp = 10;
    int str = 3;
    int def = 3;

    int Attack() {
        return str;
    }

    int Defence() {
        return def;
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MakeStatus chrc = new MakeStatus();
        System.out.println("********************");
        System.out.println("판타지 퀘스트 ver.1");
        System.out.println("********************");

        System.out.print("모험을 시작하시겠습니까? y/n");

        while (true) {
            String start = sc.next();
            if (start.equals("y")) {
                break;
            } else {
                System.out.println("정말로? y/n");
            }
        }

        System.out.println("시작합니다. 이름을 입력하세요.");
        chrc.name = sc.next();

        System.out.println("직업을 고르세요. 1:용사 / 2:성기사 / 3.도적");
        int num = sc.nextInt();

        while (true) {
            if (num == 1) {
                chrc.str += 5;
                chrc.def -= 2;
                chrc.dex += 3;
                chrc.job = "용사";
                break;
            } else if (num == 2) {
                chrc.str += 3;
                chrc.def += 5;
                chrc.dex -= 2;
                chrc.job = "성기사";
                break;
            } else if (num == 3) {
                chrc.str += 3;
                chrc.def -= 5;
                chrc.dex += 10;
                chrc.job = "도적";
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        System.out.println("********************");
        System.out.println("캐릭터 생성 성공! 스탯창을 불러옵니다.");
        chrc.reutrnStaus();

    }
}
