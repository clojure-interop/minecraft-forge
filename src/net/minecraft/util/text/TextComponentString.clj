(ns net.minecraft.util.text.TextComponentString
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentString]))

(defn ->text-component-string
  "Constructor.

  msg - `java.lang.String`"
  (^TextComponentString [^java.lang.String msg]
    (new TextComponentString msg)))

(defn get-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentString this]
    (-> this (.getText))))

(defn get-unformatted-component-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentString this]
    (-> this (.getUnformattedComponentText))))

(defn create-copy
  "returns: `net.minecraft.util.text.TextComponentString`"
  (^net.minecraft.util.text.TextComponentString [^TextComponentString this]
    (-> this (.createCopy))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TextComponentString this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentString this]
    (-> this (.toString))))

