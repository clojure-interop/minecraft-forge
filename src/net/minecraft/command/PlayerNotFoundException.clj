(ns net.minecraft.command.PlayerNotFoundException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command PlayerNotFoundException]))

(defn ->player-not-found-exception
  "Constructor.

  message - `java.lang.String`
  replacements - `java.lang.Object`"
  (^PlayerNotFoundException [^java.lang.String message ^java.lang.Object replacements]
    (new PlayerNotFoundException message replacements))
  (^PlayerNotFoundException [^java.lang.String p-i-47330-1]
    (new PlayerNotFoundException p-i-47330-1)))

