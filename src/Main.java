public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        for (int i = 0; i < 10; i = i + 1){
            System.out.println("Итерация цикла " + i);
        }

        //Task 2
        for (int k = 10; k > 0; k = k - 1){
            System.out.println("Итерация цикла " + k);
        }

        //Task 3
        for (int g = 0; g < 17; g = g + 2){
            System.out.println("Итерация цикла " + g);
        }

        //Task 4
        for (int t = 10; t > -10; t = t - 1){
            System.out.println("Итерация цикла " + t);
        }

        //Task 5
        for (int r = 1904; r < 2096; r = r + 4){
            System.out.println(r + " год является високосным ");
        }

        //Task 6
        for (int q = 7; q < 100; q = q + 7){
            System.out.println(q);
        }

        //Task 7
        for (int y = 1; y < 512; y = y * 2){
            System.out.println(y);
        }

        //Task 8
        System.out.println("Task 8");
        int money = 0;
        for (int h = 1; h <= 12; h++) {
            money += 29000;
            System.out.println("Месяц " + h + " , сумма накоплений равна " + money + " рублей ");
        }

        //Task 9
        System.out.println("Task 9");
        money = 0;
        for (int h = 1; h <= 12; h++) {
            money += 29000;
            money *= 1.01;
            System.out.println("Месяц " + h + " , сумма накоплений равна " + money + " рублей ");
        }

        //Task 10
        System.out.println("Task 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}
