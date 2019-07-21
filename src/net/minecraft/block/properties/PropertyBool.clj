(ns net.minecraft.block.properties.PropertyBool
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.properties PropertyBool]))

(defn *create
  "name - `java.lang.String`

  returns: `net.minecraft.block.properties.PropertyBool`"
  (^net.minecraft.block.properties.PropertyBool [^java.lang.String name]
    (PropertyBool/create name)))

(defn get-allowed-values
  "returns: `java.util.Collection<java.lang.Boolean>`"
  (^java.util.Collection [^PropertyBool this]
    (-> this (.getAllowedValues))))

(defn parse-value
  "value - `java.lang.String`

  returns: `com.google.common.base.Optional<java.lang.Boolean>`"
  (^com.google.common.base.Optional [^PropertyBool this ^java.lang.String value]
    (-> this (.parseValue value))))

(defn get-name
  "value - `java.lang.Boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^PropertyBool this ^java.lang.Boolean value]
    (-> this (.getName value))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PropertyBool this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PropertyBool this]
    (-> this (.hashCode))))

