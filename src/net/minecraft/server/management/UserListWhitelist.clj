(ns net.minecraft.server.management.UserListWhitelist
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListWhitelist]))

(defn ->user-list-whitelist
  "Constructor.

  p-i-1132-1 - `java.io.File`"
  (^UserListWhitelist [^java.io.File p-i-1132-1]
    (new UserListWhitelist p-i-1132-1)))

(defn get-keys
  "returns: `java.lang.String[]`"
  ([^UserListWhitelist this]
    (-> this (.getKeys))))

(defn whitelisted?
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^UserListWhitelist this ^com.mojang.authlib.GameProfile profile]
    (-> this (.isWhitelisted profile))))

(defn get-by-name
  "profile-name - `java.lang.String`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^UserListWhitelist this ^java.lang.String profile-name]
    (-> this (.getByName profile-name))))

