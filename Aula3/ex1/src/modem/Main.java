package modem;

// Interface responsável apenas pela conexão
interface Connection {
    void dial(String pno);
    void hangup();
}

// Interface responsável apenas pela comunicação de dados
interface DataChannel {
    void send(char c);
    char recv();
}

// Classe que implementa as duas responsabilidades
class ModemDevice implements Connection, DataChannel {
    @Override
    public void dial(String pno) {
        System.out.println("Discando para " + pno);
    }

    @Override
    public void hangup() {
        System.out.println("Encerrando chamada.");
    }

    @Override
    public void send(char c) {
        System.out.println("Enviando: " + c);
    }

    @Override
    public char recv() {
        return 'A'; 
    }
}


public class Main {
    public static void main(String[] args) {
        ModemDevice modem = new ModemDevice();

        modem.dial("12345");
        modem.send('H');
        char recebido = modem.recv();
        System.out.println("Recebido: " + recebido);
        modem.hangup();
    }
}

/* Por que essa nova
organização é mais vantajosa para a
manutenibilidade e flexibilidade do código?

Pois o código fica mais limpo, modular e fácil de manter*/
