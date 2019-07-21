(ns net.minecraft.server.management.UserListBansEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListBansEntry]))

(defn ->user-list-bans-entry
  "Constructor.

  profile - `com.mojang.authlib.GameProfile`
  start-date - `java.util.Date`
  banner - `java.lang.String`
  end-date - `java.util.Date`
  ban-reason - `java.lang.String`"
  (^UserListBansEntry [^com.mojang.authlib.GameProfile profile ^java.util.Date start-date ^java.lang.String banner ^java.util.Date end-date ^java.lang.String ban-reason]
    (new UserListBansEntry profile start-date banner end-date ban-reason))
  (^UserListBansEntry [^com.mojang.authlib.GameProfile profile]
    (new UserListBansEntry profile)))

