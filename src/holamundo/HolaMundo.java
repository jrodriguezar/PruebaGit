package holamundo;

public class HolaMundo {
    public static void main(String[] args) {
        Practica cuenta = new Practica();
        cuenta.number = 4121;
        cuenta.owner = "Valeria";
        cuenta.balance = 12;
        System.out.println(cuenta.number);
        cuenta.deposit(4000);
        System.out.println("El estado actual de la cuenta es: ");
        System.out.println(cuenta.balance); 
    }
}
