package Enum.EnumDemo3;

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple(int p) { price = p; }

    Apple() { price = -1; }

    int getPrice() { return price; }
}

class EnumDemo3
{
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Яблоко сорта Winesap стоит " + Apple.Winesap.getPrice() + " центов.");

        System.out.println("Цена на все сорта яблок:");
        for (Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
    }
}