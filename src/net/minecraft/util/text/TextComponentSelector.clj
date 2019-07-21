(ns net.minecraft.util.text.TextComponentSelector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentSelector]))

(defn ->text-component-selector
  "Constructor.

  selector-in - `java.lang.String`"
  (^TextComponentSelector [^java.lang.String selector-in]
    (new TextComponentSelector selector-in)))

(defn get-selector
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentSelector this]
    (-> this (.getSelector))))

(defn get-unformatted-component-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentSelector this]
    (-> this (.getUnformattedComponentText))))

(defn create-copy
  "returns: `net.minecraft.util.text.TextComponentSelector`"
  (^net.minecraft.util.text.TextComponentSelector [^TextComponentSelector this]
    (-> this (.createCopy))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TextComponentSelector this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentSelector this]
    (-> this (.toString))))

