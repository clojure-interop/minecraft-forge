(ns net.minecraftforge.fml.relauncher.ReflectionHelper$UnableToAccessFieldException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ReflectionHelper$UnableToAccessFieldException]))

(defn ->unable-to-access-field-exception
  "Constructor.

  field-names - `java.lang.String[]`
  e - `java.lang.Exception`"
  (^ReflectionHelper$UnableToAccessFieldException [field-names ^java.lang.Exception e]
    (new ReflectionHelper$UnableToAccessFieldException field-names e)))

