(ns net.minecraftforge.fml.relauncher.ReflectionHelper$UnableToFindMethodException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ReflectionHelper$UnableToFindMethodException]))

(defn ->unable-to-find-method-exception
  "Constructor.

  method-names - `java.lang.String[]`
  failed - `java.lang.Exception`"
  (^ReflectionHelper$UnableToFindMethodException [method-names ^java.lang.Exception failed]
    (new ReflectionHelper$UnableToFindMethodException method-names failed)))

