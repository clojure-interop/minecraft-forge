(ns net.minecraft.server.management.UserListIPBans
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListIPBans]))

(defn ->user-list-ip-bans
  "Constructor.

  bans-file - `java.io.File`"
  (^UserListIPBans [^java.io.File bans-file]
    (new UserListIPBans bans-file)))

(defn banned?
  "address - `java.net.SocketAddress`

  returns: `boolean`"
  (^Boolean [^UserListIPBans this ^java.net.SocketAddress address]
    (-> this (.isBanned address))))

(defn get-ban-entry
  "address - `java.net.SocketAddress`

  returns: `net.minecraft.server.management.UserListIPBansEntry`"
  (^net.minecraft.server.management.UserListIPBansEntry [^UserListIPBans this ^java.net.SocketAddress address]
    (-> this (.getBanEntry address))))

