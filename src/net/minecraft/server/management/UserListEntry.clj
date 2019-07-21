(ns net.minecraft.server.management.UserListEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListEntry]))

(defn ->user-list-entry
  "Constructor.

  value-in - `T`"
  (^UserListEntry [value-in]
    (new UserListEntry value-in)))

