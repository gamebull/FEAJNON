package edu.uta.futureye.util.container;

import edu.uta.futureye.core.Edge;

/**
 * Edge List Class
 *
 */
public class EdgeList extends ObjList<Edge> {
	@Override
	public String toString() {
		return "EdgeList"+objs.toString();
	}
}

