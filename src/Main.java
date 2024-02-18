import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        /*      Account деген класс тузунуз ,анын сөзсүз double
         balance деген полясы болот жана сиз  каалагандай
         поле кошсонуз болот
         checkBalance -  балансты текшеруу,
         deposit() - баланска акча кошот ,
         withdrawal() - баланстан акча алат
         transaction() - бир account тан экинчи account ка акча
         которуу методору болсун.
         main методдон  2-3 account тузуп ар кандай
         операцияларды жасаныз      */

        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account();
        Account account2 = new Account("Asan K.", 200);
        Account account3 = new Account("Aizada T.", 500);
        System.out.println(ANSI_YELLOW + " M" + ANSI_RESET + ANSI_CYAN + "Bankка кош келдиниз" + ANSI_RESET);
        System.out.println("Тейлоо тилин танданыз");
        System.out.println(ANSI_GREEN + """
                № 1 Кыргыз тили
                № 2 Русский язык
                № 3 English
                """);
        int language = scanner.nextInt();
        if (language == 1) {
            System.out.println(ANSI_WHITE + "Кируу учун пароль териниз " + ANSI_RESET);
            int pin = scanner.nextInt();
            int money;
            if (pin == 1234) {

                System.out.println("Колдонуучунун аты : " + ANSI_CYAN + "Nurmukhamed A." + ANSI_RESET);
                System.out.println("Сиздин  баланс : " + ANSI_YELLOW + account1.getBalance() + " сом" + ANSI_RESET);
                int a = 1;
                while (a > 0) {
                    System.out.println(ANSI_CYAN + """
                            Операцияны танданыз :
                            1. Балансты текшеруу
                            2. Балансты толуктоо
                            3. Акча чечуу
                            4. Акча которуу
                            5. Программадан чыгуу
                            """ + ANSI_RESET);
                    int count = scanner.nextInt();
                    switch (count) {
                        case 1:
                            System.out.println(ANSI_CYAN + "Nurmukhamed A.");
                            account1.getCheckBalance();
                            System.out.println(ANSI_BLUE + "Asan K.");
                            account2.getCheckBalance();
                            System.out.println(ANSI_PURPLE + "Aizada J");
                            account3.getCheckBalance();
                            break;
                        case 2:
                            System.out.println(ANSI_BLUE + "Акчаны салыныз " + ANSI_RESET);
                            account1.getDeposit(scanner.nextInt());
                            break;
                        case 3:
                            System.out.println(ANSI_BLUE + "Акча чечуу учун керектуу сумманы жазыныз" + ANSI_RESET);
                            account1.getWithdraw(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println(ANSI_PURPLE + """
                                    Акча которуу учун керектуу адамды танданыз
                                    1. Asan.K
                                    2. Aizada T.
                                    """ + ANSI_RESET);
                            int recipient = scanner.nextInt();
                            switch (recipient) {
                                case 1:
                                    System.out.print(ANSI_CYAN + "Asan K. керектуу сумманы жазыныз : " + ANSI_RESET);
                                    account1.getTranslation(money = scanner.nextInt());
                                    if (account1.getBalance() >= money) {
                                        System.out.println(ANSI_GREEN + "Asan K.нын качыгы " + ANSI_RESET);
                                        account2.getDeposit(money);
                                    } else {
                                        System.err.println("Балансты толуктаныз");
                                    }
                                    break;
                                case 2:
                                    System.out.print(ANSI_CYAN + "Aizada T. керектуу сумманы сумманы жазыныз : " + ANSI_RESET);
                                    account1.getTranslation(money = scanner.nextInt());
                                    if (account1.getBalance() >= money) {
                                        System.out.print(ANSI_GREEN + "Aizada T.нын качыгы " + ANSI_RESET);
                                        account3.getDeposit(money);

                                    } else {
                                        System.err.println("Балансты толуктаныз");
                                    }
                                    break;
                                default:
                                    System.err.println("Мындай киши жок");
                                    break;
                            }
                            break;
                        case 5:
                            a = -1;
                            account1.getExit();
                            break;
                        default:
                            System.out.println(ANSI_WHITE + "Туура эмес баскычты тандадыныз" + ANSI_RESET);
                            break;
                    }


                }
            } else {
                System.err.println("Пароль туура эмес !");
            }
        } else if (language == 2) {
            System.out.println(ANSI_WHITE + """
                     Конечно благодарю что вы выбрали русский язык,
                     но мы пока не можем обслуживать на русском :(
                     можете пока выбрать другой язык :)
                     Спасибо за понимание !
                    """);

        } else {
            System.out.println(ANSI_WHITE + """
                    thank you for choosing English,
                    but we can't serve in English yet :(
                    You can choose another language now :)
                    Thanks for understanding !
                    """);
        }
    }


}


