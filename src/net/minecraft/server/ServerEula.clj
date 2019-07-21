(ns net.minecraft.server.ServerEula
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server ServerEula]))

(defn ->server-eula
  "Constructor.

  eula-file - `java.io.File`"
  (^ServerEula [^java.io.File eula-file]
    (new ServerEula eula-file)))

(defn has-accepted-eula?
  "returns: `boolean`"
  (^Boolean [^ServerEula this]
    (-> this (.hasAcceptedEULA))))

(defn create-eula-file
  ""
  ([^ServerEula this]
    (-> this (.createEULAFile))))

