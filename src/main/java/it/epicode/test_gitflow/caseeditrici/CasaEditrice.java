package it.epicode.test_gitflow.caseeditrici;

import jdk.jfr.Enabled;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
public class CasaEditrice {
    private String nome;
    private String indirizzo;
    private String telefono;
}
