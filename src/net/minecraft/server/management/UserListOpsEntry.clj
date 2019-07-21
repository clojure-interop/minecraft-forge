(ns net.minecraft.server.management.UserListOpsEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListOpsEntry]))

(defn ->user-list-ops-entry
  "Constructor.

  player - `com.mojang.authlib.GameProfile`
  permission-level-in - `int`
  bypasses-player-limit-in - `boolean`"
  (^UserListOpsEntry [^com.mojang.authlib.GameProfile player ^Integer permission-level-in ^Boolean bypasses-player-limit-in]
    (new UserListOpsEntry player permission-level-in bypasses-player-limit-in))
  (^UserListOpsEntry [^com.google.gson.JsonObject p-i-1150-1]
    (new UserListOpsEntry p-i-1150-1)))

(defn get-permission-level
  "returns: `int`"
  (^Integer [^UserListOpsEntry this]
    (-> this (.getPermissionLevel))))

(defn bypasses-player-limit
  "returns: `boolean`"
  (^Boolean [^UserListOpsEntry this]
    (-> this (.bypassesPlayerLimit))))

