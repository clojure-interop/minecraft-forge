(ns net.minecraft.server.management.UserListWhitelistEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListWhitelistEntry]))

(defn ->user-list-whitelist-entry
  "Constructor.

  profile - `com.mojang.authlib.GameProfile`"
  (^UserListWhitelistEntry [^com.mojang.authlib.GameProfile profile]
    (new UserListWhitelistEntry profile)))

