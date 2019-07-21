(ns net.minecraft.block.properties.PropertyInteger
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.properties PropertyInteger]))

(defn *create
  "name - `java.lang.String`
  min - `int`
  max - `int`

  returns: `net.minecraft.block.properties.PropertyInteger`"
  (^net.minecraft.block.properties.PropertyInteger [^java.lang.String name ^Integer min ^Integer max]
    (PropertyInteger/create name min max)))

(defn get-allowed-values
  "returns: `java.util.Collection<java.lang.Integer>`"
  (^java.util.Collection [^PropertyInteger this]
    (-> this (.getAllowedValues))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PropertyInteger this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PropertyInteger this]
    (-> this (.hashCode))))

(defn parse-value
  "value - `java.lang.String`

  returns: `com.google.common.base.Optional<java.lang.Integer>`"
  (^com.google.common.base.Optional [^PropertyInteger this ^java.lang.String value]
    (-> this (.parseValue value))))

(defn get-name
  "value - `java.lang.Integer`

  returns: `java.lang.String`"
  (^java.lang.String [^PropertyInteger this ^java.lang.Integer value]
    (-> this (.getName value))))

