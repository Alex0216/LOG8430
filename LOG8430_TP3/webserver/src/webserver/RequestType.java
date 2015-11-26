package webserver;
/**
 * Enum for the requests types localhost:XXXX/ressources/ etc..
 */
	public enum RequestType {
	    COMMANDS("commands", "commands"),
	    RESSOURCES("ressources", "ressourcesAvailable"),
	    RESSOURCES_LOCAL("locales", "ressourcesAvailable"),
	    RESSOURCES_DISTANT("distantes", "ressourcesAvailable"),
	    RESSOURCES_DOSSIER("dossiers", "ressourcesAvailable"),
	    RESSOURCES_FICHIER("fichiers", "ressourcesAvailable")
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
