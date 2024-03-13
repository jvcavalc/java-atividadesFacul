//algoritmo insertionsort ordem Alfabética
public class Ex01 {
    public static void main(String[] args) {
        String[] paises = {"Brasil", "México", "Cuba", "Argentina", "Chile", "Espanha"};

        insertSort(paises);

        System.out.println("Lista de países em ordem:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public static void insertSort(String[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) { //O método compareTo é da classe String,
                array[j + 1] = array[j];                    //que realiza comparações lexicográficas (alfabéticas)
                j--;
            }

            array[j + 1] = key;
        }
    }
}