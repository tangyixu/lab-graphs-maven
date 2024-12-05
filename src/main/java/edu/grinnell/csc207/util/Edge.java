package edu.grinnell.csc207.util;

/**
 * An edge in a simple weighted, directed graph.  See Graph.java for
 * some details of how they are used.
 *
 * @author Samuel A. Rebelsky
 */
public class Edge {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The start of the edge.
   */
  private int source;

  /**
   * The end of the edge.
   */
  private int target;

  /**
   * The weight of the edge.
   */
  private Integer weight;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new edge with a specified weight.
   *
   * @param from
   *   The source of the edge.
   * @param to
   *   The target of the edge.
   * @param weight
   *   The weight of the edge.
   */
  public Edge(int from, int to, Integer weight) {
    this.source= from;
    this.target = to;
    this.weight = weight;
  } // Edge(int, int, Integer)

  /**
   * Create a new, unweighted edge.
   *
   * @param from
   *   The source of the edge.
   * @param to
   *   The target of the edge
   */
  public Edge(int from, int to) {
    this(from, to, null);
  } // Edge

  // +------------------+--------------------------------------------
  // | Standard methods |
  // +------------------+

  /**
   * Convert the edge to a string.
   *
   * @return a simple representation of the edge.
   */
  public String toString() {
    if (this.weight == null) {
      return "<" + this.source + "," + this.target + ">";
    } else {
      return "<" + this.source + "," + this.target + "," + this.weight + ">";
    } // if/else
  } // toString

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if the edge has a weight.
   *
   * @return true if it has a weight and false otherwise.
   */
  public boolean hasWeight() {
    return this.weight != null;
  } // hasWeight()

  /**
   * Get the source of an edge.
   *
   * @return
   *   The source
   */
  public int source() {
    return this.source;
  } // source()

  /**
   * Get the target of an edge.
   *
   * @return
   *   The target
   */
  public int target() {
    return this.target;
  } // target()

  /**
   * Get the weight of the edge.  
   *
   * @return the weight of the edge. Returns 0 for an unweighted edge.
   *   (Also returns 0 for an edge with weight 0.)
   */
  public int weight() {
    if (this.weight == null) {
      return 0;
    } else {
      return this.weight;
    } // if/else
  } // weight()
} // class Edge
