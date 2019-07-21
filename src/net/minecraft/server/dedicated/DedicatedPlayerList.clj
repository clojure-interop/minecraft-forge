(ns net.minecraft.server.dedicated.DedicatedPlayerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.dedicated DedicatedPlayerList]))

(defn ->dedicated-player-list
  "Constructor.

  server - `net.minecraft.server.dedicated.DedicatedServer`"
  (^DedicatedPlayerList [^net.minecraft.server.dedicated.DedicatedServer server]
    (new DedicatedPlayerList server)))

(defn remove-op
  "profile - `com.mojang.authlib.GameProfile`"
  ([^DedicatedPlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.removeOp profile))))

(defn add-op
  "profile - `com.mojang.authlib.GameProfile`"
  ([^DedicatedPlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.addOp profile))))

(defn get-server-instance
  "returns: `net.minecraft.server.dedicated.DedicatedServer`"
  (^net.minecraft.server.dedicated.DedicatedServer [^DedicatedPlayerList this]
    (-> this (.getServerInstance))))

(defn set-white-list-enabled
  "whitelist-enabled - `boolean`"
  ([^DedicatedPlayerList this ^Boolean whitelist-enabled]
    (-> this (.setWhiteListEnabled whitelist-enabled))))

(defn reload-whitelist
  ""
  ([^DedicatedPlayerList this]
    (-> this (.reloadWhitelist))))

(defn add-whitelisted-player
  "profile - `com.mojang.authlib.GameProfile`"
  ([^DedicatedPlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.addWhitelistedPlayer profile))))

(defn remove-player-from-whitelist
  "profile - `com.mojang.authlib.GameProfile`"
  ([^DedicatedPlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.removePlayerFromWhitelist profile))))

(defn bypasses-player-limit
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^DedicatedPlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.bypassesPlayerLimit profile))))

(defn can-join?
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^DedicatedPlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.canJoin profile))))

