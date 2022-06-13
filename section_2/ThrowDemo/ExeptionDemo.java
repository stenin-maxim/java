

class MyExeption extends Exception
{
    private int detail;

    MyExeption(int a) {
        detail = a;
    }

    public String toString() {
        return "MyExeption[" + detail + "]";
    }
}

class ExeptionDemo {
    static void compute(int a) throws MyExeption {
        System.out.println("Вызван метод compute(" + a + ")");

        if (a > 10)
            throw new MyExeption(a);

        System.out.println("Нормальное завершение");
    }

    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        } catch (MyExeption e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}