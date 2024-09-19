Создайте класс Птица, которая будет являться корнем иерархии для всех, кто является подвидом птицы.

В разработанную сущность необходимо вынести все, что будет общим для птиц. Для того, чтобы определить необходимые члены класса, проанализируйте три примера птиц:

+ Воробей. Умеет петь. При пении на экран выводится строка “чырык”.
+ Кукушка. Умеет петь. При пении на экран выводится текст “ку-ку”, причем текст выводится случайное количество раз в диапазоне от 1 до 10. 
+ Попугай. Имеет текст и умеет петь этот текст. При инициализации обязательно необходимо указать текст, который будет исполняться. При пении текст выводится не весь, а первые N символов (не менее одного и не более всех символов текста), где N определяется случайно.