(ns net.minecraftforge.fml.common.asm.transformers.MarkerTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers MarkerTransformer]))

(defn ->marker-transformer
  "Constructor.

  throws: java.io.IOException"
  (^MarkerTransformer []
    (new MarkerTransformer )))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (MarkerTransformer/main args)))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^MarkerTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

