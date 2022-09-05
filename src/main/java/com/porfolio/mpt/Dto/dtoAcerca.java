
package com.porfolio.mpt.Dto;

import javax.validation.constraints.NotBlank;


public class dtoAcerca {
    @NotBlank
    private String info;

    public dtoAcerca() {
    }

    public dtoAcerca(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
    
}
