package org.apache.spark.api.r;
/**
 * Form an RDD[(Int, Array[Byte])] from key-value pairs returned from R.
 * This is used by SparkR's shuffle operations.
 */
public  class PairwiseRRDD<T extends java.lang.Object> extends org.apache.spark.api.r.BaseRRDD<T, scala.Tuple2<java.lang.Object, byte[]>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   PairwiseRRDD (org.apache.spark.rdd.RDD<T> parent, int numPartitions, byte[] hashFunc, java.lang.String deserializer, byte[] packageNames, java.lang.String rLibDir, java.lang.Object[] broadcastVars, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
  protected  scala.Tuple2<java.lang.Object, byte[]> readData (int length) { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaPairRDD<java.lang.Object, byte[]> asJavaPairRDD () { throw new RuntimeException(); }
}
