(ns net.minecraftforge.server.console.ConsoleFormatter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.console ConsoleFormatter]))

(defn ->console-formatter
  "Constructor."
  (^ConsoleFormatter []
    (new ConsoleFormatter )))

(defn apply
  "text - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ConsoleFormatter this ^java.lang.String text]
    (-> this (.apply text))))

