/**
 * Last generated by Orchestration Designer at: 20 DE FEVEREIRO DE 2023 16H24MIN40S BRT
 */
package portugues.prompts;

public class an_saudacoes extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for an_saudacoes.
	 */
	public an_saudacoes() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 20 DE MARÇO DE 2023 14H58MIN5S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("an_saudacoes");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		if ( new com.avaya.sce.runtime.Condition( "condition", "time:hour", com.avaya.sce.runtime.Expression.INT_LESS_THAN, "12", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"untitled:001",false));
		}

		else if ( new com.avaya.sce.runtime.Condition( "condition", "time:hour", com.avaya.sce.runtime.Expression.INT_LESS_THAN, "18", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"untitled:002",false));
		}

		else {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"untitled:003",false));
		}

	}
}
