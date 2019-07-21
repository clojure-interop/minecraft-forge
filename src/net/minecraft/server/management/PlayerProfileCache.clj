(ns net.minecraft.server.management.PlayerProfileCache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management PlayerProfileCache]))

(defn ->player-profile-cache
  "Constructor.

  profile-repo-in - `com.mojang.authlib.GameProfileRepository`
  usercache-file-in - `java.io.File`"
  (^PlayerProfileCache [^com.mojang.authlib.GameProfileRepository profile-repo-in ^java.io.File usercache-file-in]
    (new PlayerProfileCache profile-repo-in usercache-file-in)))

(def *-date-format
  "Static Constant.

  type: java.text.SimpleDateFormat"
  PlayerProfileCache/DATE_FORMAT)

(defn *set-online-mode
  "online-mode-in - `boolean`"
  ([^Boolean online-mode-in]
    (PlayerProfileCache/setOnlineMode online-mode-in)))

(defn add-entry
  "game-profile - `com.mojang.authlib.GameProfile`"
  ([^PlayerProfileCache this ^com.mojang.authlib.GameProfile game-profile]
    (-> this (.addEntry game-profile))))

(defn get-game-profile-for-username
  "username - `java.lang.String`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^PlayerProfileCache this ^java.lang.String username]
    (-> this (.getGameProfileForUsername username))))

(defn get-usernames
  "returns: `java.lang.String[]`"
  ([^PlayerProfileCache this]
    (-> this (.getUsernames))))

(defn get-profile-by-uuid
  "uuid - `java.util.UUID`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^PlayerProfileCache this ^java.util.UUID uuid]
    (-> this (.getProfileByUUID uuid))))

(defn load
  ""
  ([^PlayerProfileCache this]
    (-> this (.load))))

(defn save
  ""
  ([^PlayerProfileCache this]
    (-> this (.save))))

