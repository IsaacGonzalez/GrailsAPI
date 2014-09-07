package org.inercy

import grails.rest.RestfulController

class LoginApiController extends RestfulController{

	static allowedMethods = [login: "POST"]
	
	def index() {
		render "INDEX"
	}
	
    def login() {
		
		println "OK OK OK"
		
		render "OK"
	}
}
