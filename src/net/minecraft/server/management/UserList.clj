(ns net.minecraft.server.management.UserList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management UserList]))

(defn ->user-list
  "Constructor.

  save-file - `java.io.File`"
  (^UserList [^java.io.File save-file]
    (new UserList save-file)))

(defn lan-server?
  "returns: `boolean`"
  (^Boolean [^UserList this]
    (-> this (.isLanServer))))

(defn get-save-file
  "returns: `java.io.File`"
  (^java.io.File [^UserList this]
    (-> this (.getSaveFile))))

(defn remove-entry
  "entry - `K`"
  ([^UserList this entry]
    (-> this (.removeEntry entry))))

(defn get-entry
  "obj - `K`

  returns: `V`"
  ([^UserList this obj]
    (-> this (.getEntry obj))))

(defn write-changes
  "throws: java.io.IOException"
  ([^UserList this]
    (-> this (.writeChanges))))

(defn get-keys
  "returns: `java.lang.String[]`"
  ([^UserList this]
    (-> this (.getKeys))))

(defn read-saved-file
  "throws: java.io.IOException"
  ([^UserList this]
    (-> this (.readSavedFile))))

(defn add-entry
  "entry - `V`"
  ([^UserList this entry]
    (-> this (.addEntry entry))))

(defn set-lan-server
  "state - `boolean`"
  ([^UserList this ^Boolean state]
    (-> this (.setLanServer state))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^UserList this]
    (-> this (.isEmpty))))

