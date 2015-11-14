package webserver;

	public enum RequestType {
	    COMMANDS("commands", "commands"),
	    RESSOURCES("ressources", "ressourcesAvailable"),
	    RESSOURCES_LOCAL("locales", "ressourcesAvailable"),
	    RESSOURCES_DISTANT("distantes", "ressourcesAvailable"),
	    RESSOURCES_DOSSIER("fichiers", "ressourcesAvailabledossier"),
	    RESSOURCES_FICHIER("dossiers", "ressourcesAvailablefichier")
	    ;

	    private final String text;
	    private final String modeleName;

	    private RequestType(final String text, final String modeleName) {
	        this.text = text;
	        this.modeleName = modeleName;
	    }

	    @Override
	    public String toString() {
	        return text;
	    }
	    
	    public String getModeleName() {
	    	return modeleName;
	    }
	    
	    public static RequestType fromString(String text) {
	        if (text != null) {
	          for (RequestType b : RequestType.values()) {
	            if (text.equalsIgnoreCase(b.text)) {
	              return b;
	            }
	          }
	        }
	        return null;
	      }

	}
