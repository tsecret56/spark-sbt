package org.apache.spark.storage;
/**
 * An interface for writing JVM objects to some underlying storage. This interface allows
 * appending data to an existing block, and can guarantee atomicity in the case of faults
 * as it allows the caller to revert partial writes.
 * <p>
 * This interface does not support concurrent writes. Also, once the writer has
 * been opened, it cannot be reopened again.
 */
 abstract class BlockObjectWriter extends java.io.OutputStream {
  public  org.apache.spark.storage.BlockId blockId () { throw new RuntimeException(); }
  // not preceding
  public   BlockObjectWriter (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public abstract  org.apache.spark.storage.BlockObjectWriter open () ;
  public abstract  void close () ;
  public abstract  boolean isOpen () ;
  /**
   * Flush the partial writes and commit them as a single atomic block.
   */
  public abstract  void commitAndClose () ;
  /**
   * Reverts writes that haven't been flushed yet. Callers should invoke this function
   * when there are runtime exceptions. This method will not throw, though it may be
   * unsuccessful in truncating written data.
   */
  public abstract  void revertPartialWritesAndClose () ;
  /**
   * Writes a key-value pair.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public abstract  void write (Object key, Object value) ;
  /**
   * Notify the writer that a record worth of bytes has been written with OutputStream#write.
   */
  public abstract  void recordWritten () ;
  /**
   * Returns the file segment of committed data that this Writer has written.
   * This is only valid after commitAndClose() has been called.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.storage.FileSegment fileSegment () ;
}
