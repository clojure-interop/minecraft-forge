(ns net.minecraftforge.common.property.Properties$PropertyAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property Properties$PropertyAdapter]))

(defn ->property-adapter
  "Constructor.

  parent - `net.minecraft.block.properties.IProperty`"
  (^Properties$PropertyAdapter [^net.minecraft.block.properties.IProperty parent]
    (new Properties$PropertyAdapter parent)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Properties$PropertyAdapter this]
    (-> this (.getName))))

(defn valid?
  "value - `V`

  returns: `boolean`"
  (^Boolean [^Properties$PropertyAdapter this value]
    (-> this (.isValid value))))

(defn get-type
  "returns: `java.lang.Class<V>`"
  (^java.lang.Class [^Properties$PropertyAdapter this]
    (-> this (.getType))))

(defn value-to-string
  "value - `V`

  returns: `java.lang.String`"
  (^java.lang.String [^Properties$PropertyAdapter this value]
    (-> this (.valueToString value))))

