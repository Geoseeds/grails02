package uk.geo

class LoginController {

	def beforeInterceptor = [action: this.&auth, except: 'signin']
	
	// defined with private scope, so it's not considered an action
	private auth() {
	    if (!session.user) {
	        redirect(action: 'signin')
	        return false
	    }
	}
	
	def signin() {
	    // display login page
	}
	
	def index(){}
}
