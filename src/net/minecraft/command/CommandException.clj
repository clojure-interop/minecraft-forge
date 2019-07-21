(ns net.minecraft.command.CommandException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandException]))

(defn ->command-exception
  "Constructor.

  message - `java.lang.String`
  objects - `java.lang.Object`"
  (^CommandException [^java.lang.String message ^java.lang.Object objects]
    (new CommandException message objects)))

(defn get-error-objects
  "returns: `java.lang.Object[]`"
  ([^CommandException this]
    (-> this (.getErrorObjects))))

