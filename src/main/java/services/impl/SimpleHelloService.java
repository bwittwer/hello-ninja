/**
 * 
 */
package services.impl;

import services.HelloService;

/**
 * @author bwittwer
 *
 */
public class SimpleHelloService implements HelloService {

	/**
	 * 
	 */
	public SimpleHelloService() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see services.HelloService#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String who) {		
		return "Hello " + who + " !";
	}

}
