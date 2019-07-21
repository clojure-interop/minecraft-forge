(ns net.minecraft.command.CommandNotFoundException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandNotFoundException]))

(defn ->command-not-found-exception
  "Constructor.

  message - `java.lang.String`
  args - `java.lang.Object`"
  (^CommandNotFoundException [^java.lang.String message ^java.lang.Object args]
    (new CommandNotFoundException message args))
  (^CommandNotFoundException []
    (new CommandNotFoundException )))

