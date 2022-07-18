import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final boolean FAIR = true; // true - честные сделки, false - нечестные сделки

    public static void main(String[] args) {
        List<Deal> dealList = new ArrayList<>();

        dealList.add(new Deal(105.65, 45.1, 100_000_000));  // цена за 1 кв.м. = 20987.17
        dealList.add(new Deal(35.8, 48.9, 11_000_000));     // цена за 1 кв.м. = 6283.4
        dealList.add(new Deal(95.65, 45.9, 18_000_000));    // цена за 1 кв.м. = 4099.91
        dealList.add(new Deal(185.65, 11.5, 1_500_000));    // цена за 1 кв.м. = 702.58
        dealList.add(new Deal(105.65, 45.3, 1_000_000));    // цена за 1 кв.м. = 208.9
        dealList.add(new Deal(134.65, 67.8, 999_995));      // цена за 1 кв.м. = 109.53
        dealList.add(new Deal(189.65, 23, 105_900));        // цена за 1 кв.м. = 24.27
        dealList.add(new Deal(105.65, 45.1, 106_000));      // цена за 1 кв.м. = 22.24
        dealList.add(new Deal(76.5, 87.3, 15_000));         // цена за 1 кв.м. = 2.24
        dealList.add(new Deal(135.65, 45.7, 10_500));       // цена за 1 кв.м. = 2.2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рекомендованную цену за 1 кв.метр земельного участка:");
        int price = scanner.nextInt();
        printDeals(dealList, price, FAIR);
    }

    static void printDeals(List<Deal> list, int priceOfOneSM, boolean fair) {
        if (fair) {
             list.stream()
                    .filter(x -> x.getPrice() / (x.getLength() * x.getWidth()) < priceOfOneSM)
                    .forEach(System.out::println);
        } else {
             list.stream()
                    .filter(x -> x.getPrice() / (x.getLength() * x.getWidth()) >= priceOfOneSM)
                    .forEach(System.out::println);
        }
    }
}