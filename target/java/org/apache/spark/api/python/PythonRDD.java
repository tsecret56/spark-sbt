package org.apache.spark.api.python;
  class PythonRDD extends org.apache.spark.rdd.RDD<byte[]> {
  /**
   * The thread responsible for writing the data from the PythonRDD's parent iterator to the
   * Python process.
   */
  public  class WriterThread extends java.lang.Thread {
    public   WriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, org.apache.spark.Partition split, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
    private  java.lang.Exception _exception () { throw new RuntimeException(); }
    /** Contains the exception thrown while writing the parent iterator to the Python process. */
    public  scala.Option<java.lang.Exception> exception () { throw new RuntimeException(); }
    /** Terminates the writer thread, ignoring any exceptions that may occur due to cleanup. */
    public  void shutdownOnTaskCompletion () { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
  /**
   * It is necessary to have a monitor thread for python workers if the user cancels with
   * interrupts disabled. In that case we will need to explicitly kill the worker, otherwise the
   * threads can block indefinitely.
   */
  public  class MonitorThread extends java.lang.Thread {
    public   MonitorThread (org.apache.spark.SparkEnv env, java.net.Socket worker, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
  static private  scala.collection.mutable.WeakHashMap<java.net.Socket, scala.collection.mutable.Set<java.lang.Object>> workerBroadcasts () { throw new RuntimeException(); }
  static private  scala.collection.mutable.Set<java.lang.Object> getWorkerBroadcasts (java.net.Socket worker) { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<byte[]> valueOfPair (org.apache.spark.api.java.JavaPairRDD<java.lang.Object, byte[]> pair) { throw new RuntimeException(); }
  static public  int runJob (org.apache.spark.SparkContext sc, org.apache.spark.api.java.JavaRDD<byte[]> rdd, java.util.ArrayList<java.lang.Object> partitions, boolean allowLocal) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> int collectAndServe (org.apache.spark.rdd.RDD<T> rdd) { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String filename, int parallelism) { throw new RuntimeException(); }
  static public  org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast> readBroadcastFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> void writeIteratorToStream (scala.collection.Iterator<T> iter, java.io.DataOutputStream dataOut) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.api.java.JavaRDD<T> emptyRDD (org.apache.spark.api.java.JavaSparkContext sc) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaRDD<byte[]> sequenceFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String keyClassMaybeNull, java.lang.String valueClassMaybeNull, java.lang.String keyConverterClass, java.lang.String valueConverterClass, int minSplits, int batchSize) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> newAPIHadoopRDDFromClassNames (org.apache.spark.api.java.JavaSparkContext sc, scala.Option<java.lang.String> path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> hadoopRDDFromClassNames (org.apache.spark.api.java.JavaSparkContext sc, scala.Option<java.lang.String> path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  static public  void writeUTF (java.lang.String str, java.io.DataOutputStream dataOut) { throw new RuntimeException(); }
  static private <T extends java.lang.Object> int serveIterator (scala.collection.Iterator<T> items, java.lang.String threadName) { throw new RuntimeException(); }
  static private  org.apache.hadoop.conf.Configuration getMergedConf (java.util.HashMap<java.lang.String, java.lang.String> confAsMap, org.apache.hadoop.conf.Configuration baseConf) { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object> scala.Tuple2<java.lang.Class<?>, java.lang.Class<?>> inferKeyValueTypes (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, java.lang.String keyConverterClass, java.lang.String valueConverterClass) { throw new RuntimeException(); }
  static private  scala.Option<scala.Tuple2<java.lang.Class<?>, java.lang.Class<?>>> getKeyValueTypes (java.lang.String keyClass, java.lang.String valueClass) { throw new RuntimeException(); }
  static private  scala.Tuple2<org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object>, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object>> getKeyValueConverters (java.lang.String keyConverterClass, java.lang.String valueConverterClass, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> defaultConverter) { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> convertRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, java.lang.String keyConverterClass, java.lang.String valueConverterClass, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> defaultConverter) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsSequenceFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String compressionCodecClass) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.OutputFormat<?, ?>, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String compressionCodecClass) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap) { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> void saveAsHadoopDataset (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String keyConverterClass, java.lang.String valueConverterClass, boolean useNewAPI) { throw new RuntimeException(); }
  public   PythonRDD (org.apache.spark.rdd.RDD<?> parent, byte[] command, java.util.Map<java.lang.String, java.lang.String> envVars, java.util.List<java.lang.String> pythonIncludes, boolean preservePartitoning, java.lang.String pythonExec, java.lang.String pythonVer, java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars, org.apache.spark.Accumulator<java.util.List<byte[]>> accumulator) { throw new RuntimeException(); }
  public  int bufferSize () { throw new RuntimeException(); }
  public  boolean reuse_worker () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner () { throw new RuntimeException(); }
  public  scala.collection.Iterator<byte[]> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> asJavaRDD () { throw new RuntimeException(); }
}
