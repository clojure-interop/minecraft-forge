(ns net.minecraftforge.fml.common.asm.transformers.SideTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers SideTransformer]))

(defn ->side-transformer
  "Constructor."
  (^SideTransformer []
    (new SideTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^SideTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

