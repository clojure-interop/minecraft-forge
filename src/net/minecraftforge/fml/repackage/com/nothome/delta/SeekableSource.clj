(ns net.minecraftforge.fml.repackage.com.nothome.delta.SeekableSource
  "For sources of random-access data, such as RandomAccessFile."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta SeekableSource]))

(defn seek
  "Sets the position for the next read(ByteBuffer).

  pos - `long`

  throws: java.io.IOException"
  ([^SeekableSource this ^Long pos]
    (-> this (.seek pos))))

(defn read
  "Reads up to Buffer.remaining() bytes from the source,
   returning the number of bytes read, or -1 if no bytes were read
   and EOF was reached.

  bb - `java.nio.ByteBuffer`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^SeekableSource this ^java.nio.ByteBuffer bb]
    (-> this (.read bb))))

