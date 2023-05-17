package controlstatement;

public class Controls {
    public static void main(String[] args) {
        int i = 10;
        {
            int k = 15;
            System.out.println("I = " + i);
            System.out.println("K = " + k);

        }

        int countOrder = 9;
        System.out.println("У тебя");
        if (countOrder >= 20) {
            System.out.println("больше 20 заказов, Ты хорошо поработал Братик! Покупай продукты, ");
        } else if (countOrder >= 10) {
            System.out.println("больше или равно 10 заказов, Тебе бы ещё добить до 20 ки!");
        } else  {
            System.out.println("меньше 10 ки заказов, Ой братик давай ЕБАШ!!! ");
        }
        System.out.println("а потом езжай домой!!!");
    }
}

