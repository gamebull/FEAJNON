package edu.uta.futureye.util.container;

import edu.uta.futureye.core.Element;

/**
 * Element List Class
 * 
 */
public class ElementList extends ObjList<Element>{
	@Override
	public String toString() {
		return "ElementList"+objs.toString();
	}
}
