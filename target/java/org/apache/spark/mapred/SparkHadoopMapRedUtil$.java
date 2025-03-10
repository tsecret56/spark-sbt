package org.apache.spark.mapred;
// no position
public  class SparkHadoopMapRedUtil$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkHadoopMapRedUtil$ MODULE$ = null;
  public   SparkHadoopMapRedUtil$ () { throw new RuntimeException(); }
  /**
   * Commits a task output.  Before committing the task output, we need to know whether some other
   * task attempt might be racing to commit the same output partition. Therefore, coordinate with
   * the driver in order to determine whether this attempt can commit (please see SPARK-4879 for
   * details).
   * <p>
   * Output commit coordinator is only contacted when the following two configurations are both set
   * to <code>true</code>:
   * <p>
   *  - <code>spark.speculation</code>
   *  - <code>spark.hadoop.outputCommitCoordination.enabled</code>
   * @param committer (undocumented)
   * @param mrTaskContext (undocumented)
   * @param jobId (undocumented)
   * @param splitId (undocumented)
   * @param attemptId (undocumented)
   */
  public  void commitTask (org.apache.hadoop.mapreduce.OutputCommitter committer, org.apache.hadoop.mapreduce.TaskAttemptContext mrTaskContext, int jobId, int splitId, int attemptId) { throw new RuntimeException(); }
  public  void commitTask (org.apache.hadoop.mapreduce.OutputCommitter committer, org.apache.hadoop.mapreduce.TaskAttemptContext mrTaskContext, org.apache.spark.TaskContext sparkTaskContext) { throw new RuntimeException(); }
}
