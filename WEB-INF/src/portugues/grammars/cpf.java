package portugues.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 20 DE FEVEREIRO DE 2023 20H7MIN34S BRT
 */
public class cpf extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for cpf.
    */
    public cpf() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("pt-br");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("length=11");
		//}}END:CLASS:CONSTRUCTOR
    }

}

