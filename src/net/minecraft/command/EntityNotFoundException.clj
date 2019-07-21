(ns net.minecraft.command.EntityNotFoundException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command EntityNotFoundException]))

(defn ->entity-not-found-exception
  "Constructor.

  message - `java.lang.String`
  args - `java.lang.Object`"
  (^EntityNotFoundException [^java.lang.String message ^java.lang.Object args]
    (new EntityNotFoundException message args))
  (^EntityNotFoundException [^java.lang.String p-i-47332-1]
    (new EntityNotFoundException p-i-47332-1)))

