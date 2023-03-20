import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Consultas extends Repository {

    Repository repo;

    public Consultas(){
        repo = new Repository();
    }

    public LinkedList<RegistroDoTempo> getAllData() {
        repo.loadData();

        LinkedList<RegistroDoTempo> registros = repo.getAll(); // get all registers

        for (RegistroDoTempo reg : registros) {
            System.out.println(reg.toString()); // print each register to the console
        }
        
    }



    // public List<String> datasEmQueChouveuMaisDe(double milimetros) {
    //     return registros
    //             .stream()
    //             .filter(r -> r.getPrecipitacaoMaxima() > milimetros)
    //             .map(r -> r.getDia() + "/" + r.getMes() + "/" + r.getAno())
    //             .toList()
    // }

    // public String diaQueMaisChoveuNoAno(int ano) {
    //     RegistroDoTempo registro = registros
    //             .stream()
    //             .filter(reg -> reg.getAno() == ano)
    //             .max(Comparator.comparing(RegistroDoTempo::getPrecipitacaoMaxima))
    //             .orElseThrow(IllegalArgumentException::new);
    //     String resp = registro.getDia() + "/" + registro.getMes() + "/" + registro.getAno() + ", "
    //             + registro.getPrecipitacaoMaxima();
    //     return resp;
    // }
}

// “comentário inserido no branch main
