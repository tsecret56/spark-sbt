package org.apache.spark.deploy;
/**
 * Parses and encapsulates arguments from the spark-submit script.
 * The env argument is used for testing.
 */
  class SparkSubmitArguments extends org.apache.spark.launcher.SparkSubmitArgumentsParser {
  public   SparkSubmitArguments (scala.collection.Seq<java.lang.String> args, scala.collection.immutable.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  public  java.lang.String master () { throw new RuntimeException(); }
  public  java.lang.String deployMode () { throw new RuntimeException(); }
  public  java.lang.String executorMemory () { throw new RuntimeException(); }
  public  java.lang.String executorCores () { throw new RuntimeException(); }
  public  java.lang.String totalExecutorCores () { throw new RuntimeException(); }
  public  java.lang.String propertiesFile () { throw new RuntimeException(); }
  public  java.lang.String driverMemory () { throw new RuntimeException(); }
  public  java.lang.String driverExtraClassPath () { throw new RuntimeException(); }
  public  java.lang.String driverExtraLibraryPath () { throw new RuntimeException(); }
  public  java.lang.String driverExtraJavaOptions () { throw new RuntimeException(); }
  public  java.lang.String queue () { throw new RuntimeException(); }
  public  java.lang.String numExecutors () { throw new RuntimeException(); }
  public  java.lang.String files () { throw new RuntimeException(); }
  public  java.lang.String archives () { throw new RuntimeException(); }
  public  java.lang.String mainClass () { throw new RuntimeException(); }
  public  java.lang.String primaryResource () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> childArgs () { throw new RuntimeException(); }
  public  java.lang.String jars () { throw new RuntimeException(); }
  public  java.lang.String packages () { throw new RuntimeException(); }
  public  java.lang.String repositories () { throw new RuntimeException(); }
  public  java.lang.String ivyRepoPath () { throw new RuntimeException(); }
  public  boolean verbose () { throw new RuntimeException(); }
  public  boolean isPython () { throw new RuntimeException(); }
  public  java.lang.String pyFiles () { throw new RuntimeException(); }
  public  boolean isR () { throw new RuntimeException(); }
  public  scala.Enumeration.Value action () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> sparkProperties () { throw new RuntimeException(); }
  public  java.lang.String proxyUser () { throw new RuntimeException(); }
  public  java.lang.String principal () { throw new RuntimeException(); }
  public  java.lang.String keytab () { throw new RuntimeException(); }
  public  boolean supervise () { throw new RuntimeException(); }
  public  java.lang.String driverCores () { throw new RuntimeException(); }
  public  java.lang.String submissionToKill () { throw new RuntimeException(); }
  public  java.lang.String submissionToRequestStatusFor () { throw new RuntimeException(); }
  public  boolean useRest () { throw new RuntimeException(); }
  /** Default properties present in the currently defined defaults file. */
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> defaultSparkProperties () { throw new RuntimeException(); }
  /**
   * Merge values from the default properties file with those specified through --conf.
   * When this is called, <code>sparkProperties</code> is already filled with configs from the latter.
   */
  private  void mergeDefaultSparkProperties () { throw new RuntimeException(); }
  /**
   * Remove keys that don't start with "spark." from <code>sparkProperties</code>.
   */
  private  void ignoreNonSparkProperties () { throw new RuntimeException(); }
  /**
   * Load arguments from environment variables, Spark properties etc.
   */
  private  void loadEnvironmentArguments () { throw new RuntimeException(); }
  /** Ensure that required fields exists. Call this only once all defaults are loaded. */
  private  void validateArguments () { throw new RuntimeException(); }
  private  void validateSubmitArguments () { throw new RuntimeException(); }
  private  void validateKillArguments () { throw new RuntimeException(); }
  private  void validateStatusRequestArguments () { throw new RuntimeException(); }
  public  boolean isStandaloneCluster () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /** Fill in values by parsing user options. */
  protected  boolean handle (java.lang.String opt, java.lang.String value) { throw new RuntimeException(); }
  // not preceding
  protected  boolean handleUnknown (java.lang.String opt) { throw new RuntimeException(); }
  protected  void handleExtraArgs (java.util.List<java.lang.String> extra) { throw new RuntimeException(); }
  private  void printUsageAndExit (int exitCode, Object unknownParam) { throw new RuntimeException(); }
}
