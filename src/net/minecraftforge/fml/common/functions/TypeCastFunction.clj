(ns net.minecraftforge.fml.common.functions.TypeCastFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.functions TypeCastFunction]))

(defn ->type-cast-function
  "Constructor.

  type - `java.lang.Class`"
  (^TypeCastFunction [^java.lang.Class type]
    (new TypeCastFunction type)))

(defn apply
  "input - `java.lang.Object`

  returns: `T`"
  ([^TypeCastFunction this ^java.lang.Object input]
    (-> this (.apply input))))

