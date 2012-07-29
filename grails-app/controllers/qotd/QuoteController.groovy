package qotd

class QuoteController {

    def index = { 
    	redirect(action: home) /* Redirect della pagina index all'azione home */
    }
    
    def home = {
    	render "<h1>Real programmers do not eat Quiche</h1>"
    }
}
