package zoldseges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Vegyesbolt {
    public static void main(String[] args) {
        Vegyesbolt vegyesBolt= new Vegyesbolt();
        try {
            vegyesBolt.bevasarlok(Path.of("kosar.txt"));
            mivanAKosaramban();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
    public static ArrayList<Termek> termekek =new ArrayList<>();
    public static void bevasarlok(Path path) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(""));
        for (String line : lines) {
            String[] fields = line.split(";");
            Salata salata = new Salata(
                    Integer.parseInt(fields[2]),
                    Integer.parseInt(fields[1])
                    );
            termekek.add(salata);
            RohadtParadicsom rohadtParadicsom= new RohadtParadicsom(
                    Integer.parseInt(fields[2]),
                    Integer.parseInt(fields[1])
                    );

            termekek.add(rohadtParadicsom);


        }


    }
    public static void mivanAKosaramban(){
        for(int i =0; i < termekek.size() ; i++) {
            System.out.println ( termekek.get(i).toString() );
        }

    }
}