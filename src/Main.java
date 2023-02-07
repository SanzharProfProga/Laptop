public class Main {
    public static void main(String[] args) {
    /*    Cиздердин ноутбуктун характеристикасы:

    Төмөнкү объектилер үчүн класстарды түзүңүз:

    Компьютер
            - Дисплей
            - Марка
            - Цвет
            - Жесткий диск/или SSD
            - Оперативная память
            - Видео карта
            - USB порты (Массив портов)
            - Клавиатура

        Дисплей
                - Диагональ
                - Производитель
                - Тип матрицы

        Жесткий диск/SSD
            - Объем памяти
            - На сколько дисков разделен

        Оперативная память
        - Объем
        - Производитель

        USB порт
        -  (2.0 или 3.0)
        - id порта


         Клавиатура
        - Подсветкасы барбы жокбу
        - Допольнительный цифралар барбы он жагында
        ----------------------------------------------------------------------------------------------------
                Баардык класстар үчүн конструкторлорду түзүңүз (баардык поля)
        Компьютериңизди сүрөттөгөн бир компьютер объектисин түзүңүз.

        PS: Дисплей, жестский диск, оперативная память,  usb port,  баары өзүнчө класс болуш керек
        объектилерин мейн класстан түзөсүздөр.*/

        Display display = new Display(15.6, "Acer", "LCD");
        SSD ssd = new SSD(512, (short) 1);
        RAM ram = new RAM(8.0d, "Micron");
        VideoCard videoCard = new VideoCard("GeForce GTX 1650", 4);
        USB usb = new USB(3.1, 92631);
        Keyboard keyboard = new Keyboard();
        keyboard.setIllumination(true);
        keyboard.setAdditionalKeys(true);


        Laptop laptop = new Laptop("Acer nitro 5", "Black with shades of red", ssd.getInfoSSD(), ram.getInfoRAM(), display.getInfoDis(),
                videoCard.getInfoViCard(), usb.getInfoUSB(), keyboard.getInfoKey());
         System.out.println(laptop.toString());


    }
}