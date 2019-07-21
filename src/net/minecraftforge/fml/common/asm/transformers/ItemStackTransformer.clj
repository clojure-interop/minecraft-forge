(ns net.minecraftforge.fml.common.asm.transformers.ItemStackTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers ItemStackTransformer]))

(defn ->item-stack-transformer
  "Constructor."
  (^ItemStackTransformer []
    (new ItemStackTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  basic-class - `byte[]`

  returns: `byte[]`"
  ([^ItemStackTransformer this ^java.lang.String name ^java.lang.String transformed-name basic-class]
    (-> this (.transform name transformed-name basic-class))))

