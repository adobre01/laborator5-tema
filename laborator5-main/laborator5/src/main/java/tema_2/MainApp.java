package tema_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    static void scriere(List<PerecheNumere> lista) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("perechi.json"), lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<PerecheNumere> citire() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<PerecheNumere> lista = new ArrayList<>();
        try {
            PerecheNumere[] perechi = objectMapper.readValue(new File("perechi.json"), PerecheNumere[].class);
            lista = Arrays.asList(perechi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void main(String[] args) {
        List<PerecheNumere> listaPerechi = new ArrayList<>();
        listaPerechi.add(new PerecheNumere(2, 4));
        listaPerechi.add(new PerecheNumere(8, 13));
        listaPerechi.add(new PerecheNumere(11, 20));
        listaPerechi.add(new PerecheNumere(8, 5));
        listaPerechi.add(new PerecheNumere(100, 20));

        scriere(listaPerechi);

        List<PerecheNumere> listaCitita = citire();
        for (PerecheNumere pereche : listaCitita) {
            System.out.println("\n");
            System.out.println(pereche);

            System.out.println("Sunt consecutive în Fibonacci: " + pereche.suntConsecutiveInFibonacci());
            System.out.println("CMMDC: " + pereche.cmmc());
            System.out.println("Suma cifrelor egală: " + pereche.sumaCifrelorEgala());
            System.out.println("Număr de cifre pare egal: " + pereche.numarCifrePare());
        }
    }

}
