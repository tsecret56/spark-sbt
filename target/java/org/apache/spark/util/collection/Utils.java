package org.apache.spark.util.collection;
// no position
/**
 * Utility functions for collections.
 */
  class Utils {
  /**
   * Returns the first K elements from the input as defined by the specified implicit Ordering[T]
   * and maintains the ordering.
   * @param input (undocumented)
   * @param num (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Iterator<T> takeOrdered (scala.collection.Iterator<T> input, int num, scala.math.Ordering<T> ord) { throw new RuntimeException(); }
}
