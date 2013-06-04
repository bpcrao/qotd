package qotd

class QuoteController {

    def scaffold = true

    def quoteService
    def index() { redirect(action: home)}

    def home = {
        render "<h1>programming is 99% coffee and 1% code</h1>"
    }

    def random = {
        def randomQuote = quoteService.getRandomQuote()
        [ quote : randomQuote]
    }


    def ajaxRandom = {
        def randomQuote = quoteService.getRandomQuote()
        render "<q>${randomQuote.content}</q>" +
                "<p>${randomQuote.author}</p>"
    }
}
