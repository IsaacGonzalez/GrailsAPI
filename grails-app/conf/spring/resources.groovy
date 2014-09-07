import grails.rest.render.json.JsonRenderer

import org.inercy.Book

beans = {
	bookCollectionRenderer(JsonRenderer, Book){
		excludes = ["class"]
	}
	bookRenderer(JsonRenderer, Book){
		excludes = ["class"]		
	}
}
