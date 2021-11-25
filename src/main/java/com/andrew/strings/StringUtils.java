package com.andrew.strings;

public interface StringUtils {

    /**
     * Считает количество вхождений буквы в строку, если буквы нету вернуть -1
     */
    int charCount(String str, char letter);

    /**
     * Переворачивает строку, использовать StringBuilder нельзя.
     */
    String reverse(String str);

    /**
     * Функция Создает строку всех символов английского алфавита "A..Z", где
     * четные буквы upper case, а нечетные в low case.
     *
     * @return StringBuilder с алфавитом.
     */
    StringBuilder alphabet();

    /**
     * Функция преобразует словосочетание в CamelCase независимо от оригинального регистра букв<br>
     * Исключением служит первая буква. Её регистр нужно оставить нетронутым<br>
     * Разделителем слов служат пробелы и запятые<br>
     * Вначале и вконце строки возможны дополнительные пробелы<br>
     * Пример: "HeLlO jAvA, WoRlD" -&gt; "HelloJavaWorld"
     *
     * @param str
     *            обычная строка
     * @return строка в CamelCase<br>
     *         или пустая строка если аргумент null или пустая строка
     */
    String toCamelCase(String str);

    /**
     * Функция преобразует CamelCase строку в словосочетания в нижнем регистре<br>
     * Исключением служит первая буква. Её регистр нужно оставить нетронутым<br>
     * Пример: "HelloJavaWorld" -&gt; "Hello java world"
     *
     * @param camelStr
     *            CamelCase строка
     * @return обычная строка<br>
     *         или пустая строка если аргумент null или пустая строка
     */
    String fromCamelCase(String camelStr);

    /**
     * Функция удаление лишних пробелов.
     *
     * Примечания:
     * 1) Пробелы в начале полностью удаляются
     * 2) Пробелы в конце полностью удаляются
     *
     * Пример: " Андрей   топ джавист  ! " => "Андрей топ джавист ! "
     */
    String trim(String str);
}
