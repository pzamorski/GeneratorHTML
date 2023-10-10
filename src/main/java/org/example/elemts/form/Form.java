package org.example.elemts.form;

import org.example.elemts.MyElemet;

public class Form extends MyElemet {
    public Form(String action,TypeMethod typeMethod) {
        super("form");
        attr("action", action);
        attr("method", typeMethod.getCode());
    }

    public Form(String action,TypeMethod typeMethod,String allParameter) {
        super("form");
        addClass("form-"+allParameter);
        setId(allParameter);
        setName(allParameter);
        attr("action", action);
        attr("method", typeMethod.getCode());
    }

}
