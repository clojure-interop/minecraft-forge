(ns net.minecraft.server.management.UserListEntryBan
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserListEntryBan]))

(defn ->user-list-entry-ban
  "Constructor.

  value-in - `T`
  start-date - `java.util.Date`
  banner - `java.lang.String`
  end-date - `java.util.Date`
  ban-reason - `java.lang.String`"
  (^UserListEntryBan [value-in ^java.util.Date start-date ^java.lang.String banner ^java.util.Date end-date ^java.lang.String ban-reason]
    (new UserListEntryBan value-in start-date banner end-date ban-reason)))

(def *-date-format
  "Static Constant.

  type: java.text.SimpleDateFormat"
  UserListEntryBan/DATE_FORMAT)

(defn get-ban-end-date
  "returns: `java.util.Date`"
  (^java.util.Date [^UserListEntryBan this]
    (-> this (.getBanEndDate))))

(defn get-ban-reason
  "returns: `java.lang.String`"
  (^java.lang.String [^UserListEntryBan this]
    (-> this (.getBanReason))))

