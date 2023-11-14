import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите год начала счастливой жизни:");
        Scanner key = new Scanner(System.in);
        int startOfLife = key.nextInt();
        SearchOfProcentage searchOfProcentage = new SearchOfProcentage();
        searchOfProcentage.requiredPercentageMethod(startOfLife);
    }
}