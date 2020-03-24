import org.jetbrains.annotations.Nullable;

public class Main {
    public static void main(String[] args) {
        int[] price = {5, 100, 20, 66, 16};
        int[] decryptPrice = decryptData(price, 50, 1, 3);

        for (int i = 0; i < decryptPrice.length; i++) {
            System.out.print(decryptPrice[i] + ",");
        }

    }

    public static @Nullable int[] decryptData(int[] price, int discount, int offset, int readLength) {

        int[] decryptPrice = new int[readLength];

        for (int i = offset, j = 0; i < offset + readLength; i++, j++) {
            decryptPrice[j] = price[i] - price[i] * discount / 100;
        }

        return decryptPrice;
    }
}
