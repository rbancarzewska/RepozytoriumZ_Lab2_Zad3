import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        // Tworzenie pierwszej tablicy (0-4)
        int[] tab1 = {0, 1, 2, 3, 4};

        // Tworzenie drugiej tablicy (4-8)
        int[] tab2 = {4, 5, 6, 7, 8};

        // 1. Oblicz sumę wszystkich elementów każdej z tablic
        int sumaTab1 = Arrays.stream(tab1).sum();
        int sumaTab2 = Arrays.stream(tab2).sum();

        // 2. Znajdź maksymalną i minimalną wartość dla każdej tablicy
        int maxTab1 = Arrays.stream(tab1).max().orElseThrow();
        int minTab1 = Arrays.stream(tab1).min().orElseThrow();

        int maxTab2 = Arrays.stream(tab2).max().orElseThrow();
        int minTab2 = Arrays.stream(tab2).min().orElseThrow();

        // 3. Oblicz średnią wszystkich wartości w każdej tablicy
        double sredniaTab1 = Arrays.stream(tab1).average().orElseThrow();
        double sredniaTab2 = Arrays.stream(tab2).average().orElseThrow();

        // 4. Utwórz kopię istniejącej tablicy
        int[] kopiaTab1 = Arrays.copyOf(tab1, tab1.length);
        int[] kopiaTab2 = Arrays.copyOf(tab2, tab2.length);

        // 5. Wybierz elementy z drugiej tablicy większe od 3
        int[] nowaTab2WiekszeOd3 = Arrays.stream(tab2).filter(x -> x > 3).toArray();

        // 6. Usuń element 7 z tablicy
        int[] nowaTab2Bez7 = Arrays.stream(tab2).filter(x -> x != 7).toArray();

        // 7. Połącz tablice pierwszą i drugą
        int[] polaczoneTablice = new int[tab1.length + tab2.length];
        System.arraycopy(tab1, 0, polaczoneTablice, 0, tab1.length);
        System.arraycopy(tab2, 0, polaczoneTablice, tab1.length, tab2.length);

        // 8. Znajdź liczbę wystąpień wartości 5 w drugiej tablicy
        long ileRazy5wTab2 = Arrays.stream(tab2).filter(x -> x == 5).count();

        // Wyświetlanie wyników
        System.out.println("1. Suma elementów w tablicy 1: " + sumaTab1);
        System.out.println("   Suma elementów w tablicy 2: " + sumaTab2);
        System.out.println("2. Max i min wartości w tablicy 1: " + maxTab1 + ", " + minTab1);
        System.out.println("   Max i min wartości w tablicy 2: " + maxTab2 + ", " + minTab2);
        System.out.println("3. Średnia wartości w tablicy 1: " + sredniaTab1);
        System.out.println("   Średnia wartości w tablicy 2: " + sredniaTab2);
        System.out.println("4. Kopia tablicy 1: " + Arrays.toString(kopiaTab1));
        System.out.println("   Kopia tablicy 2: " + Arrays.toString(kopiaTab2));
        System.out.println("5. Elementy większe od 3 w tablicy 2: " + Arrays.toString(nowaTab2WiekszeOd3));
        System.out.println("6. Tablica 2 bez elementu 7: " + Arrays.toString(nowaTab2Bez7));
        System.out.println("7. Połączone tablice: " + Arrays.toString(polaczoneTablice));
        System.out.println("8. Liczba wystąpień wartości 5 w tablicy 2: " + ileRazy5wTab2);
    }
}
