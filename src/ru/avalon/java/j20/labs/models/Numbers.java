package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param <Type>
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static <Type extends Number> Integer sum(Integer[] values) {
        Integer sum = 0;
        for (Integer value : values) sum += value;
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param <Type>
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <Type extends Number> double avg(Integer[] values) {
        return (double) sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param <Type>
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static <Type extends Number> Integer max(Integer a, Integer b) {
        return a > b ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param <Type>
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static <Type extends Number> int max(Integer[] values) {
        Integer result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return (int) result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param <Type>
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    public static <Type extends Number> Integer min(Integer a, Integer b) {
        return a < b ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param <Type>
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static <Type extends Number> int min(Integer[] values) {
        Integer result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return (int) result;
    }
}
