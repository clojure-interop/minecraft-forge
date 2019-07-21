(ns net.minecraftforge.fml.repackage.com.nothome.delta.RandomAccessFileSeekableSource
  "Wraps a random access file."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta RandomAccessFileSeekableSource]))

(defn ->random-access-file-seekable-source
  "Constructor.

  Constructs a new RandomAccessFileSeekableSource.

  raf - `java.io.RandomAccessFile`"
  (^RandomAccessFileSeekableSource [^java.io.RandomAccessFile raf]
    (new RandomAccessFileSeekableSource raf)))

(defn seek
  "Description copied from interface: SeekableSource

  pos - `long`

  throws: java.io.IOException"
  ([^RandomAccessFileSeekableSource this ^Long pos]
    (-> this (.seek pos))))

(defn read
  "Description copied from interface: SeekableSource

  bb - `java.nio.ByteBuffer`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^RandomAccessFileSeekableSource this ^java.nio.ByteBuffer bb]
    (-> this (.read bb)))
  (^Integer [^RandomAccessFileSeekableSource this b ^Integer off ^Integer len]
    (-> this (.read b off len))))

(defn length
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^RandomAccessFileSeekableSource this]
    (-> this (.length))))

(defn close
  "throws: java.io.IOException"
  ([^RandomAccessFileSeekableSource this]
    (-> this (.close))))

