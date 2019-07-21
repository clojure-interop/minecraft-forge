(ns net.minecraftforge.fml.relauncher.ReflectionHelper$UnableToFindClassException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ReflectionHelper$UnableToFindClassException]))

(defn ->unable-to-find-class-exception
  "Constructor.

  class-names - `java.lang.String[]`
  err - `java.lang.Exception`"
  (^ReflectionHelper$UnableToFindClassException [class-names ^java.lang.Exception err]
    (new ReflectionHelper$UnableToFindClassException class-names err)))

