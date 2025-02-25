
//////////////////////////////////////////////////
// Интерфейс Func, представляющий собой
// вычисление, принимающее значение типа
// T и возвращающее значение типа R
//
// Метод
// R apply(T t),
// запускающий вычисление функции
//
// Метод
// Func<T,T> identity(),
// возвращающий функцию, которая ничего
// не делает и возвращает переданный ей
// аргумент
//
// Метод
// Func<V,R> compose(??? before),
// принимает функцию before для выполнения до
// текущей (которая принимает V и
// возвращает T) и возвращает её композицию
// с текущей
//
// Метод
// Func<T,V> andThen(??? after),
// принимает функцию after для выполнения
// после текущей (которая принимает R и
// возвращает V) и возвращает композицию
// текущей функции с after
//
// Реализации для Func<Integer,Integer>:
// - Mult, которая умножает входное число на
//   заданное в конструкторе
// - Sub, которая вычитает из входного числа
//   заданное в конструкторе
// - Div, которая делит входное число на
//   заданное в конструкторе


//////////////////////////////////////////////////
// Класс Option, в котором хранится либо
// "пустое" значение, либо значение типа T
//
// Статический метод
// Option<T> empty()
// возвращает "пустое" значение
//
// Методы
// boolean isPresent()
// boolean isEmpty()
//
// Метод
// T orElse(T other),
// который возвращает значение, если оно
// есть, или other, если значение "пустое"
//
// Метод
// Option<U> map(??? mapper),
// который принимает Func mapper, и
// применяет его к значению, если оно не
// пустое (или возвращает пустое значение,
// если хранится пустое значение)

public class L3 {
    public static void main(String[] args) {
    }
}
