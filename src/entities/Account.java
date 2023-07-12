package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // Quando uma instância da classe Account é criada, eu primeiro verifico se o construtor chamado tem três argumentos ou dois. Isso depende se o usuário optou por fazer um depósito inicial ou não.
    public Account(int number, String holder) {
        // No construtor, eu armazeno os valores fornecidos nos campos number e holder.
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        // Se o construtor com três argumentos for chamado, eu também chamo o método deposit para incrementar o balance com o valor do depósito inicial.
        deposit(initialDeposit);
    }

    // A classe Account possui métodos getters para number, holder e balance. Também possui um setter para holder.
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // O método deposit adiciona o valor fornecido ao saldo.
    public void deposit(double amount) {
        balance += amount;
    }

    // O método withdraw subtrai do saldo o valor fornecido mais uma taxa fixa de 5.0.
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    // O método toString retorna uma representação em string da conta com o número, titular e saldo.
    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }

}
