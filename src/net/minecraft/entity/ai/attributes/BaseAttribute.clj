(ns net.minecraft.entity.ai.attributes.BaseAttribute
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes BaseAttribute]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseAttribute this]
    (-> this (.getName))))

(defn get-default-value
  "returns: `double`"
  (^Double [^BaseAttribute this]
    (-> this (.getDefaultValue))))

(defn get-should-watch?
  "returns: `boolean`"
  (^Boolean [^BaseAttribute this]
    (-> this (.getShouldWatch))))

(defn set-should-watch
  "should-watch-in - `boolean`

  returns: `net.minecraft.entity.ai.attributes.BaseAttribute`"
  (^net.minecraft.entity.ai.attributes.BaseAttribute [^BaseAttribute this ^Boolean should-watch-in]
    (-> this (.setShouldWatch should-watch-in))))

(defn get-parent
  "returns: `net.minecraft.entity.ai.attributes.IAttribute`"
  (^net.minecraft.entity.ai.attributes.IAttribute [^BaseAttribute this]
    (-> this (.getParent))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseAttribute this]
    (-> this (.hashCode))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseAttribute this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

