(ns net.minecraft.entity.ai.attributes.IAttribute
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes IAttribute]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IAttribute this]
    (-> this (.getName))))

(defn clamp-value
  "value - `double`

  returns: `double`"
  (^Double [^IAttribute this ^Double value]
    (-> this (.clampValue value))))

(defn get-default-value
  "returns: `double`"
  (^Double [^IAttribute this]
    (-> this (.getDefaultValue))))

(defn get-should-watch?
  "returns: `boolean`"
  (^Boolean [^IAttribute this]
    (-> this (.getShouldWatch))))

(defn get-parent
  "returns: `net.minecraft.entity.ai.attributes.IAttribute`"
  (^net.minecraft.entity.ai.attributes.IAttribute [^IAttribute this]
    (-> this (.getParent))))

