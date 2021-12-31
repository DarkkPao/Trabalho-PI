package TelaCadastro;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFornecedores {

    public List<Fornecedores> lerArquivoF() {
        String path = "arquivofornecedores.csv";

        List<Fornecedores> list = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while (line != null) {

                String[] vect = line.split(";");
                String Idf = vect[0];
                String Fornecedor = vect[1];
                String Inscricao = vect[2];
                String CNPJ = vect[3];
                String Telefone = vect[4];

                Fornecedores c = new Fornecedores(Idf, Fornecedor, Inscricao, CNPJ, Telefone);
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
