package apascualco.blog.download;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DescargarFichero {

    private URL fileURL;

    public DescargarFichero(String url) throws MalformedURLException, FileNotFoundException {
        if(url == null || url.isEmpty()) {
            throw new FileNotFoundException("No se ha encontrado la url");
        }
        this.fileURL = new URL(url);
    }

    public void copiarFicheroEn(File file) throws IOException {
        FileUtils.copyURLToFile(fileURL, file);
    }

    public void copiarFicheroEn(String destino) throws IOException {
        FileUtils.copyURLToFile(fileURL, new File(destino));
    }
}
