package edu.uta.futureye.util.container;

import edu.uta.futureye.core.Vertex;

/**
 * Vertex List Class
 *
 */
public class VertexList extends ObjList<Vertex> {
	@Override
	public String toString() {
		return "VertexList"+objs.toString();
	}
	
}
