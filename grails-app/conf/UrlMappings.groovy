class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/books"(resources: "book")
		"/login"(resources: "loginApi")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
