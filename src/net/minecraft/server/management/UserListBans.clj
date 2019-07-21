(ns net.minecraft.server.management.UserListBans
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListBans]))

(defn ->user-list-bans
  "Constructor.

  bans-file - `java.io.File`"
  (^UserListBans [^java.io.File bans-file]
    (new UserListBans bans-file)))

(defn banned?
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^UserListBans this ^com.mojang.authlib.GameProfile profile]
    (-> this (.isBanned profile))))

(defn get-keys
  "returns: `java.lang.String[]`"
  ([^UserListBans this]
    (-> this (.getKeys))))

(defn get-banned-profile
  "username - `java.lang.String`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^UserListBans this ^java.lang.String username]
    (-> this (.getBannedProfile username))))

