(ns net.minecraftforge.fml.relauncher.ReflectionHelper$UnableToFindFieldException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ReflectionHelper$UnableToFindFieldException]))

(defn ->unable-to-find-field-exception
  "Constructor.

  field-name-list - `java.lang.String[]`
  e - `java.lang.Exception`"
  (^ReflectionHelper$UnableToFindFieldException [field-name-list ^java.lang.Exception e]
    (new ReflectionHelper$UnableToFindFieldException field-name-list e)))

