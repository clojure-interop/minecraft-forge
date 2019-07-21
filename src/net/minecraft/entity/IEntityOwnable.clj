(ns net.minecraft.entity.IEntityOwnable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity IEntityOwnable]))

(defn get-owner-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^IEntityOwnable this]
    (-> this (.getOwnerId))))

(defn get-owner
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^IEntityOwnable this]
    (-> this (.getOwner))))

