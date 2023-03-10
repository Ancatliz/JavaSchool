package Моя;

public class Content {

    /** lesson_01  (22.12.22)
     * Знакомство с git
     * IDEA - знакомство
     * знакомство с примитивными типами данных


****
    lesson_02  (26.12.22)
     * Как работает git - ветки, загрузка
     * массивы
     * Создание класса
     Массив можно представить в виде архивного шкафа с множеством ящиков, внутри которых хранятся
     данные одного типа. Доступ к конкретному ящику выполняют через его номер который называется индексом.
     Бывают одномерные и многомерные массивы
     Пример создания массива:
     int[ ] array = new int[ ]; // Стиль Java (предпочтительнее)
     2. int array[ ] = new int[ ]; // Стиль С/С++
     * Пример массива:
     String[] season = new String[ ]{"Зима", "Весна", "Лето", "Осень"};
     String[] season = {"Зима", "Весна", "Лето", "Осень"};
     String[] month = new String[3]
     month [0] = 4;
     month [1] = 2;
     month [2] = 7;
     С помощью массивов удобно создать например: список пассажиров автобуса,
     у которых есть номер места, или список автомобилей в гаражном комплексе где
     каждый автомобиль находится в пронумерованном гараже и т. д.


****
    lesson_03  (29.12.22)
     * Примитивные типы данных
     * Классы с их конструкторами и методами
     * Static

     Класс - это описательная часть определенной сущности. Класс содержит в себе параметры (элементы)
     принадлежащие этой сущности. В методах класса мы задаём весь функционал сущности, а конструктор
     позволяет нам использовать параметры у копий (объектов) этой сущности, не прописывая их каждый раз заново.

     Экземпляр класса (объект) создаётся в результирующем файле кода программы. По сути это копия нашей
     сущности которая имеет все или частичные её параметры.

     При работе с объектом мы можем использовать функционал любого метода которые были созданы в классе,
     создав ссылку через название метода.

****
   lesson_04  (09.01.23)
     * Циклы
     * Арифметические операторы
     * Рекурсия
     * Разбор домашнего задания Морской бой

****
     lesson_05  (12.01.23)
     * Модификаторы доступа и наследование

****
     lesson_06  (16.01.23)
     * Принципы ООП:
       1. Инкапсуляция - область видимости, реализованная через модификаторы доступа:
                     * Public - чаще всего используемый модификатор. Поля и методы будут доступны во всех классах и пакетах проекта;
                     * Protected - доступен внутри пакета и у наследников данного класса независимо в каком пакете использовать;
                     * default - если ничего не указываем перед параметром или методом, то реализуется по умолчанию этот модификатор, который даёт доступ внутри данного пакета;
                     * Private - самый закрытый модификатор. Даёт доступ только внутри класса. К полям с этим модификатором мы можем создать доступ через Getter (получение данных) и Setter (изменение данных).
        Все переопределённые параметры могут быть либо с таким же модификатором, либо с модификатором имеющим более широкий доступ (например из Protected в Public).
     2. Абстракция - когда мы используем простые вещи, при описани чего-то сложного или хотим выделить главные, наиболее значиме характеристии предмета.
         Примером абстракции например являются String методы, которые мы спользуем повсеместно, а "под копотом" находится более сложная структура решения.
         Абстрактные классы впитали в себя свойства обычных классов и интерфейсов. Например мы можем создать в таком классе обычаный метод и
         метод который будут обязаны реализовать у себя дочерние классы от данного
     3. Наследование - это механизм, который позволяет создавать классы (дочерние) на основе  других классов (материнских).
             Дочерний класс через extends, наследует поля, конструкторы и метoды материнского класса,
        а так же имеет возможность переопределять их под свои особенности. Например метод say у класса animal "животное говорит"
        унаследует собака, но метод say будет выводить "собака говорит гав".
     4. Полиморфизм - это способность использовать свойства одного объекта использовать для описания другого.
        Например метыды с одинаковым названием, но разными параметрами (называется перегрузка метода).
        Также переопределение материнского метода является полиморфизмом.
        Также присвоение параметров ката общему животному Animal animal = new Cat ();



****
     lesson_07  (19.01.23)
     - Абстрактные классы и интерфейсы, восходящее/нисходящее преобразование
     - Интерфейсы - переобразование и наследование
      * Интерфейс - это некий класси-инструкция несущий в себе методы обязательные для исполнения наследуемыми классами.
        - Наследоваться интерфейс может несколько раз.
        - У интерфейсов нельзя создавать конструкторы или объекты
        - Параметры интерфейсов уже внутри java  являются static final.
        - Методы static необходимо реализовывать сразу.
        - Можно создавать default метод, который необязателен к реализации наследуемыми методами.
      * Абстрактные классы впитали в себя свойства обычных классов и интерфейсов. Так в нем можно создавать
      параметры и методы как в обычаном классе, и так же можем сождать метод который будут обязаны реализовать
      у себя дочерние классы от данного как в интерфейсе.
        - При наследовании от абстрактного, класс идёт с extends, а не с implement.
     * ENUM - это класс созданный для типизации данных. Он представляет собой некий более строгий массив.
      Их удобно структурировать.
        - ENUM всегда static, его невозможно унаследовать, создать абстрактные методы и создать локальные переменные;
        - switch всегда создают через ENUM
****
     lesson_08  (23.01.23)
      - Исключения - Exception;
        Есть 2 основных исключения
        Checked (проверяемые) - которые компилятор требует обработать
        Unchecked (непроверяемые) - которые могут произойти, но это не точно.
            Такие ошибки обрабатывать для JAVA не обязательно. Но с точки зрения разработки нужно.
            Обработка ошибки производится через try catch. Где в try мы записываем часть кода в котором может произойти ошибка,
            а в catch обрабатываем саму ошибку, если она всё таки произошла в блоке кода записанном в  try.
            И тогда программа не упадёт и предложит варианты, проверяя этот блок кода.
            Так же мы можем проверить код на вероятность возникновения нескольких ошибок. Для этого в try с помощью
            команды throw new (вызываемая ошибка например RuntimeException), которая принудительно вызывает ошибку, мы прописываем все ошибки
            которые могут возникнуть в данном куске кода и в catch обрабатываем каждую ошибку.
            Действия на описанную в catch ошибку так же распространяются и на её наследников, поэтому при обработке кода нужну не забывать
            про иерархию ( сначала обрабатываем самую низшую в иерархии ошибку, потом двигаемся выше).
            Так же мы можем создавать свои ошибки, не прописанные в Java. Например: наша программа обращается к нескольким источника
            и в одном из источников произошла ошибка. Мы создадим ошибку указывающую нам на тот источник с ошибкой.
            finally - необязательная команда которая выполнится независимо от того есть ошибка или нет (служит для закрытия файла или сети)

****
     lesson_09  (26.01.23)
     - Потоки IO и NIO
     С помощью потоков осуществляется ввод и вывод в программах.
     В Java есть два основных пакета для работы с потоками это IO (Потокоориентированный. Блокирующий ввод/вывод) и
     NIO (Буфер - ориентированный. Не блокирующий ввод/вывод).

      Рассмотрим на примере открытия пользователем файла. Когда пользоатель открывает файл,
      между ним и файлом создаётся канал, по которому поступает поток данных.
      При работе с пакетом IO (приставка Stream) с этим открытым файлом может работать только один пользователь. Второй
         пользователь сможет открыть этот файл только после того как его закроет первый.
     При работе с пакетом NIO (приставка BUFFER) с этим файлом могут работать несколько поьзователей, так как канал состоит из буферов
     через которые поступают данные и файл при этом остаётся свободным к доступу другим пользователям.

     Определены 2 типа потоков: байтовые и символьные.
     В соответствии с названием байтовые используют для ввода и вывода байтов, а символьные для символов.
     Для работы с байтовыми потоками служат 2 абстрактных класса InputStream (для работы с потоками ввода) и
     OutputStream (для работы с потоками вывода).
     Reader - абстарактный класс описывающий потоковвый ввод символов;
     Writer - абстарактный класс описывающий потоковвый вывод символов;
     InputStream - абстарактный класс описывающий потоковвый ввод байтов;
     OutputStream- абстарактный класс описывающий потоковвый вывод байтов.
     Производные классы от классов Reader и Writer оперируют символами в уникоде.
     Примеры байтового потока:
     BufferedlnputStream - буферизованный поток ввода;
     ByteArrayInputStream -	поток ввода для чтения из байтового массива
     FileOutputStream	- поток вывода для записи в файл;
     PrintStream -	поток вывода с методами print() и println()
     Примеры символьного потока:
     BufferedWriter -	буферизованный поток вывода символов;
     FileReader -	поток ввода для чтения символов из файла;
     InputStreamReader -	поток ввода с преобразованием байтов в символы;
     PrintWriter -	поток вывода с методами print() и println()

     Потокам необходимо указывать рамки в пределах которых они должны работать или закрывать их с помощью flush или close.
     У любого потока должно быть место соединения (куда писать или откуда считывать)
     try-catch with resource - упрощённая версия try-catch в которой ресурс записывается
     в параметрах try, а не снаружи и он закрывается автоматически. Ресурсом являются все наседники Closeable.
****
     lesson_10  (30.01.23)
    * Обобщение ( Generic) и нюансы работы с ним. Принцип PECS
    * Хорошая статья: https://habr.com/ru/company/sberbank/blog/416413/
    * Ссылка на код. Сейчас сидел не со своего ноутбука и нечаянно загрузил не в тот гит, но думаю не критично :)
    * https://github.com/Orlova-Sveta/Lesson_10

     Generics - это средства языка Java, созданные для работы с различными типами данных без изменения их описания.
     Даймонд оператор - это символы (<>) внутри которых записывается тип переменных, при использовании Generic,
     с которыми предстоит работать.
     Generics работают только с классами (Integer, Character...)

     Generic по умолчанию инвариантный, но с помощью особой конструкции (Wildcard) можно изменить логику Generic
     на ковариантный (<? extends>) и контравариантный  (<? super>).
     Но при использовании Wildcard мы получаем ограничения которые называются PECS
     PECS (Producer Extends Consumer Super) - ограничения которые при использовании extends (Producer Extends) позволяют
     только предоставлять данные, а при использовании super (Consumer Super) только читать данные.
     Как правило Wildcard используют в методах. В методах мы можем ограничивать типы которые смогут туда проходить.
     Параметры типов - это некий класс с неопределенным типом. Чтобы использовать его нужно сначала создать.
     Параметризованный тип даёт нам универсальность используемых типов.
     Например мы можем создать класс с неопределенным параметром,
     а указать параметр только при создании объекта этого класса.
     Ограничивать типы можно только в рамках одной иерархии.
     По такому принципу работают листы.
     List<?> - при такой формулировки мы можем положить любой тип, но лишает возможность использовать методы.


****
     lesson_11  (02.02.23)
     * Java Collection API
     * Про коллекции: https://habr.com/ru/post/237043/
     * Чуть попроще и обширней https://habr.com/ru/post/696184/

     Библиотека Collection имеет родителя Iterable и насследников List, Queue, Set и Map (есть картинка в Материалы).
     Все коллекции использут Generic.
     В List есть односвязные (ArrayList) и двусвязные (LinkedList).
     ArrayList - это динамический массив который знает только своего соседа спереди (Создаёт 16 элементов, если нужно
     больше перезаписывает до 32. если нужно больше перезаписывает до 128 и т.д.). Свойства как у массива. Можно достать любой
     элемент по его ID (индексу).
     LinkedList - хранит ссылки на элементы которые не находятся в одном месте (разбросаны по оперативной памяти).
      Каждый элемент знает кто стоит перед ним и кто стоит сзади. Каждый элемент весит больше. Но при добавлении элементов в
     в конец или в начало занимает столько же памяти как и у ArrayList.
     В обиходе LinkedList и ArrayList используются одинаково (у них одни методы), разница в скорости.
     Через sout можем выводить сразу list, а не как у массивов через Arreys.toString().

     Queue (Fifo - first in первый зашёл первый вышел) - как месенджер. В строгой очереди сообщения идут на телефон, даже после
      сбоя интернета.
     Deque (Lifo - linked in последний зашел первый вышел) - как курьерская служба. Задача быстрее разгребсти склад. Забирают
     коробку как спереди так и сзади.
     Когда элемент из очереди забрали, он исчезает.
     Map - ассациативные массивы. Не относятся к основной иерархии Collection.
     Представляет из себя двумерный массив, на первом уровне у которого находится ключ-код.
     Ключ является главной особенностью, если мы добавим элемент с ключем который уже существует,
     существующий элемент перезапишется.
     С помощью метода .values() мы можем вывести все значения элементов.
     .put - аналог set-ера.

***
     lesson_12  (06.02.23)
    * Stream API. Функциональные интерфейсы. Лямбда-выражения
     * Код: https://github.com/BoreBoreDoria/Lesson_12
     * Полезные ссылки: Про Лямбда: https://habr.com/ru/post/512730/
     * Про Стримы: https://habr.com/ru/post/437038/
     * Функциональные интерфейсы: https://metanit.com/java/tutorial/9.3.php
     Функциональное програмирование. Интерфейсы находятся в java.util.functional
     Функциональный метод в интерфейсе может быть только один, а дефолтных много.


     ***
     lesson_13  (09.02.23)
     * Maven
     * Статья про Maven и инструкция установки: https://habr.com/ru/post/77382/
     * Так-же код для файла setting.xml (Сам файл советую создать при помощи программы Notepad++)
     *
     *
     * <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     *   xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
     *   <localRepository/>
     *   <interactiveMode/>
     *   <offline/>
     *   <pluginGroups/>
     *   <servers/>
     *   <mirrors/>
     *   <proxies/>
     *   <profiles/>
     *   <activeProfiles/>
     * </settings>



     */
}
