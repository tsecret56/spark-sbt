package org.apache.spark.ui;
// no position
/** Utility functions for generating XML pages with spark content. */
  class UIUtils implements org.apache.spark.Logging {
  static public  java.lang.String TABLE_CLASS_NOT_STRIPED () { throw new RuntimeException(); }
  static public  java.lang.String TABLE_CLASS_STRIPED () { throw new RuntimeException(); }
  static private  java.lang.ThreadLocal<java.text.SimpleDateFormat> dateFormat () { throw new RuntimeException(); }
  static public  java.lang.String formatDate (java.util.Date date) { throw new RuntimeException(); }
  static public  java.lang.String formatDate (long timestamp) { throw new RuntimeException(); }
  static public  java.lang.String formatDuration (long milliseconds) { throw new RuntimeException(); }
  /** Generate a verbose human-readable string representing a duration such as "5 second 35 ms" */
  static public  java.lang.String formatDurationVerbose (long ms) { throw new RuntimeException(); }
  /** Generate a human-readable string representing a number (e.g. 100 K) */
  static public  java.lang.String formatNumber (double records) { throw new RuntimeException(); }
  static public  java.lang.String uiRoot () { throw new RuntimeException(); }
  static public  java.lang.String prependBaseUri (java.lang.String basePath, java.lang.String resource) { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> commonHeaderNodes () { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> vizHeaderNodes () { throw new RuntimeException(); }
  /** Returns a spark page with correctly formatted headers */
  static public  scala.collection.Seq<scala.xml.Node> headerSparkPage (java.lang.String title, scala.Function0<scala.collection.Seq<scala.xml.Node>> content, org.apache.spark.ui.SparkUITab activeTab, scala.Option<java.lang.Object> refreshInterval, scala.Option<java.lang.String> helpText, boolean showVisualization) { throw new RuntimeException(); }
  /** Returns a page with the spark css/js and a simple format. Used for scheduler UI. */
  static public  scala.collection.Seq<scala.xml.Node> basicSparkPage (scala.Function0<scala.collection.Seq<scala.xml.Node>> content, java.lang.String title) { throw new RuntimeException(); }
  /** Returns an HTML table constructed by generating a row for each object in a sequence. */
  static public <T extends java.lang.Object> scala.collection.Seq<scala.xml.Node> listingTable (scala.collection.Seq<java.lang.String> headers, scala.Function1<T, scala.collection.Seq<scala.xml.Node>> generateDataRow, scala.collection.Iterable<T> data, boolean fixedWidth, scala.Option<java.lang.String> id, scala.collection.Seq<java.lang.String> headerClasses, boolean stripeRowsWithCss) { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> makeProgressBar (int started, int completed, int failed, int skipped, int total) { throw new RuntimeException(); }
  /** Return a "DAG visualization" DOM element that expands into a visualization for a stage. */
  static public  scala.collection.Seq<scala.xml.Node> showDagVizForStage (int stageId, scala.Option<org.apache.spark.ui.scope.RDDOperationGraph> graph) { throw new RuntimeException(); }
  /** Return a "DAG visualization" DOM element that expands into a visualization for a job. */
  static public  scala.collection.Seq<scala.xml.Node> showDagVizForJob (int jobId, scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> graphs) { throw new RuntimeException(); }
  /**
   * Return a "DAG visualization" DOM element that expands into a visualization on the UI.
   * <p>
   * This populates metadata necessary for generating the visualization on the front-end in
   * a format that is expected by spark-dag-viz.js. Any changes in the format here must be
   * reflected there.
   * @param graphs (undocumented)
   * @param forJob (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Seq<scala.xml.Node> showDagViz (scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> graphs, boolean forJob) { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> tooltip (java.lang.String text, java.lang.String position) { throw new RuntimeException(); }
  /** Return a script element that automatically expands the DAG visualization on page load. */
  static public  scala.collection.Seq<scala.xml.Node> expandDagVizOnLoad (boolean forJob) { throw new RuntimeException(); }
}
