(ns net.minecraft.command.NumberInvalidException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command NumberInvalidException]))

(defn ->number-invalid-exception
  "Constructor.

  message - `java.lang.String`
  replacements - `java.lang.Object`"
  (^NumberInvalidException [^java.lang.String message ^java.lang.Object replacements]
    (new NumberInvalidException message replacements))
  (^NumberInvalidException []
    (new NumberInvalidException )))

