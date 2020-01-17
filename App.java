import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        Livro caderno = new Livro(
                " enfant noir",
                Livro.genero.philosophie.toString(),
                " mariam",
                " sonia",
                "99",
                "2019"
        );
        Autor moussa = new Autor(
                "boureima",
                "gana",
                "historien",
                "M",
                " Mali",
                "Bamako",
                32
        );
        Editor sonia = new Editor(
                "sonia",
                32,
                "52425225",
                "gomossagou",
                "mali",
                "mopti"
        );


        System.out.println(caderno.retornartodosdados());
        System.out.println(moussa.Retornartodosdados());
        System.out.println(sonia.retornartodosdados());



}
}
