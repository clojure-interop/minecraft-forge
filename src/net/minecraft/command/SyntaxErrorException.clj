(ns net.minecraft.command.SyntaxErrorException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command SyntaxErrorException]))

(defn ->syntax-error-exception
  "Constructor.

  message - `java.lang.String`
  replacements - `java.lang.Object`"
  (^SyntaxErrorException [^java.lang.String message ^java.lang.Object replacements]
    (new SyntaxErrorException message replacements))
  (^SyntaxErrorException []
    (new SyntaxErrorException )))

