package qotd



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
class QuoteServiceTests {
    def quoteService
    void testGetStaticQuote() {
        def staticQuote = quoteService.getStaticQuote()
        assertEquals("Anonymous", staticQuote.author)
        assertEquals("Real Programmers Don't eat Quiche", staticQuote.content)
    }
}
