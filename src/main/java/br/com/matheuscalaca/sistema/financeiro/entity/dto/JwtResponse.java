package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    private final Date expiredToken;

    public JwtResponse(String jwttoken, Date expiredToken) {
        this.jwttoken = jwttoken;
        this.expiredToken = expiredToken;
    }

    public String getToken() {
        return this.jwttoken;
    }

    public Date getExpiredToken() {
        return expiredToken;
    }
}