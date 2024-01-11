import java.util.Scanner;

public class ContaBancaria {
        private double saldo;

        //Setters para definir saldo.
        public void setsaldo(double saldo){
            this.saldo = saldo;
        }
        //Getter para obter saldo
        public double getsaldo(){
            return saldo;
        }
        //Metodo para depositar dinheiro na conta
        public void depositar (double valor){
         if (valor >0){
             saldo += valor;
             System.out.println("Deposito de R$" + valor + "realizado com sucesso");
         }else {
         }System.out.println("Valor invalido para deposito.");
        }
    //Metodo para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "foi realizado com sucesso.");
        } else {
            System.out.println("Valor invalido para saque, saldo insuficiente.");
        }
    }
    public class ExemploContaBancaria {
            public static void main (String[] args){
                Scanner sacanner = new Scanner(System.in);
                ContaBancaria conta = new ContaBancaria();

                //Definindo saldo inicial
                conta.setsaldo(1000);

                int opçao;

                do {
                    System.out.println("Escolha uma opção");
                    System.out.println("1. Depositar.");
                    System.out.println("2. Sacar.");
                    System.out.println("3. Verificar saldo.");
                    System.out.println("0. Sair.");

                    opçao = sacanner.nextInt();

                    switch (opçao){
                        case 1 :
                            System.out.println("Digite o valor a depositar.");
                            double ValorDeposito = sacanner.nextDouble();
                            conta.depositar(ValorDeposito);
                            break;

                        case 2:
                            System.out.println("Digite o valor do saque.");
                            double ValorSaque = sacanner.nextDouble();
                            conta.sacar(ValorSaque);
                            break;

                        case 3:
                            System.out.println("Saldo atual" + conta.getsaldo());
                            break;

                        case 0:
                            System.out.println("Saindo do programa.");
                            break;

                        default:
                            System.out.println("Esta opção é invalida.");
                            break;
                    }
                } while (opçao !=0);

                sacanner.close();







            }
    }
}






