(ns net.minecraft.world.MinecraftException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world MinecraftException]))

(defn ->minecraft-exception
  "Constructor.

  msg - `java.lang.String`"
  (^MinecraftException [^java.lang.String msg]
    (new MinecraftException msg)))

