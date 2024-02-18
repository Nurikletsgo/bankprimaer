
public class Account {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private String name;
    private double balance ;


    public Account() {
    }

    public Account( String name, double balance) {
        this.name = name;
        this.balance = balance;

    }


    public double getBalance() {
        return balance;
    }
    public void getCheckBalance( ){
        System.out.println(" Сиздин учурдагы баланс : "+ANSI_YELLOW+balance+" сом"+ANSI_RESET);
    }

    public void getDeposit(double money) {
        balance += money;
        System.out.println(" Толукталды " +ANSI_YELLOW+ money + " сом"+ANSI_RESET);
    }

    public void getWithdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(" Чечилди " +ANSI_YELLOW+ money+ " сом"+ANSI_RESET);
        } else {
            System.err.println(ANSI_YELLOW+ money + "сом "+ANSI_RESET+"чечуу учун балансынызда акча жетишсиз. Сиздин баланс: " +ANSI_YELLOW+ balance + " сом"+ANSI_RESET);
        }
    }
    public void getExit(){
        System.out.println("Корушкончо "+ANSI_YELLOW+"M"+ANSI_CYAN+"Bank"+ANSI_RESET+" ар дайым жанынызда !");
    }
    public void getTranslation(double money){
        if (balance >= money) {
            balance -= money;
            System.out.println(" Которулду " +ANSI_YELLOW+ money+ " сом"+ANSI_RESET);
        } else {
            System.err.println(ANSI_YELLOW+ money + "сом "+ANSI_RESET+"которуу учун балансынызда акча жетишсиз. Сиздин баланс: " +ANSI_YELLOW+ balance + " сом"+ANSI_RESET);
        }
    }
}

