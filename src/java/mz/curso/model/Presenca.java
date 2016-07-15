/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.curso.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author bernardo
 */
public class Presenca {
    
    private final Date data;
    private final List<String> numero;

    public Presenca(Date data, List<String> numero) {
        this.data = data;
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public List<String> getNumero() {
        return numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Presenca other = (Presenca) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    
}
