(ns net.minecraft.entity.ai.attributes.RangedAttribute
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes RangedAttribute]))

(defn ->ranged-attribute
  "Constructor.

  parent-in - `net.minecraft.entity.ai.attributes.IAttribute`
  unlocalized-name-in - `java.lang.String`
  default-value - `double`
  minimum-value-in - `double`
  maximum-value-in - `double`"
  (^RangedAttribute [^net.minecraft.entity.ai.attributes.IAttribute parent-in ^java.lang.String unlocalized-name-in ^Double default-value ^Double minimum-value-in ^Double maximum-value-in]
    (new RangedAttribute parent-in unlocalized-name-in default-value minimum-value-in maximum-value-in)))

(defn set-description
  "description-in - `java.lang.String`

  returns: `net.minecraft.entity.ai.attributes.RangedAttribute`"
  (^net.minecraft.entity.ai.attributes.RangedAttribute [^RangedAttribute this ^java.lang.String description-in]
    (-> this (.setDescription description-in))))

(defn get-description
  "returns: `java.lang.String`"
  (^java.lang.String [^RangedAttribute this]
    (-> this (.getDescription))))

(defn clamp-value
  "value - `double`

  returns: `double`"
  (^Double [^RangedAttribute this ^Double value]
    (-> this (.clampValue value))))

