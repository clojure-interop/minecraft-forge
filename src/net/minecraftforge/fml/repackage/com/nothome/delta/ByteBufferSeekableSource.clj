(ns net.minecraftforge.fml.repackage.com.nothome.delta.ByteBufferSeekableSource
  "Wraps a byte buffer as a source"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta ByteBufferSeekableSource]))

(defn ->byte-buffer-seekable-source
  "Constructor.

  Constructs a new ByteArraySeekableSource.

  source - `byte[]`"
  (^ByteBufferSeekableSource [source]
    (new ByteBufferSeekableSource source)))

(defn seek
  "Description copied from interface: SeekableSource

  pos - `long`

  throws: java.io.IOException"
  ([^ByteBufferSeekableSource this ^Long pos]
    (-> this (.seek pos))))

(defn read
  "Description copied from interface: SeekableSource

  dest - `java.nio.ByteBuffer`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^ByteBufferSeekableSource this ^java.nio.ByteBuffer dest]
    (-> this (.read dest))))

(defn close
  "throws: java.io.IOException"
  ([^ByteBufferSeekableSource this]
    (-> this (.close))))

(defn to-string
  "Returns a debug String.

  returns: `java.lang.String`"
  (^java.lang.String [^ByteBufferSeekableSource this]
    (-> this (.toString))))

