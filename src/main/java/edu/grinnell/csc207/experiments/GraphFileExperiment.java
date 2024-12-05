package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Graph;
import edu.grinnell.csc207.util.UndirectedGraph;

import java.io.PrintWriter;

/**
 * A quick experiment with reading graphs from files.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class GraphFileExperiment {

  /**
   * Run our experiment.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    // A small graph so that we can force it to expand.
    Graph g = new UndirectedGraph();
    g.readGraph(args[0]);
    g.dump(pen);
    g.dumpWithNames(pen);
    g.write(pen);
  } // main(String[])

} // class GraphFileExperiment
