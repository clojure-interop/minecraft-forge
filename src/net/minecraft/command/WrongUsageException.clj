(ns net.minecraft.command.WrongUsageException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command WrongUsageException]))

(defn ->wrong-usage-exception
  "Constructor.

  message - `java.lang.String`
  replacements - `java.lang.Object`"
  (^WrongUsageException [^java.lang.String message ^java.lang.Object replacements]
    (new WrongUsageException message replacements)))

