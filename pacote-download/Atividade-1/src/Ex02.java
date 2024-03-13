//algoritmo selectsort ordem decrescente
public class Ex02 {
    public static void main(String[] args) {
        int[] nmrs = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};

        selectSortDec(nmrs);

        System.out.println("Lista ordenada em ordem decrescente:");
        for (int n : nmrs) {
            System.out.print(n + " ");
        }
    }

    public static void selectSortDec(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceM = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[indiceM]) {
                    indiceM = j;
                }
            }

            int temp = array[i];
            array[i] = array[indiceM];
            array[indiceM] = temp;
        }
    }
}