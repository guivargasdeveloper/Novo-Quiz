package Dados;
import java.util.Scanner;

public class Quiz {
    public int iniciarQuiz() {
        int cont = 0;
        String respostaUsuario;

        System.out.println("==================================================");
        System.out.println("           Bem-vindo ao Quiz de " +
                "Guilherme Augusto de Oliveira Vargas");
        System.out.println("             Faculdade Alfredo Nasser");
        System.out.println("                Professor: Brenno");
        System.out.println("            Tema: Tecnologia");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("===== Quiz: Tecnologia =====");

        cont += fazerQuestao(" 1) Qual empresa desenvolveu o sistema operacional Android?",
                "a) Microsoft",
                "b) Google",
                "c) Apple",
                "d) Samsung",
                "e) IBM",
                "b");

        cont += fazerQuestao("2) O que significa a sigla 'HTTP'?",
                "a)  HyperText Transfer Protocol",
                "b) High Transfer Technology Protocol",
                "c) Hyper Terminal Transfer Path",
                "d) High Text Transfer Port",
                "e) HyperText Transfer Pathway",
                "a");

        cont += fazerQuestao("3) Qual foi o primeiro computador pessoal amplamente popularizado?",
                "a) Commodore 64",
                "b) IBM PC",
                "c) Apple II",
                "d) Altair 8800",
                "e) ZX Spectrum",
                "c");

        cont += fazerQuestao("4) Em que ano foi lançado o primeiro iPhone?",
                "a) 2005",
                "b) 2006",
                "c) 2007",
                "d) 2008",
                "e) 2009",
                "c");

        cont += fazerQuestao("5) Qual é a linguagem de programação usada para criar a maioria dos aplicativos web?",
                "a)Python",
                "b) Java",
                "c) Javascript",
                "d) PHP",
                "e) Ruby",
                "c");


        cont+= fazerQuestao("6)O que significa a sigla 'IoT'?",
                "a) Internet of Technology",
                "b) Internet of Things",
                "c) Interface of Transmission",
                "d) Integration of Tools",
                "e) Internet of Transfers",
                "b");

        cont+= fazerQuestao("7)Qual empresa criou o processador Intel Core i7?",
                "a) AMD",
                "b) Qualcomm",
                "c) NVIDIA",
                "d) Intel",
                "e) ARM",
                "d");

        cont+= fazerQuestao("8)Qual foi a primeira rede social popular da era moderna?",
                "a) Facebook",
                "b) MySpace",
                "c) Orkut",
                "d) LinkedIn",
                "e) Friendster",
                "b");

        cont+= fazerQuestao("9)Qual linguagem de programação é conhecida por sua simplicidade e uso em aprendizado de máquina?",
                "a) Java",
                "b) C++",
                "c) Python",
                "d) R",
                "e) Ruby",
                "c");

        cont+= fazerQuestao("10)Qual é a unidade de medida básica para armazenamento de dados?",
                "a) Byte",
                "b) Bit",
                "c) Megabyte",
                "d) Kilobyte",
                "e) Gigabyte",
                "b");

        cont+= fazerQuestao("11)Qual é a tecnologia de conexão sem fio mais utilizada atualmente?",
                "a) Bluetooth",
                "b)Wi-fi",
                "c) NFC",
                "d) 5G",
                "e) IR",
                "b");

        cont+= fazerQuestao("12)O que significa a sigla 'URL'?",
                "a) Universal Resource Link",
                "b)Uniform Resource Locator",
                "c)Uniform Relay Link",
                "d) Universal Relay Locator",
                "e) Universal Resource Locator",
                "b");

        cont+= fazerQuestao("13)Qual empresa desenvolveu a assistente virtual chamada Alexa?",
                "a) Google",
                "b) Microsoft",
                "c) Amazon",
                "d) Apple",
                "e) Samsung",
                "c");

        cont+= fazerQuestao("14)Qual é a principal funcionalidade do blockchain?",
                "a) Streaming de vídeos",
                "b) Controle de dispositivos IoT",
                "c) Registro descentralizado de transações",
                "d) Desenvolvimento de aplicativos",
                "e) Criação de sites",
                "c");

        cont+= fazerQuestao("15)Qual é o nome da inteligência artificial da OpenAI que conversa com os usuários?",
                "a) Alexa",
                "b) ChatGPT",
                "c) Siri",
                "d) Cortana",
                "e) Google Assistant",
                "b");


        return cont;
    }

    private int fazerQuestao(String pergunta, String opcaoA, String opcaoB, String opcaoC,
                             String opcaoD, String opcaoE, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = opcaoA;
        questao.opcaoB = opcaoB;
        questao.opcaoC = opcaoC;
        questao.opcaoD = opcaoD;
        questao.opcaoE = opcaoE;
        questao.correta = correta;
        questao.escrevaQuestao();
        String respostaUsuario = questao.leiaResposta();
        return questao.isCorreta(respostaUsuario) ? 1 : 0;
    }

}