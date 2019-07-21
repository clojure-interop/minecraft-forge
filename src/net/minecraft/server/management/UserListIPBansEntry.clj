(ns net.minecraft.server.management.UserListIPBansEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListIPBansEntry]))

(defn ->user-list-ip-bans-entry
  "Constructor.

  value-in - `java.lang.String`
  start-date - `java.util.Date`
  banner - `java.lang.String`
  end-date - `java.util.Date`
  ban-reason - `java.lang.String`"
  (^UserListIPBansEntry [^java.lang.String value-in ^java.util.Date start-date ^java.lang.String banner ^java.util.Date end-date ^java.lang.String ban-reason]
    (new UserListIPBansEntry value-in start-date banner end-date ban-reason))
  (^UserListIPBansEntry [^java.lang.String value-in]
    (new UserListIPBansEntry value-in)))

