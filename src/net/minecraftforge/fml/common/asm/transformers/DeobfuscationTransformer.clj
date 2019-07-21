(ns net.minecraftforge.fml.common.asm.transformers.DeobfuscationTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers DeobfuscationTransformer]))

(defn ->deobfuscation-transformer
  "Constructor."
  (^DeobfuscationTransformer []
    (new DeobfuscationTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^DeobfuscationTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

(defn remap-class-name
  "name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^DeobfuscationTransformer this ^java.lang.String name]
    (-> this (.remapClassName name))))

(defn unmap-class-name
  "name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^DeobfuscationTransformer this ^java.lang.String name]
    (-> this (.unmapClassName name))))

