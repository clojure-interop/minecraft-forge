(ns net.minecraftforge.fml.common.asm.transformers.deobf.LZMAInputSupplier
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers.deobf LZMAInputSupplier]))

(defn ->lzma-input-supplier
  "Constructor.

  compressed-data - `java.io.InputStream`"
  (^LZMAInputSupplier [^java.io.InputStream compressed-data]
    (new LZMAInputSupplier compressed-data)))

(defn open-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^LZMAInputSupplier this]
    (-> this (.openStream))))

