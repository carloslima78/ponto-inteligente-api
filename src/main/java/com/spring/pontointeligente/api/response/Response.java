package com.spring.pontointeligente.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

    private T data;
    private List<String> errors;

    private Response(){

    }

    /***
     * Recebe o objeto preenchido em memória
     * @return
     */
    private T getData(){
        return data;
    }

    /***
     * Recupera o objeto preenchido
     * @param data
     */
    private void setData(T data){
        this.data = data;
    }

    /***
     * Recupera a lista contendo os erros
     * @return
     */
    private List<String> getErrors(){
        if(this.errors == null){
            this.errors = new ArrayList<String>();
        }
        return errors;
    }

    /***
     * Recebe a lista preenchida com os erros
     * @param errors
     */
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
