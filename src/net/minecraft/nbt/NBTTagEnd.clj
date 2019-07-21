(ns net.minecraft.nbt.NBTTagEnd
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagEnd]))

(defn ->nbt-tag-end
  "Constructor."
  (^NBTTagEnd []
    (new NBTTagEnd )))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagEnd this]
    (-> this (.getId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagEnd this]
    (-> this (.toString))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagEnd`"
  (^net.minecraft.nbt.NBTTagEnd [^NBTTagEnd this]
    (-> this (.copy))))

