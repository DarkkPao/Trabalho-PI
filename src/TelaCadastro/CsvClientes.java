package TelaCadastro;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvClientes {

    public List<Clientes> lerArquivo() {
        String path = "arquivoclientes.csv";

        List<Clientes> list = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while (line != null) {

                String[] vect = line.split(";");
                String id = vect[0];
                String Cliente = vect[1];
                String Endereco = vect[2];
                String CPF = vect[3];
                String Telefone = vect[4];

                Clientes c = new Clientes(id, Cliente, Endereco, CPF, Telefone);
                list.add(c);

                line = br.readLine();
            }

            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
