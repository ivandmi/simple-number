# Пояснительная записка

## Создание проекта
Проект создан в IntelliJ IDEA с помощью Spring Initializr.

## Реализация
Для чисел создан класс Number, в котором два поля: value и simple.
Класс создан для простоты вывода результата проверки и добавления нового функционала над числами. 

Обработка запросов осуществляется с помощью класса NumberController.
На данный момент он обрабатывает только один запрос вида "GET /number/123/simple", где 123 - число, переданное для проверки.

Чтобы не возникало ошибки при конвертации слишком больших чисел или нечисловых значений, использованы регулярные выражения.
Скорей всего это неправильно, так как желательно, выводить причину не выполнения проверки числа.