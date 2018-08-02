package edu.uta.futureye.util.container;

import edu.uta.futureye.core.DOF;

/**
 * Degree Of Freedom Class
 *
 */
public class DOFList extends ObjList<DOF> {
	@Override
	public String toString() {
		return "DOFList"+objs.toString();
	}
}
