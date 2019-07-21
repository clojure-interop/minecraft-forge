(ns net.minecraft.network.ServerStatusResponse$Players
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network ServerStatusResponse$Players]))

(defn ->players
  "Constructor.

  max-online-players - `int`
  online-players - `int`"
  (^ServerStatusResponse$Players [^Integer max-online-players ^Integer online-players]
    (new ServerStatusResponse$Players max-online-players online-players)))

(defn get-max-players
  "returns: `int`"
  (^Integer [^ServerStatusResponse$Players this]
    (-> this (.getMaxPlayers))))

(defn get-online-player-count
  "returns: `int`"
  (^Integer [^ServerStatusResponse$Players this]
    (-> this (.getOnlinePlayerCount))))

(defn get-players
  "returns: `com.mojang.authlib.GameProfile[]`"
  ([^ServerStatusResponse$Players this]
    (-> this (.getPlayers))))

(defn set-players
  "players-in - `com.mojang.authlib.GameProfile[]`"
  ([^ServerStatusResponse$Players this players-in]
    (-> this (.setPlayers players-in))))

