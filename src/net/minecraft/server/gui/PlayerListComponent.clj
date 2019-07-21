(ns net.minecraft.server.gui.PlayerListComponent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.gui PlayerListComponent]))

(defn ->player-list-component
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`"
  (^PlayerListComponent [^net.minecraft.server.MinecraftServer server]
    (new PlayerListComponent server)))

(defn update
  ""
  ([^PlayerListComponent this]
    (-> this (.update))))

