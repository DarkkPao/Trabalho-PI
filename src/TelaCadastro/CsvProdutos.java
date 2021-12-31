package TelaCadastro;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvProdutos {

    public List<Produtos> lerArquivoP() {
        String path = "arquivoprodutos.csv";

        List<Produtos> list = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while (line != null) {

                String[] vect = line.split(";");
                String Codigo = vect[0];
                String Produto = vect[1];
                String Fornecedor = vect[2];
                String Preco = vect[3];

                Produtos c = new Produtos(Codigo, Produto, Fornecedor, Preco);
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
