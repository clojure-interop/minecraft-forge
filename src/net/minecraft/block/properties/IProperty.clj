(ns net.minecraft.block.properties.IProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.properties IProperty]))

(defn get-name
  "value - `T`

  returns: `java.lang.String`"
  (^java.lang.String [^IProperty this value]
    (-> this (.getName value)))
  (^java.lang.String [^IProperty this]
    (-> this (.getName))))

(defn get-allowed-values
  "returns: `java.util.Collection<T>`"
  (^java.util.Collection [^IProperty this]
    (-> this (.getAllowedValues))))

(defn get-value-class
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^IProperty this]
    (-> this (.getValueClass))))

(defn parse-value
  "value - `java.lang.String`

  returns: `com.google.common.base.Optional<T>`"
  (^com.google.common.base.Optional [^IProperty this ^java.lang.String value]
    (-> this (.parseValue value))))

