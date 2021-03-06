package edu.uta.futureye.core.geometry;

import edu.uta.futureye.core.Vertex;
import edu.uta.futureye.core.geometry.topology.Topology2D;
import edu.uta.futureye.util.container.ObjList;
import edu.uta.futureye.util.container.VertexList;

/**
 * 二维几何实体，保存有限元Element的几何信息
 * 
 *   父类的vertices：二维单元的顶点集合（e.g.三角形单元：三个顶点，四边形单元：四个顶点，...）
 *   edges：二维单元的边集合
 *   faceNodes：二维单元内部的结点集合
 *
 */
public class GeoEntity2D<
						TEdge extends GeoEntity1D<TNode>,
						TNode extends Point
						> extends GeoEntity0D {
	protected Topology2D topology = null;
	protected ObjList<TEdge> edges = new ObjList<TEdge>();
	protected ObjList<TNode> faceNodes = null;
	
	public void addEdge(TEdge edge) {
		this.edges.add(edge);
	}
	
	public void addAllEdges(ObjList<TEdge> edges) {
		this.edges.clear();
		this.edges.addAll(edges);
	}
	
	public ObjList<TEdge> getEdges() {
		return this.edges;
	}
	
	public void clearEdges() {
		this.edges.clear();
	}
	
	public boolean containsEdge(TNode n1, TNode n2) {
		for(TEdge edge : edges) {
			VertexList vs = edge.getVertices();
			Vertex v1 = vs.at(1);
			Vertex v2 = vs.at(2);
			if(v1.coordEquals(n1) && v2.coordEquals(n2))
				return true;
		}
		return false;
	}
	
	public void addFaceNode(TNode node) {
		if(this.faceNodes == null)
			this.faceNodes = new ObjList<TNode>();
		this.faceNodes.add(node);
	}
	
	public void addAllFaceNodes(ObjList<TNode> faceNodes) {
		if(this.faceNodes == null)
			this.faceNodes = new ObjList<TNode>();
		this.faceNodes.clear();
		this.faceNodes.addAll(faceNodes);
	}
	
	public ObjList<TNode> getFaceNodes() {
		return this.faceNodes;
	}
	
	public void clearFaceNodes() {
		if(this.faceNodes != null)
			this.faceNodes.clear();
	}
	
	public void clearAll() {
		this.edges.clear();
		if(this.faceNodes != null)
			this.faceNodes.clear();
	}
	
	public Topology2D getTopology() {
		return topology;
	}
	
	public void setTopology(Topology2D topology) {
		this.topology = topology;
	}
	
	public String toString() {
		return "GeoEntity2D:"+this.vertices.toString();
	}
}
