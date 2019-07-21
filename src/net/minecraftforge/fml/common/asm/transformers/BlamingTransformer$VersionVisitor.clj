(ns net.minecraftforge.fml.common.asm.transformers.BlamingTransformer$VersionVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers BlamingTransformer$VersionVisitor]))

(defn ->version-visitor
  "Constructor."
  (^BlamingTransformer$VersionVisitor []
    (new BlamingTransformer$VersionVisitor )))

(defn visit
  "version - `int`
  access - `int`
  name - `java.lang.String`
  signature - `java.lang.String`
  super-name - `java.lang.String`
  interfaces - `java.lang.String[]`"
  ([^BlamingTransformer$VersionVisitor this ^Integer version ^Integer access ^java.lang.String name ^java.lang.String signature ^java.lang.String super-name interfaces]
    (-> this (.visit version access name signature super-name interfaces))))

