(ns net.minecraft.server.management.UserListOps
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListOps]))

(defn ->user-list-ops
  "Constructor.

  save-file - `java.io.File`"
  (^UserListOps [^java.io.File save-file]
    (new UserListOps save-file)))

(defn get-keys
  "returns: `java.lang.String[]`"
  ([^UserListOps this]
    (-> this (.getKeys))))

(defn get-permission-level
  "profile - `com.mojang.authlib.GameProfile`

  returns: `int`"
  (^Integer [^UserListOps this ^com.mojang.authlib.GameProfile profile]
    (-> this (.getPermissionLevel profile))))

(defn bypasses-player-limit
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^UserListOps this ^com.mojang.authlib.GameProfile profile]
    (-> this (.bypassesPlayerLimit profile))))

(defn get-game-profile-from-name
  "username - `java.lang.String`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^UserListOps this ^java.lang.String username]
    (-> this (.getGameProfileFromName username))))

