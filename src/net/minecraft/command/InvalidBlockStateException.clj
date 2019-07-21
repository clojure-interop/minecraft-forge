(ns net.minecraft.command.InvalidBlockStateException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command InvalidBlockStateException]))

(defn ->invalid-block-state-exception
  "Constructor.

  p-i-47331-1 - `java.lang.String`
  p-i-47331-2 - `java.lang.Object`"
  (^InvalidBlockStateException [^java.lang.String p-i-47331-1 ^java.lang.Object p-i-47331-2]
    (new InvalidBlockStateException p-i-47331-1 p-i-47331-2))
  (^InvalidBlockStateException []
    (new InvalidBlockStateException )))

