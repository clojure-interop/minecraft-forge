(ns net.minecraftforge.common.property.IUnlistedProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property IUnlistedProperty]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IUnlistedProperty this]
    (-> this (.getName))))

(defn valid?
  "value - `V`

  returns: `boolean`"
  (^Boolean [^IUnlistedProperty this value]
    (-> this (.isValid value))))

(defn get-type
  "returns: `java.lang.Class<V>`"
  (^java.lang.Class [^IUnlistedProperty this]
    (-> this (.getType))))

(defn value-to-string
  "value - `V`

  returns: `java.lang.String`"
  (^java.lang.String [^IUnlistedProperty this value]
    (-> this (.valueToString value))))

