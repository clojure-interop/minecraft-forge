(ns net.minecraft.nbt.NBTException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTException]))

(defn ->nbt-exception
  "Constructor.

  message - `java.lang.String`"
  (^NBTException [^java.lang.String message]
    (new NBTException message)))

