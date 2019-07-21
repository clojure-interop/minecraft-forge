(ns net.minecraftforge.fml.repackage.com.nothome.delta.Delta
  "Class for computing deltas against a source.
  The source file is read by blocks and a hash is computed per block.
  Then the target is scanned for matching blocks.

  This class is not thread safe. Use one instance per thread.

  This class should support files over 4GB in length, although you must
  use a larger checksum size, such as 1K, as all checksums use \"int\" indexing.
  Newer versions may eventually support paging in/out of checksums."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta Delta]))

(defn ->delta
  "Constructor.

  Constructs a new Delta.
   In the future, additional constructor arguments will set the algorithm details."
  (^Delta []
    (new Delta )))

(def *-default-chunk-size
  "Static Constant.

  Default size of 16.
   For \"Lorem ipsum\" text files (see the tests) the ideal size is about 14.
   Any smaller and the patch size becomes actually be larger.

   Use a size like 64 or 128 for large files.

  type: int"
  Delta/DEFAULT_CHUNK_SIZE)

(defn *main
  "Creates a patch using file names.

  argv - `java.lang.String[]`

  throws: java.lang.Exception"
  ([argv]
    (Delta/main argv)))

(defn set-chunk-size
  "Sets the chunk size used.
   Larger chunks are faster and use less memory, but create larger patches
   as well.

  size - `int`"
  ([^Delta this ^Integer size]
    (-> this (.setChunkSize size))))

(defn compute
  "Compares the source bytes with target bytes, writing to output.

  source - `byte[]`
  target - `byte[]`
  output - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^Delta this source target ^java.io.OutputStream output]
    (-> this (.compute source target output)))
  ([^Delta this source target]
    (-> this (.compute source target))))

