import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();
        System.out.println("              ");

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("              ");

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("              ");

        System.out.println("Digite sua data de nascimento: DD/MM/AAAA ");
        String dataNascimento = scanner.nextLine();
        System.out.println("              ");

        Scanner genero = new Scanner(System.in);
        String sexo;
        char g;
        char g1 = 'M';
        char g2 = 'F';
        System.out.println("Digite seu sexo: ");
        sexo = genero.next();
        System.out.println("                 ");

        switch(g1) {
            case 'M':
                System.out.println("Maculino");

                break;
            case 'F':
                System.out.println("Femenino");
                break;

            default:
                System.out.println("Invalido");
                break;
        }


        System.out.println("Digite seu cep: ");
        String cep = scanner.nextLine();
        System.out.println("              ");

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("              ");

        System.out.println("Digite o numero da casa / apartamento: ");
        String numeroCasa = scanner.nextLine();
        System.out.println("              ");

        System.out.println("Confira seus dados: ");

        System.out.println("email: "+email+"\n" +"cpf: "+cpf+"\n" +"nome: "+nomeCompleto+"\n"+
                    "nascimento: "+dataNascimento+"\n" +"sexo: "+sexo+"\n" +"cep: "+cep+"\n"+
                    "endreço: "+endereco+"\n" +"numero da casa: "+ numeroCasa);

        System.out.println("Os dados estão corretos? ");
        Scanner confirmar = new Scanner(System.in);
        String confirm;
        char r;
        char r1 = 'S';
        char r2 = 'N';
        System.out.println("Digite S para sim, e N para não: ");
        confirm = confirmar.next();

        switch(r1) {
            case 'S':
                System.out.println("Tudo certo. Sua conta foi criada com sucesso!");

                break;
            case 'N':
                System.out.println("Não? Qual ítem deseja corrigir?");
                break;

            default:
                System.out.println("Invalido");
                break;
        }
    }


}