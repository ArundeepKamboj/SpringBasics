package com.arundeep.cdi;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {
    public CdiDAO getCdidao() {
        return cdidao;
    }

    public void setCdidao(CdiDAO cdidao) {
        this.cdidao = cdidao;
    }

    @Inject
    CdiDAO cdidao;

}
