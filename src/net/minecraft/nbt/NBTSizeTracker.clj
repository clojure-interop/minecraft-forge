(ns net.minecraft.nbt.NBTSizeTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTSizeTracker]))

(defn ->nbt-size-tracker
  "Constructor.

  max - `long`"
  (^NBTSizeTracker [^Long max]
    (new NBTSizeTracker max)))

(def *-infinite
  "Static Constant.

  type: net.minecraft.nbt.NBTSizeTracker"
  NBTSizeTracker/INFINITE)

(defn *read-utf
  "tracker - `net.minecraft.nbt.NBTSizeTracker`
  data - `java.lang.String`"
  ([^net.minecraft.nbt.NBTSizeTracker tracker ^java.lang.String data]
    (NBTSizeTracker/readUTF tracker data)))

(defn read
  "bits - `long`"
  ([^NBTSizeTracker this ^Long bits]
    (-> this (.read bits))))

