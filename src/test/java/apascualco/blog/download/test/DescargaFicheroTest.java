package apascualco.blog.download.test;

import apascualco.blog.download.DescargarFichero;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class DescargaFicheroTest {

    @Test
    public void descarga_imagen() throws IOException {
        String url = "http://tomcat.apache.org/images/tomcat.png";
        File file = new File(".");
        DescargarFichero descargarFichero = new DescargarFichero(url);
        File destino = new File(file.getCanonicalPath(), "imagen-descargada.png");
        Assert.assertFalse(destino.exists());
        descargarFichero.copiarFicheroEn(new File(file.getCanonicalPath(), "imagen-descargada.png"));
        Assert.assertTrue(destino.exists());
        Assert.assertTrue(destino.length() > 1);
        destino.delete();
        Assert.assertFalse(destino.exists());
    }

}
