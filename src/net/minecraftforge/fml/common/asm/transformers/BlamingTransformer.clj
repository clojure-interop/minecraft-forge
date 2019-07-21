(ns net.minecraftforge.fml.common.asm.transformers.BlamingTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers BlamingTransformer]))

(defn ->blaming-transformer
  "Constructor."
  (^BlamingTransformer []
    (new BlamingTransformer )))

(defn *blame
  "mod-id - `java.lang.String`
  cls - `java.lang.String`"
  ([^java.lang.String mod-id ^java.lang.String cls]
    (BlamingTransformer/blame mod-id cls)))

(defn *add-classes
  "mod-id - `java.lang.String`
  class-list - `java.util.Set`"
  ([^java.lang.String mod-id ^java.util.Set class-list]
    (BlamingTransformer/addClasses mod-id class-list)))

(defn *on-crash
  "builder - `java.lang.StringBuilder`"
  ([^java.lang.StringBuilder builder]
    (BlamingTransformer/onCrash builder)))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^BlamingTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

