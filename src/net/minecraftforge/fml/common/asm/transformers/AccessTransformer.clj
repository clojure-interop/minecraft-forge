(ns net.minecraftforge.fml.common.asm.transformers.AccessTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers AccessTransformer]))

(defn ->access-transformer
  "Constructor.

  throws: java.io.IOException"
  (^AccessTransformer []
    (new AccessTransformer )))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (AccessTransformer/main args)))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^AccessTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

