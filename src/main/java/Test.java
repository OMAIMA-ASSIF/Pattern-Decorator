import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;
import decorateur.Caramel;
import decorateur.Chocolat;
import decorateur.Noisette;

import java.io.BufferedOutputStream;
import java.io.FilterWriter;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public class Test {
    public static void main(String[] args){

        Boisson b;
        b = new Chocolat(new Caramel(new Chocolat(new Caramel(new Noisette(new Sumatra())))));

        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}
