(ns net.minecraftforge.fml.common.ClassNameUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ClassNameUtils]))

(defn ->class-name-utils
  "Constructor."
  (^ClassNameUtils []
    (new ClassNameUtils )))

(defn *short-name
  "clz - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clz]
    (ClassNameUtils/shortName clz)))

