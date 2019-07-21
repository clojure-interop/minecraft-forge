(ns net.minecraftforge.common.property.PropertyFloat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property PropertyFloat]))

(defn ->property-float
  "Constructor.

  name - `java.lang.String`
  validator - `com.google.common.base.Predicate`"
  (^PropertyFloat [^java.lang.String name ^com.google.common.base.Predicate validator]
    (new PropertyFloat name validator))
  (^PropertyFloat [^java.lang.String name]
    (new PropertyFloat name)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^PropertyFloat this]
    (-> this (.getName))))

(defn valid?
  "value - `java.lang.Float`

  returns: `boolean`"
  (^Boolean [^PropertyFloat this ^java.lang.Float value]
    (-> this (.isValid value))))

(defn get-type
  "returns: `java.lang.Class<java.lang.Float>`"
  (^java.lang.Class [^PropertyFloat this]
    (-> this (.getType))))

(defn value-to-string
  "value - `java.lang.Float`

  returns: `java.lang.String`"
  (^java.lang.String [^PropertyFloat this ^java.lang.Float value]
    (-> this (.valueToString value))))

