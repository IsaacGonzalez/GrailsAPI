package org.inercy

import grails.rest.*

@Resource (uri="/books", formats=["json", "xml"])
class Book {

	String title
	
    static constraints = {
    }
}
