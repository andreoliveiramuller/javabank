package application;

// Primeiro, carrego na memória as bibliotecas necessárias especificadas nas instruções de importação. São elas java.util.Locale, java.util.Scanner e entities.Account.
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

    public static void main(String[] args) {

        // Ao entrar no método main, eu defino o locale padrão para os Estados Unidos com Locale.setDefault(Locale.US). Isso impactará a forma como números e datas são formatados posteriormente.
        Locale.setDefault(Locale.US);

        // Depois, eu crio um objeto Scanner chamado sc que será usado para receber entradas do usuário.
        Scanner sc = new Scanner(System.in);

        // A seguir, eu declaro uma variável chamada account do tipo Account, mas ainda não instancio a classe.
        Account account;

        // Agora eu imprimo na saída padrão a solicitação "Enter account number:" e aguardo pela entrada do usuário. Quando o usuário fornecer a entrada, eu armazeno na variável number.
        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        // Eu imprimo "Enter account holder:", e aguardo a entrada do usuário novamente. Devido a peculiaridade do Scanner, eu chamo sc.nextLine() para consumir a linha restante, e depois capturo a entrada do usuário na variável holder.
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        // Na próxima etapa, eu pergunto ao usuário se há um depósito inicial, imprimindo "Is there an initial deposit (y/n)?". Eu recebo a entrada do usuário e armazeno o primeiro caractere na variável response.
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        // Com base no valor de response, eu tomo uma decisão: se o valor for 'y', eu solicito ao usuário o valor do depósito inicial, imprimo "Enter initial deposit value:" e armazeno a entrada na variável initialDeposit. Eu então instancio a classe Account com o número da conta, o titular e o valor do depósito inicial. Se o valor não for 'y', eu instancio a classe Account apenas com o número e o titular da conta.
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        // Após instanciar a classe Account, eu imprimo uma linha vazia e depois "Account data:", seguido dos detalhes da conta. Esses detalhes são obtidos chamando o método toString da classe Account.
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        // Na sequência, eu peço ao usuário para entrar com um valor de depósito, armazeno a entrada na variável depositValue e chamo o método deposit da conta com esse valor.
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        // Imprimo novamente os detalhes da conta atualizados.
        System.out.println("Updated account data: ");
        System.out.println(account);

        // Depois, eu peço ao usuário para entrar com um valor de retirada, armazeno na variável withdrawValue e chamo o método withdraw da conta com esse valor.
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        // Por fim, imprimo os detalhes da conta atualizados e fecho o Scanner.
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }

}
