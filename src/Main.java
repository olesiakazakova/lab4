import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //задание 1
//        Student V = new Student("Ваня");
//        V.addGrade(5);
//        Student P = new Student("Петя");
//        P.addGrade(4);
//        out.println("Задание 1\nСравнение среднего балла студента Вани (" + V.getAverageGrades() + ") " + "со средним баллом Пети (" + P.getAverageGrades() + ")");
//        out.println("Результат сравнения: "+ V.compare(P));
//        V.addGrade(3);
//        out.println("Сравнение среднего балла студента Вани (" + V.getAverageGrades() + ") " + "со средним баллом Пети (" + P.getAverageGrades() + ")");
//        out.println("Результат сравнения: "+ V.compare(P));
//        V.addGrade(3);
//        out.println("Сравнение среднего балла студента Вани (" + V.getAverageGrades() + ") " + "со средним баллом Пети (" + P.getAverageGrades() + ")");
//        out.println("Результат сравнения: "+ V.compare(P));

//        //задание 2
//        out.println("Задание 2\nПоложить в коробку трехмерную точку");
//        Box<Point3D> pointBox = new Box<>();
//        PointToBox.addPointToBox(pointBox);
//        if (pointBox.isEmpty()) out.println("Коробка пуста");
//        else out.println("Коробка занята точкой: " + pointBox.getObj());

//        //задание 3.1
//        out.println("Задание 3.1\nПолучение списка длин следующих строк: \"qwerty\", \"asdfg\", \"zx\"");
//        List<String> strings = List.of("qwerty", "asdfg", "zx");
//        List<Integer> lengths = Transform.transformList(strings, String::length);
//        out.println("Результат: " + lengths);
//        out.println("\nПреобразование отрицательных чисел в положительные\nДан список со значениями: 1,-3,7");
//        List<Integer> numbers = List.of(1, -3, 7);
//        List<Integer> positiveNumbers = Transform.transformList(numbers, n -> Math.abs(n));
//        out.println("Результат: " + positiveNumbers);
//        out.println("\nПолучение списка максимальных значений массивов\nМассивы:");
//        List<int[]> arrays = List.of(
//                new int[]{1, 2, 3},
//                new int[]{-1, -2, -3},
//                new int[]{5, 0, 1}
//        );
//        for (int[] arr : arrays) {
//            System.out.print(Arrays.toString(arr) + "\n");
//        }
//        List<Integer> maxValues = Transform.transformList(arrays, arr -> {
//            int max = arr[0];
//            for (int value : arr) {
//                if (value > max) {
//                    max = value;
//                }
//            }
//            return max;
//        });
//        out.println("Результат: " + maxValues);

//        //задание 3.2
//        out.println("Задание 3.2\nФильтрация строк с длиной менее 3 символов.\nСтроки: \"qwerty\", \"asdfg\", \"zx\"");
//        List<String> strings = List.of("qwerty", "asdfg", "zx");
//        List<String> filteredStrings = Test.filterList(strings, s -> s.length() >= 3);
//        System.out.println("Результат: " + filteredStrings);
//        out.println("\nФильтрация положительных целых чисел\nДан список со значениями: 1,-3,7");
//        List<Integer> numbers = Arrays.asList(1, -3, 7);
//        List<Integer> filteredIntegers = Test.filterList(numbers, n -> n <= 0);
//        System.out.println("Результат: " + filteredIntegers);
//        out.println("\nФильтрация массивов целых чисел с положительными элементами\nМассивы: ");
//        List<int[]> arrays = List.of(
//                new int[]{-1, -2, -3},
//                new int[]{1, 2, 3},
//                new int[]{0, -4, -5}
//        );
//        for (int[] arr : arrays) {
//            System.out.print(Arrays.toString(arr) + "\n");
//        }
//        List<int[]> filteredArrays = Test.filterList(arrays, arr -> {
//            for (int num : arr) {
//                if (num > 0) {
//                    return false;
//                }
//            }
//            return true;
//        });
//        out.println("Результат:");
//        for (int[] arr : filteredArrays) {
//            out.println(Arrays.toString(arr));
//        }

//        //задание 3.3
        out.println("Задание 3.3\nОбъединение строк.\nСтроки: \"qwerty\", \"asdfg\", \"zx\"");
        List<String> strings = List.of("qwerty", "asdfg", "zx");
        String concatenatedString = Reducer.reduceList(strings, s -> String.join("", s));
        out.println("Результат: " + concatenatedString);
        out.println("\nСумма элементов списка.\nДан список со значениями: 1,-3,7");
        List<Integer> numbers = List.of(1, -3, 7);
        Integer sum = Reducer.reduceList(numbers, list -> {
            int sum0 = 0;
            for (Integer num : list) {
                sum0 += num;
            }
            return sum0;
        });
        out.println("Результат: " + sum);
        out.println("\nОбщее количество элементов в списках.\nСписки:");
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );
        for (List<Integer> list : listOfLists) {
            out.println(Arrays.toString(list.toArray()));
        }
        Integer totalElements = Reducer.reduceList(Transform.transformList(listOfLists,List::size), list -> {
            int count = 0;
            for (Integer sublist : list) {
                    count += sublist;
            }
            return count;
        });
        out.println("Результат: " + totalElements);
    }
}