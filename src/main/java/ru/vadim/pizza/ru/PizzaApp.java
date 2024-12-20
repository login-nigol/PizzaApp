package ru.vadim.pizza.ru;

import org.springframework.boot.CommandLineRunner;

/**
 * @ComponentScan - указывает путь для сканирования пакетов, для поиска
 * классов помеченных нижеуказанными аннотациями
 * @Component - помечаем классы как кандидаты в спринг бины
 * @Controller - помечаем классы контроллеры
 * @Service - помечаем классы сервисы
 * <p>
 * Constructor injection
 * Setter injection
 * Field injection (use @Autowired)
 * @Autowired - указывает спрингу, что сюда нужно внедрить зависимость!!!
 * <p>
 * <<< User <-> Controller <-> Service <-> Repository <-> Model >>>
 */

//@SpringBootApplication
    // Запуск приложения с командной строки
public class PizzaApp implements CommandLineRunner {

    //@Autowired
    //private PizzaController pizzaController;

//    public static void main(String[] args) {
//        SpringApplication.run(PizzaApp.class, args);
//    }

    @Override
    public void run(String... args) throws Exception {
//        List<Pizza> all = pizzaController.getAll();
//        System.out.println(all);
    }
}
