(ns net.minecraft.server.gui.StatsComponent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.gui StatsComponent]))

(defn ->stats-component
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`"
  (^StatsComponent [^net.minecraft.server.MinecraftServer server-in]
    (new StatsComponent server-in)))

(defn paint
  "p-paint-1 - `java.awt.Graphics`"
  ([^StatsComponent this ^java.awt.Graphics p-paint-1]
    (-> this (.paint p-paint-1))))

