import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeContatos {

    private Map<String, String> contatos;
    private Scanner scanner;

    public GerenciadorDeContatos() {
        contatos = new HashMap<String, String>();
        scanner = new Scanner(System.in);
    }

    public void adicionarContato() {
        System.out.println("Adicionar contato");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Número de telefone: ");
        String numeroTelefone = scanner.nextLine();
        contatos.put(nome, numeroTelefone);
        System.out.println("Contato adicionado: " + nome + " - " + numeroTelefone);
    }

    public void removerContato() {
        System.out.println("Remover contato");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void buscarContato() {
        System.out.println("Buscar contato");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        if (contatos.containsKey(nome)) {
            String numeroTelefone = contatos.get(nome);
            System.out.println("Número de telefone de " + nome + ": " + numeroTelefone);
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void listarContatos() {
        System.out.println("Contatos:");
        for (Map.Entry<String, String> contato : contatos.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
    }
}
