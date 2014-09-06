import org.inercy.Book

class BootStrap {

    def init = { servletContext ->
		
		new Book(title: "Book 1").save()
		new Book(title: "Book 2").save()
		
    }
    def destroy = {
    }
}
