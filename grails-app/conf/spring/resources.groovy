import grails.rest.render.json.JsonRenderer

import org.inercy.Book

beans = {
	bookRenderer(JsonRenderer, Book){
		excludes = ["class"]
		
	}
}
