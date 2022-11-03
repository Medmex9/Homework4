public class Main {
    public static void main(String[] args) {

        // Урок 4. Задание 1.

for (int i = 0; i <= 10;i++ ) {
        System.out.println(i);
    }
        // Задание 2.
        for (int i = 10; i >0;i-- ) {
            System.out.println(i);
        }

//Задание 3.
        for (int n = 0; n<=17; n=n+2){
            System.out.println(n);}
        //Задание 4

        for (int l = 10; l>=-10; l--){
            System.out.println(l);}
// Задание 5
        for (int j = 1904; j <=2096; j = j+4){
            System.out.println(j + "год является високосным");}

        //Задание 6
        for (int l = 0; l<99; l = l+7) {
            System.out.println(l);}

        // Задание 7
        for (int z = 1; z<513; z =z*2) {
            System.out.println(z);}

        //Задание 8
        int postponed = 29_000;
        int total = 0;
        for (int x = 1; x<=12; x++) {
            total = total + postponed;
            System.out.println("Месяц " +x +" , сумма накоплений равна " +total +" рублей");}
            //Задание 9
            int savings = 29_000;
            int totalAccruals = 0;
            for (int c = 1; c<=12; c++) {
                totalAccruals = totalAccruals + totalAccruals/100;
                totalAccruals = totalAccruals + savings;
                System.out.println("Месяц " +c +" , сумма накоплений равна " +totalAccruals +" рублей");}
        }
    }
