package uk.geo

import sun.java2d.Spans.Span;

class HiiController {

	static defaultAction = "index2";
	
    def index() { }
	
	def index2() { 
		render(view:"index",model:[  //view:"/shared/display"
			renderitall: true,
			attr1: "I'm here, index2!",
			attr2: [1,2,3,4,5],
			attr3: params.qstr
			])
	}
	
	def markup() {
		// write some markup
		/*
		render {
		   for (b in [1: "abc", 2: "def"]) {
			  div(id: b.key, b.value)
			  span(id: b.key, b.value)
		   }
		}
		*/
		
		chain (action: "index", model:[
			divrendered:{ 
				for (b in [1: "abc", 2: "def"]) {
				  div(id: b.key, b.value)
				  span(id: b.key, b.value)
			   }
			}
			])
		
	}
}
