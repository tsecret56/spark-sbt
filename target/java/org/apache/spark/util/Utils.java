package org.apache.spark.util;
// no position
/**
 * Various utility methods used by Spark.
 */
  class Utils implements org.apache.spark.Logging {
  static public  java.util.Random random () { throw new RuntimeException(); }
  static public  int DEFAULT_SHUTDOWN_PRIORITY () { throw new RuntimeException(); }
  /**
   * The shutdown priority of the SparkContext instance. This is lower than the default
   * priority, so that by default hooks are run before the context is shut down.
   * @return (undocumented)
   */
  static public  int SPARK_CONTEXT_SHUTDOWN_PRIORITY () { throw new RuntimeException(); }
  /**
   * The shutdown priority of temp directory must be lower than the SparkContext shutdown
   * priority. Otherwise cleaning the temp directories while Spark jobs are running can
   * throw undesirable errors at the time of shutdown.
   * @return (undocumented)
   */
  static public  int TEMP_DIR_SHUTDOWN_PRIORITY () { throw new RuntimeException(); }
  static private  int MAX_DIR_CREATION_ATTEMPTS () { throw new RuntimeException(); }
  static private  java.lang.String[] localRootDirs () { throw new RuntimeException(); }
  static private  org.apache.spark.util.SparkShutdownHookManager shutdownHooks () { throw new RuntimeException(); }
  /** Serialize an object using Java serialization */
  static public <T extends java.lang.Object> byte[] serialize (T o) { throw new RuntimeException(); }
  /** Deserialize an object using Java serialization */
  static public <T extends java.lang.Object> T deserialize (byte[] bytes) { throw new RuntimeException(); }
  /** Deserialize an object using Java serialization and the given ClassLoader */
  static public <T extends java.lang.Object> T deserialize (byte[] bytes, java.lang.ClassLoader loader) { throw new RuntimeException(); }
  /** Deserialize a Long value (used for {@link org.apache.spark.api.python.PythonPartitioner}) */
  static public  long deserializeLongValue (byte[] bytes) { throw new RuntimeException(); }
  /** Serialize via nested stream using specific serializer */
  static public  void serializeViaNestedStream (java.io.OutputStream os, org.apache.spark.serializer.SerializerInstance ser, scala.Function1<org.apache.spark.serializer.SerializationStream, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /** Deserialize via nested stream using specific serializer */
  static public  void deserializeViaNestedStream (java.io.InputStream is, org.apache.spark.serializer.SerializerInstance ser, scala.Function1<org.apache.spark.serializer.DeserializationStream, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /**
   * Get the ClassLoader which loaded Spark.
   * @return (undocumented)
   */
  static public  java.lang.ClassLoader getSparkClassLoader () { throw new RuntimeException(); }
  /**
   * Get the Context ClassLoader on this thread or, if not present, the ClassLoader that
   * loaded Spark.
   * <p>
   * This should be used whenever passing a ClassLoader to Class.ForName or finding the currently
   * active loader when setting up ClassLoader delegation chains.
   * @return (undocumented)
   */
  static public  java.lang.ClassLoader getContextOrSparkClassLoader () { throw new RuntimeException(); }
  /** Determines whether the provided class is loadable in the current thread. */
  static public  boolean classIsLoadable (java.lang.String clazz) { throw new RuntimeException(); }
  /** Preferred alternative to Class.forName(className) */
  static public  java.lang.Class<?> classForName (java.lang.String className) { throw new RuntimeException(); }
  /**
   * Primitive often used when writing {@link java.nio.ByteBuffer} to {@link java.io.DataOutput}
   * @param bb (undocumented)
   * @param out (undocumented)
   */
  static public  void writeByteBuffer (java.nio.ByteBuffer bb, java.io.ObjectOutput out) { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashSet<java.lang.String> shutdownDeletePaths () { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashSet<java.lang.String> shutdownDeleteTachyonPaths () { throw new RuntimeException(); }
  static public  void registerShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  void registerShutdownDeleteDir (tachyon.client.TachyonFile tachyonfile) { throw new RuntimeException(); }
  static public  boolean hasShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  boolean hasShutdownDeleteTachyonDir (tachyon.client.TachyonFile file) { throw new RuntimeException(); }
  static public  boolean hasRootAsShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  boolean hasRootAsShutdownDeleteDir (tachyon.client.TachyonFile file) { throw new RuntimeException(); }
  /**
   * JDK equivalent of <code>chmod 700 file</code>.
   * <p>
   * @param file the file whose permissions will be modified
   * @return true if the permissions were successfully changed, false otherwise.
   */
  static public  boolean chmod700 (java.io.File file) { throw new RuntimeException(); }
  /**
   * Create a directory inside the given parent directory. The directory is guaranteed to be
   * newly created, and is not marked for automatic deletion.
   * @param root (undocumented)
   * @param namePrefix (undocumented)
   * @return (undocumented)
   */
  static public  java.io.File createDirectory (java.lang.String root, java.lang.String namePrefix) { throw new RuntimeException(); }
  /**
   * Create a temporary directory inside the given parent directory. The directory will be
   * automatically deleted when the VM shuts down.
   * @param root (undocumented)
   * @param namePrefix (undocumented)
   * @return (undocumented)
   */
  static public  java.io.File createTempDir (java.lang.String root, java.lang.String namePrefix) { throw new RuntimeException(); }
  /** Copy all data from an InputStream to an OutputStream. NIO way of file stream to file stream
   * copying is disabled by default unless explicitly set transferToEnabled as true,
   * the parameter transferToEnabled should be configured by spark.file.transferTo = [true|false].
   * @param in (undocumented)
   * @param out (undocumented)
   * @param closeStreams (undocumented)
   * @param transferToEnabled (undocumented)
   * @return (undocumented)
   */
  static public  long copyStream (java.io.InputStream in, java.io.OutputStream out, boolean closeStreams, boolean transferToEnabled) { throw new RuntimeException(); }
  /**
   * Construct a URI container information used for authentication.
   * This also sets the default authenticator to properly negotiation the
   * user/password based on the URI.
   * <p>
   * Note this relies on the Authenticator.setDefault being set properly to decode
   * the user name and password. This is currently set in the SecurityManager.
   * @param uri (undocumented)
   * @param securityMgr (undocumented)
   * @return (undocumented)
   */
  static public  java.net.URI constructURIForAuthentication (java.net.URI uri, org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  /**
   * Download a file or directory to target directory. Supports fetching the file in a variety of
   * ways, including HTTP, Hadoop-compatible filesystems, and files on a standard filesystem, based
   * on the URL parameter. Fetching directories is only supported from Hadoop-compatible
   * filesystems.
   * <p>
   * If <code>useCache</code> is true, first attempts to fetch the file to a local cache that's shared
   * across executors running the same application. <code>useCache</code> is used mainly for
   * the executors, and not in local mode.
   * <p>
   * Throws SparkException if the target file already exists and has different contents than
   * the requested file.
   * @param url (undocumented)
   * @param targetDir (undocumented)
   * @param conf (undocumented)
   * @param securityMgr (undocumented)
   * @param hadoopConf (undocumented)
   * @param timestamp (undocumented)
   * @param useCache (undocumented)
   */
  static public  void fetchFile (java.lang.String url, java.io.File targetDir, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr, org.apache.hadoop.conf.Configuration hadoopConf, long timestamp, boolean useCache) { throw new RuntimeException(); }
  /**
   * Download <code>in</code> to <code>tempFile</code>, then move it to <code>destFile</code>.
   * <p>
   * If <code>destFile</code> already exists:
   *   - no-op if its contents equal those of <code>sourceFile</code>,
   *   - throw an exception if <code>fileOverwrite</code> is false,
   *   - attempt to overwrite it otherwise.
   * <p>
   * @param url URL that <code>sourceFile</code> originated from, for logging purposes.
   * @param in InputStream to download.
   * @param destFile File path to move <code>tempFile</code> to.
   * @param fileOverwrite Whether to delete/overwrite an existing <code>destFile</code> that does not match
   *                      <code>sourceFile</code>
   */
  static private  void downloadFile (java.lang.String url, java.io.InputStream in, java.io.File destFile, boolean fileOverwrite) { throw new RuntimeException(); }
  /**
   * Copy <code>sourceFile</code> to <code>destFile</code>.
   * <p>
   * If <code>destFile</code> already exists:
   *   - no-op if its contents equal those of <code>sourceFile</code>,
   *   - throw an exception if <code>fileOverwrite</code> is false,
   *   - attempt to overwrite it otherwise.
   * <p>
   * @param url URL that <code>sourceFile</code> originated from, for logging purposes.
   * @param sourceFile File path to copy/move from.
   * @param destFile File path to copy/move to.
   * @param fileOverwrite Whether to delete/overwrite an existing <code>destFile</code> that does not match
   *                      <code>sourceFile</code>
   * @param removeSourceFile Whether to remove <code>sourceFile</code> after / as part of moving/copying it to
   *                         <code>destFile</code>.
   */
  static private  void copyFile (java.lang.String url, java.io.File sourceFile, java.io.File destFile, boolean fileOverwrite, boolean removeSourceFile) { throw new RuntimeException(); }
  static private  boolean filesEqualRecursive (java.io.File file1, java.io.File file2) { throw new RuntimeException(); }
  static private  void copyRecursive (java.io.File source, java.io.File dest) { throw new RuntimeException(); }
  /**
   * Download a file or directory to target directory. Supports fetching the file in a variety of
   * ways, including HTTP, Hadoop-compatible filesystems, and files on a standard filesystem, based
   * on the URL parameter. Fetching directories is only supported from Hadoop-compatible
   * filesystems.
   * <p>
   * Throws SparkException if the target file already exists and has different contents than
   * the requested file.
   * @param url (undocumented)
   * @param targetDir (undocumented)
   * @param filename (undocumented)
   * @param conf (undocumented)
   * @param securityMgr (undocumented)
   * @param hadoopConf (undocumented)
   */
  static private  void doFetchFile (java.lang.String url, java.io.File targetDir, java.lang.String filename, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  /**
   * Fetch a file or directory from a Hadoop-compatible filesystem.
   * <p>
   * Visible for testing
   * @param path (undocumented)
   * @param targetDir (undocumented)
   * @param fs (undocumented)
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param fileOverwrite (undocumented)
   * @param filename (undocumented)
   */
  static   void fetchHcfsFile (org.apache.hadoop.fs.Path path, java.io.File targetDir, org.apache.hadoop.fs.FileSystem fs, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, boolean fileOverwrite, scala.Option<java.lang.String> filename) { throw new RuntimeException(); }
  /**
   * Get the path of a temporary directory.  Spark's local directories can be configured through
   * multiple settings, which are used with the following precedence:
   * <p>
   *   - If called from inside of a YARN container, this will return a directory chosen by YARN.
   *   - If the SPARK_LOCAL_DIRS environment variable is set, this will return a directory from it.
   *   - Otherwise, if the spark.local.dir is set, this will return a directory from it.
   *   - Otherwise, this will return java.io.tmpdir.
   * <p>
   * Some of these configuration options might be lists of multiple paths, but this method will
   * always return a single directory.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getLocalDir (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static   boolean isRunningInYarnContainer (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Gets or creates the directories listed in spark.local.dir or SPARK_LOCAL_DIRS,
   * and returns only the directories that exist / could be created.
   * <p>
   * If no directories could be created, this will return an empty list.
   * <p>
   * This method will cache the local directories for the application when it's first invoked.
   * So calling it multiple times with a different configuration will always return the same
   * set of directories.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static   java.lang.String[] getOrCreateLocalRootDirs (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static private  java.lang.String[] getOrCreateLocalRootDirsImpl (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /** Get the Yarn approved local directories. */
  static private  java.lang.String getYarnLocalDirs (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /** Used by unit tests. Do not call from other places. */
  static   void clearLocalRootDirs () { throw new RuntimeException(); }
  /**
   * Shuffle the elements of a collection into a random order, returning the
   * result in a new collection. Unlike scala.util.Random.shuffle, this method
   * uses a local random number generator, avoiding inter-thread contention.
   * @param seq (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Seq<T> randomize (scala.collection.TraversableOnce<T> seq, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Shuffle the elements of an array into a random order, modifying the
   * original array. Returns the original array.
   * @param arr (undocumented)
   * @param rand (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> java.lang.Object randomizeInPlace (java.lang.Object arr, java.util.Random rand) { throw new RuntimeException(); }
  /**
   * Get the local host's IP address in dotted-quad format (e.g. 1.2.3.4).
   * Note, this is typically not used from within core spark.
   * @return (undocumented)
   */
  static private  java.net.InetAddress localIpAddress () { throw new RuntimeException(); }
  static private  java.net.InetAddress findLocalInetAddress () { throw new RuntimeException(); }
  static private  scala.Option<java.lang.String> customHostname () { throw new RuntimeException(); }
  /**
   * Allow setting a custom host name because when we run on Mesos we need to use the same
   * hostname it reports to the master.
   * @param hostname (undocumented)
   */
  static public  void setCustomHostname (java.lang.String hostname) { throw new RuntimeException(); }
  /**
   * Get the local machine's hostname.
   * @return (undocumented)
   */
  static public  java.lang.String localHostName () { throw new RuntimeException(); }
  /**
   * Get the local machine's URI.
   * @return (undocumented)
   */
  static public  java.lang.String localHostNameForURI () { throw new RuntimeException(); }
  static public  void checkHost (java.lang.String host, java.lang.String message) { throw new RuntimeException(); }
  static public  void checkHostPort (java.lang.String hostPort, java.lang.String message) { throw new RuntimeException(); }
  static private  java.util.concurrent.ConcurrentHashMap<java.lang.String, scala.Tuple2<java.lang.String, java.lang.Object>> hostPortParseResults () { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.String, java.lang.Object> parseHostPort (java.lang.String hostPort) { throw new RuntimeException(); }
  /**
   * Return the string to tell how long has passed in milliseconds.
   * @param startTimeMs (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getUsedTimeMs (long startTimeMs) { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.io.File> listFilesSafely (java.io.File file) { throw new RuntimeException(); }
  /**
   * Delete a file or directory and its contents recursively.
   * Don't follow directories if they are symlinks.
   * Throws an exception if deletion is unsuccessful.
   * @param file (undocumented)
   */
  static public  void deleteRecursively (java.io.File file) { throw new RuntimeException(); }
  /**
   * Delete a file or directory and its contents recursively.
   * @param dir (undocumented)
   * @param client (undocumented)
   */
  static public  void deleteRecursively (tachyon.client.TachyonFile dir, tachyon.client.TachyonFS client) { throw new RuntimeException(); }
  /**
   * Check to see if file is a symbolic link.
   * @param file (undocumented)
   * @return (undocumented)
   */
  static public  boolean isSymlink (java.io.File file) { throw new RuntimeException(); }
  /**
   * Determines if a directory contains any files newer than cutoff seconds.
   * <p>
   * @param dir must be the path to a directory, or IllegalArgumentException is thrown
   * @param cutoff measured in seconds. Returns true if there are any files or directories in the
   *               given directory whose last modified time is later than this many seconds ago
   * @return (undocumented)
   */
  static public  boolean doesDirectoryContainAnyNewFiles (java.io.File dir, long cutoff) { throw new RuntimeException(); }
  /**
   * Convert a time parameter such as (50s, 100ms, or 250us) to microseconds for internal use. If
   * no suffix is provided, the passed number is assumed to be in ms.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  long timeStringAsMs (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a time parameter such as (50s, 100ms, or 250us) to microseconds for internal use. If
   * no suffix is provided, the passed number is assumed to be in seconds.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  long timeStringAsSeconds (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m) to bytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in bytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  long byteStringAsBytes (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m) to kibibytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in kibibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  long byteStringAsKb (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m) to mebibytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in mebibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  long byteStringAsMb (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a passed byte string (e.g. 50b, 100k, or 250m, 500g) to gibibytes for internal use.
   * <p>
   * If no suffix is provided, the passed number is assumed to be in gibibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  long byteStringAsGb (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a Java memory parameter passed to -Xmx (such as 300m or 1g) to a number of mebibytes.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  int memoryStringToMb (java.lang.String str) { throw new RuntimeException(); }
  /**
   * Convert a quantity in bytes to a human-readable string such as "4.0 MB".
   * @param size (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String bytesToString (long size) { throw new RuntimeException(); }
  /**
   * Returns a human-readable string representing a duration such as "35ms"
   * @param ms (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String msDurationToString (long ms) { throw new RuntimeException(); }
  /**
   * Convert a quantity in megabytes to a human-readable string such as "4.0 MB".
   * @param megabytes (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String megabytesToString (long megabytes) { throw new RuntimeException(); }
  /**
   * Execute a command and return the process running the command.
   * @param command (undocumented)
   * @param workingDir (undocumented)
   * @param extraEnvironment (undocumented)
   * @param redirectStderr (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.Process executeCommand (scala.collection.Seq<java.lang.String> command, java.io.File workingDir, scala.collection.Map<java.lang.String, java.lang.String> extraEnvironment, boolean redirectStderr) { throw new RuntimeException(); }
  /**
   * Execute a command and get its output, throwing an exception if it yields a code other than 0.
   * @param command (undocumented)
   * @param workingDir (undocumented)
   * @param extraEnvironment (undocumented)
   * @param redirectStderr (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String executeAndGetOutput (scala.collection.Seq<java.lang.String> command, java.io.File workingDir, scala.collection.Map<java.lang.String, java.lang.String> extraEnvironment, boolean redirectStderr) { throw new RuntimeException(); }
  /**
   * Return and start a daemon thread that processes the content of the input stream line by line.
   * @param threadName (undocumented)
   * @param inputStream (undocumented)
   * @param processLine (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.Thread processStreamByLine (java.lang.String threadName, java.io.InputStream inputStream, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> processLine) { throw new RuntimeException(); }
  /**
   * Execute a block of code that evaluates to Unit, forwarding any uncaught exceptions to the
   * default UncaughtExceptionHandler
   * <p>
   * NOTE: This method is to be called by the spark-started JVM process.
   * @param block (undocumented)
   */
  static public  void tryOrExit (scala.Function0<scala.runtime.BoxedUnit> block) { throw new RuntimeException(); }
  /**
   * Execute a block of code that evaluates to Unit, stop SparkContext is there is any uncaught
   * exception
   * <p>
   * NOTE: This method is to be called by the driver-side components to avoid stopping the
   * user-started JVM process completely; in contrast, tryOrExit is to be called in the
   * spark-started JVM process .
   * @param sc (undocumented)
   * @param block (undocumented)
   */
  static public  void tryOrStopSparkContext (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> block) { throw new RuntimeException(); }
  /**
   * Execute a block of code that evaluates to Unit, re-throwing any non-fatal uncaught
   * exceptions as IOException.  This is used when implementing Externalizable and Serializable's
   * read and write methods, since Java's serializer will not report non-IOExceptions properly;
   * see SPARK-4080 for more context.
   * @param block (undocumented)
   */
  static public  void tryOrIOException (scala.Function0<scala.runtime.BoxedUnit> block) { throw new RuntimeException(); }
  /**
   * Execute a block of code that returns a value, re-throwing any non-fatal uncaught
   * exceptions as IOException. This is used when implementing Externalizable and Serializable's
   * read and write methods, since Java's serializer will not report non-IOExceptions properly;
   * see SPARK-4080 for more context.
   * @param block (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T tryOrIOException (scala.Function0<T> block) { throw new RuntimeException(); }
  /** Executes the given block. Log non-fatal errors if any, and only throw fatal errors */
  static public  void tryLogNonFatalError (scala.Function0<scala.runtime.BoxedUnit> block) { throw new RuntimeException(); }
  /**
   * Execute a block of code, then a finally block, but if exceptions happen in
   * the finally block, do not suppress the original exception.
   * <p>
   * This is primarily an issue with <code>finally { out.close() }</code> blocks, where
   * close needs to be called to clean up <code>out</code>, but if an exception happened
   * in <code>out.write</code>, it's likely <code>out</code> may be corrupted and <code>out.close</code> will
   * fail as well. This would then suppress the original/likely more meaningful
   * exception from the original <code>out.write</code> call.
   * @param block (undocumented)
   * @param finallyBlock (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T tryWithSafeFinally (scala.Function0<T> block, scala.Function0<scala.runtime.BoxedUnit> finallyBlock) { throw new RuntimeException(); }
  /** Default filtering function for finding call sites using `getCallSite`. */
  static private  boolean sparkInternalExclusionFunction (java.lang.String className) { throw new RuntimeException(); }
  /**
   * When called inside a class in the spark package, returns the name of the user code class
   * (outside the spark package) that called into Spark, as well as which Spark method they called.
   * This is used, for example, to tell users where in their code each RDD got created.
   * <p>
   * @param skipClass Function that is used to exclude non-user-code classes.
   * @return (undocumented)
   */
  static public  org.apache.spark.util.CallSite getCallSite (scala.Function1<java.lang.String, java.lang.Object> skipClass) { throw new RuntimeException(); }
  /** Return a string containing part of a file from byte 'start' to 'end'. */
  static public  java.lang.String offsetBytes (java.lang.String path, long start, long end) { throw new RuntimeException(); }
  /**
   * Return a string containing data across a set of files. The <code>startIndex</code>
   * and <code>endIndex</code> is based on the cumulative size of all the files take in
   * the given order. See figure below for more details.
   * @param files (undocumented)
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String offsetBytes (scala.collection.Seq<java.io.File> files, long start, long end) { throw new RuntimeException(); }
  /**
   * Clone an object using a Spark serializer.
   * @param value (undocumented)
   * @param serializer (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T clone (T value, org.apache.spark.serializer.SerializerInstance serializer, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  /**
   * Detect whether this thread might be executing a shutdown hook. Will always return true if
   * the current thread is a running a shutdown hook but may spuriously return true otherwise (e.g.
   * if System.exit was just called by a concurrent thread).
   * <p>
   * Currently, this detects whether the JVM is shutting down by Runtime#addShutdownHook throwing
   * an IllegalStateException.
   * @return (undocumented)
   */
  static public  boolean inShutdown () { throw new RuntimeException(); }
  static private  boolean isSpace (char c) { throw new RuntimeException(); }
  /**
   * Split a string of potentially quoted arguments from the command line the way that a shell
   * would do it to determine arguments to a command. For example, if the string is 'a "b c" d',
   * then it would be parsed as three arguments: 'a', 'b c' and 'd'.
   * @param s (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.String> splitCommandString (java.lang.String s) { throw new RuntimeException(); }
  static public  int nonNegativeMod (int x, int mod) { throw new RuntimeException(); }
  static public  int nonNegativeHash (java.lang.Object obj) { throw new RuntimeException(); }
  /** Returns the system properties map that is thread-safe to iterator over. It gets the
   * properties which have been set explicitly, as well as those for which only a default value
   * @return (undocumented)
   * has been defined. */
  static public  scala.collection.Map<java.lang.String, java.lang.String> getSystemProperties () { throw new RuntimeException(); }
  /**
   * Method executed for repeating a task for side effects.
   * Unlike a for comprehension, it permits JVM JIT optimization
   * @param numIters (undocumented)
   * @param f (undocumented)
   */
  static public  void times (int numIters, scala.Function0<scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /**
   * Timing method based on iterations that permit JVM JIT optimization.
   * @param numIters number of iterations
   * @param f function to be executed. If prepare is not None, the running time of each call to f
   *          must be an order of magnitude longer than one millisecond for accurate timing.
   * @param prepare function to be executed before each call to f. Its running time doesn't count.
   * @return the total time across all iterations (not couting preparation time)
   */
  static public  long timeIt (int numIters, scala.Function0<scala.runtime.BoxedUnit> f, scala.Option<scala.Function0<scala.runtime.BoxedUnit>> prepare) { throw new RuntimeException(); }
  /**
   * Counts the number of elements of an iterator using a while loop rather than calling
   * {@link scala.collection.Iterator#size} because it uses a for loop, which is slightly slower
   * in the current version of Scala.
   * @param iterator (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> long getIteratorSize (scala.collection.Iterator<T> iterator) { throw new RuntimeException(); }
  /**
   * Creates a symlink. Note jdk1.7 has Files.createSymbolicLink but not used here
   * for jdk1.6 support.  Supports windows by doing copy, everything else uses "ln -sf".
   * @param src absolute path to the source
   * @param dst relative path for the destination
   */
  static public  void symlink (java.io.File src, java.io.File dst) { throw new RuntimeException(); }
  /** Return the class name of the given object, removing all dollar signs */
  static public  java.lang.String getFormattedClassName (java.lang.Object obj) { throw new RuntimeException(); }
  /** Return an option that translates JNothing to None */
  static public  scala.Option<org.json4s.JsonAST.JValue> jsonOption (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  /** Return an empty JSON object */
  static public  org.json4s.JsonAST.JObject emptyJson () { throw new RuntimeException(); }
  /**
   * Return a Hadoop FileSystem with the scheme encoded in the given path.
   * @param path (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.fs.FileSystem getHadoopFileSystem (java.net.URI path, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Return a Hadoop FileSystem with the scheme encoded in the given path.
   * @param path (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.fs.FileSystem getHadoopFileSystem (java.lang.String path, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Return the absolute path of a file in the given directory.
   * @param dir (undocumented)
   * @param fileName (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.fs.Path getFilePath (java.io.File dir, java.lang.String fileName) { throw new RuntimeException(); }
  /**
   * Whether the underlying operating system is Windows.
   * @return (undocumented)
   */
  static public  boolean isWindows () { throw new RuntimeException(); }
  /**
   * Whether the underlying operating system is Mac OS X.
   * @return (undocumented)
   */
  static public  boolean isMac () { throw new RuntimeException(); }
  /**
   * Pattern for matching a Windows drive, which contains only a single alphabet character.
   * @return (undocumented)
   */
  static public  scala.util.matching.Regex windowsDrive () { throw new RuntimeException(); }
  /**
   * Indicates whether Spark is currently running unit tests.
   * @return (undocumented)
   */
  static public  boolean isTesting () { throw new RuntimeException(); }
  /**
   * Strip the directory from a path name
   * @param path (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String stripDirectory (java.lang.String path) { throw new RuntimeException(); }
  /**
   * Wait for a process to terminate for at most the specified duration.
   * Return whether the process actually terminated after the given timeout.
   * @param process (undocumented)
   * @param timeoutMs (undocumented)
   * @return (undocumented)
   */
  static public  boolean waitForProcess (java.lang.Process process, long timeoutMs) { throw new RuntimeException(); }
  /**
   * Return the stderr of a process after waiting for the process to terminate.
   * If the process does not terminate within the specified timeout, return None.
   * @param process (undocumented)
   * @param timeoutMs (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> getStderr (java.lang.Process process, long timeoutMs) { throw new RuntimeException(); }
  /**
   * Execute the given block, logging and re-throwing any uncaught exception.
   * This is particularly useful for wrapping code that runs in a thread, to ensure
   * that exceptions are printed, and to avoid having to catch Throwable.
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T logUncaughtExceptions (scala.Function0<T> f) { throw new RuntimeException(); }
  /** Executes the given block in a Try, logging any uncaught exceptions. */
  static public <T extends java.lang.Object> scala.util.Try<T> tryLog (scala.Function0<T> f) { throw new RuntimeException(); }
  /** Returns true if the given exception was fatal. See docs for scala.util.control.NonFatal. */
  static public  boolean isFatalError (java.lang.Throwable e) { throw new RuntimeException(); }
  static public  boolean isInInterpreter () { throw new RuntimeException(); }
  /**
   * Return a well-formed URI for the file described by a user input string.
   * <p>
   * If the supplied path does not contain a scheme, or is a relative path, it will be
   * converted into an absolute path with a file:// scheme.
   * @param path (undocumented)
   * @return (undocumented)
   */
  static public  java.net.URI resolveURI (java.lang.String path) { throw new RuntimeException(); }
  /** Resolve a comma-separated list of paths. */
  static public  java.lang.String resolveURIs (java.lang.String paths) { throw new RuntimeException(); }
  /** Return all non-local paths from a comma-separated list of paths. */
  static public  java.lang.String[] nonLocalPaths (java.lang.String paths, boolean testWindows) { throw new RuntimeException(); }
  /**
   * Load default Spark properties from the given file. If no file is provided,
   * use the common defaults file. This mutates state in the given SparkConf and
   * in this JVM's system properties if the config specified in the file is not
   * already set. Return the path of the properties file used.
   * @param conf (undocumented)
   * @param filePath (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String loadDefaultSparkProperties (org.apache.spark.SparkConf conf, java.lang.String filePath) { throw new RuntimeException(); }
  /** Load properties present in the given file. */
  static public  scala.collection.Map<java.lang.String, java.lang.String> getPropertiesFromFile (java.lang.String filename) { throw new RuntimeException(); }
  /** Return the path of the default Spark properties file. */
  static public  java.lang.String getDefaultPropertiesFile (scala.collection.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Return a nice string representation of the exception. It will call "printStackTrace" to
   * recursively generate the stack trace including the exception and its causes.
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String exceptionString (java.lang.Throwable e) { throw new RuntimeException(); }
  /** Return a thread dump of all threads' stacktraces.  Used to capture dumps for the web UI */
  static public  org.apache.spark.util.ThreadStackTrace[] getThreadDump () { throw new RuntimeException(); }
  /**
   * Convert all spark properties set in the given SparkConf to a sequence of java options.
   * @param conf (undocumented)
   * @param filterKey (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.String> sparkJavaOpts (org.apache.spark.SparkConf conf, scala.Function1<java.lang.String, java.lang.Object> filterKey) { throw new RuntimeException(); }
  /**
   * Maximum number of retries when binding to a port before giving up.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  int portMaxRetries (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Attempt to start a service on the given port, or fail after a number of attempts.
   * Each subsequent attempt uses 1 + the port used in the previous attempt (unless the port is 0).
   * <p>
   * @param startPort The initial port to start the service on.
   * @param startService Function to start service on a given port.
   *                     This is expected to throw java.net.BindException on port collision.
   * @param conf A SparkConf used to get the maximum number of retries when binding to a port.
   * @param serviceName Name of the service.
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Tuple2<T, java.lang.Object> startServiceOnPort (int startPort, scala.Function1<java.lang.Object, scala.Tuple2<T, java.lang.Object>> startService, org.apache.spark.SparkConf conf, java.lang.String serviceName) { throw new RuntimeException(); }
  /**
   * Return whether the exception is caused by an address-port collision when binding.
   * @param exception (undocumented)
   * @return (undocumented)
   */
  static public  boolean isBindCollision (java.lang.Throwable exception) { throw new RuntimeException(); }
  /**
   * configure a new log4j level
   * @param l (undocumented)
   */
  static public  void setLogLevel (org.apache.log4j.Level l) { throw new RuntimeException(); }
  /**
   * config a log4j properties used for testsuite
   * @param level (undocumented)
   */
  static public  void configTestLog4j (java.lang.String level) { throw new RuntimeException(); }
  /**
   * If the given URL connection is HttpsURLConnection, it sets the SSL socket factory and
   * the host verifier from the given security manager.
   * @param urlConnection (undocumented)
   * @param sm (undocumented)
   * @return (undocumented)
   */
  static public  java.net.URLConnection setupSecureURLConnection (java.net.URLConnection urlConnection, org.apache.spark.SecurityManager sm) { throw new RuntimeException(); }
  static public  java.lang.Object invoke (java.lang.Class<?> clazz, java.lang.Object obj, java.lang.String methodName, scala.collection.Seq<scala.Tuple2<java.lang.Class<?>, java.lang.Object>> args) { throw new RuntimeException(); }
  static public  long getMaxResultSize (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Return the current system LD_LIBRARY_PATH name
   * @return (undocumented)
   */
  static public  java.lang.String libraryPathEnvName () { throw new RuntimeException(); }
  /**
   * Return the prefix of a command that appends the given library paths to the
   * system-specific library path environment variable. On Unix, for instance,
   * this returns the string LD_LIBRARY_PATH="path1:path2:$LD_LIBRARY_PATH".
   * @param libraryPaths (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String libraryPathEnvPrefix (scala.collection.Seq<java.lang.String> libraryPaths) { throw new RuntimeException(); }
  /**
   * Return the value of a config either through the SparkConf or the Hadoop configuration
   * if this is Yarn mode. In the latter case, this defaults to the value set through SparkConf
   * if the key is not set in the Hadoop configuration.
   * @param conf (undocumented)
   * @param key (undocumented)
   * @param default_ (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getSparkOrYarnConfig (org.apache.spark.SparkConf conf, java.lang.String key, java.lang.String default_) { throw new RuntimeException(); }
  /**
   * Return a pair of host and port extracted from the <code>sparkUrl</code>.
   * <p>
   * A spark url (<code>spark://host:port</code>) is a special URI that its scheme is <code>spark</code> and only contains
   * host and port.
   * <p>
   * @throws SparkException if <code>sparkUrl</code> is invalid.
   * @param sparkUrl (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.String, java.lang.Object> extractHostPortFromSparkUrl (java.lang.String sparkUrl) { throw new RuntimeException(); }
  /**
   * Returns the current user name. This is the currently logged in user, unless that's been
   * overridden by the <code>SPARK_USER</code> environment variable.
   * @return (undocumented)
   */
  static public  java.lang.String getCurrentUserName () { throw new RuntimeException(); }
  /**
   * Split the comma delimited string of master URLs into a list.
   * For instance, "spark://abc,def" becomes [spark://abc, spark://def].
   * @param masterUrls (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String[] parseStandaloneMasterUrls (java.lang.String masterUrls) { throw new RuntimeException(); }
  /** An identifier that backup masters use in their responses. */
  static public  java.lang.String BACKUP_STANDALONE_MASTER_PREFIX () { throw new RuntimeException(); }
  /** Return true if the response message is sent from a backup Master on standby. */
  static public  boolean responseFromBackup (java.lang.String msg) { throw new RuntimeException(); }
  /**
   * Adds a shutdown hook with default priority.
   * <p>
   * @param hook The code to run during shutdown.
   * @return A handle that can be used to unregister the shutdown hook.
   */
  static public  java.lang.Object addShutdownHook (scala.Function0<scala.runtime.BoxedUnit> hook) { throw new RuntimeException(); }
  /**
   * Adds a shutdown hook with the given priority. Hooks with lower priority values run
   * first.
   * <p>
   * @param hook The code to run during shutdown.
   * @return A handle that can be used to unregister the shutdown hook.
   * @param priority (undocumented)
   */
  static public  java.lang.Object addShutdownHook (int priority, scala.Function0<scala.runtime.BoxedUnit> hook) { throw new RuntimeException(); }
  /**
   * Remove a previously installed shutdown hook.
   * <p>
   * @param ref A handle returned by <code>addShutdownHook</code>.
   * @return Whether the hook was removed.
   */
  static public  boolean removeShutdownHook (java.lang.Object ref) { throw new RuntimeException(); }
  /**
   * To avoid calling <code>Utils.getCallSite</code> for every single RDD we create in the body,
   * set a dummy call site that RDDs use instead. This is for performance optimization.
   * @param sc (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T withDummyCallSite (org.apache.spark.SparkContext sc, scala.Function0<T> body) { throw new RuntimeException(); }
  /**
   * Return whether the specified file is a parent directory of the child file.
   * @param parent (undocumented)
   * @param child (undocumented)
   * @return (undocumented)
   */
  static public  boolean isInDirectory (java.io.File parent, java.io.File child) { throw new RuntimeException(); }
}
