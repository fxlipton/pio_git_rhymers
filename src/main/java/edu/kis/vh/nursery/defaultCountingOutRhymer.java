package edu.kis.vh.nursery;

/**
 * Ta klasa reprezentuje domyślny rymownik, 
 * który jest prostą implementacją stosu przy użyciu tablicy.
 */
public class DefaultCountingOutRhymer {

    /**
     * Rozmiar tablicy używanej do przechowywania elementów stosu.
     */
    private static final int ARRAY_SIZE = 12;

    /**
     * Stała reprezentująca początkowy stan stosu.
     */
    private static final int TOTAL = -1;

    /**
     * Stała reprezentująca indeks, gdy stos jest pełny.
     */
    private static final int FULL = 11;

    /**
     * Tablica używana do przechowywania elementów stosu.
     */
    private final int[] NUMBERS = new int[ARRAY_SIZE];

    /**
     * Bieżąca liczba elementów w stosie.
     */
    private int total = TOTAL;

    /**
     * Zwraca bieżącą liczbę elementów w stosie.
     *
     * @return bieżąca liczba elementów w stosie
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową liczbę całkowitą na stos.
     *
     * @param in liczba całkowita do dodania na stos
     */
    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false
     */
    protected boolean callCheck() {
        return total == TOTAL;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true, jeśli stos jest pełny, w przeciwnym razie false
     */
    protected boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca wartość na szczycie stosu bez jej usuwania.
     *
     * @return wartość na szczycie stosu lub TOTAL, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    /**
     * Usuwa i zwraca wartość na szczycie stosu.
     *
     * @return wartość na szczycie stosu lub TOTAL, jeśli stos jest pusty
     */
    protected int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }

}
