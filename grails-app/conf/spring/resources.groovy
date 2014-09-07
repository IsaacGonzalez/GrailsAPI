import grails.rest.render.json.JsonRenderer

beans = {
	bookRenderer(JsonRenderer, book){
		excludes = ["class"]
		
	}
}
