package qotd

class QuoteController {

    def index = { 
    	redirect(action: home) /* Redirect della pagina index all'azione home */
    }
    
    def home = {
    	render "<h1>Real programmers do not eat Quiche</h1>"
    }
    
    def random= {
    	def staticAuthor = "Anonymous"
    	def staticContent = "Real programmers do not eat Quiche"
    	[author: staticAuthor, content: staticContent] /* Mappa per il passaggio dei parametri alla vista gsp */
	}
}
