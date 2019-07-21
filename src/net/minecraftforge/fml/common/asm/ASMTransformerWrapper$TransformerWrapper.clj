(ns net.minecraftforge.fml.common.asm.ASMTransformerWrapper$TransformerWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm ASMTransformerWrapper$TransformerWrapper]))

(defn ->transformer-wrapper
  "Constructor."
  (^ASMTransformerWrapper$TransformerWrapper []
    (new ASMTransformerWrapper$TransformerWrapper )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  basic-class - `byte[]`

  returns: `byte[]`"
  ([^ASMTransformerWrapper$TransformerWrapper this ^java.lang.String name ^java.lang.String transformed-name basic-class]
    (-> this (.transform name transformed-name basic-class))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMTransformerWrapper$TransformerWrapper this]
    (-> this (.toString))))

