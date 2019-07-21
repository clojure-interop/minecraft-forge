(ns net.minecraft.block.properties.PropertyEnum
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.properties PropertyEnum]))

(defn *create
  "name - `java.lang.String`
  clazz - `java.lang.Class`
  filter - `com.google.common.base.Predicate`

  returns: `<T extends java.lang.Enum<T> & net.minecraft.util.IStringSerializable> net.minecraft.block.properties.PropertyEnum<T>`"
  ([^java.lang.String name ^java.lang.Class clazz ^com.google.common.base.Predicate filter]
    (PropertyEnum/create name clazz filter))
  ([^java.lang.String name ^java.lang.Class clazz]
    (PropertyEnum/create name clazz)))

(defn get-allowed-values
  "returns: `java.util.Collection<T>`"
  (^java.util.Collection [^PropertyEnum this]
    (-> this (.getAllowedValues))))

(defn parse-value
  "value - `java.lang.String`

  returns: `com.google.common.base.Optional<T>`"
  (^com.google.common.base.Optional [^PropertyEnum this ^java.lang.String value]
    (-> this (.parseValue value))))

(defn get-name
  "value - `T`

  returns: `java.lang.String`"
  (^java.lang.String [^PropertyEnum this value]
    (-> this (.getName value))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PropertyEnum this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PropertyEnum this]
    (-> this (.hashCode))))

