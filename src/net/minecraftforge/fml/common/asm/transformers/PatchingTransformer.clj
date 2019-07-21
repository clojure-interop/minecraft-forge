(ns net.minecraftforge.fml.common.asm.transformers.PatchingTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers PatchingTransformer]))

(defn ->patching-transformer
  "Constructor."
  (^PatchingTransformer []
    (new PatchingTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^PatchingTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

