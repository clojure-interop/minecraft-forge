(ns net.minecraftforge.client.model.obj.OBJModel$OBJProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$OBJProperty]))

(def INSTANCE
  "Enum Constant.

  Deprecated.

  type: net.minecraftforge.client.model.obj.OBJModel$OBJProperty"
  OBJModel$OBJProperty/INSTANCE)

(defn *values
  "Deprecated.

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.obj.OBJModel$OBJProperty[]`"
  ([]
    (OBJModel$OBJProperty/values )))

(defn *value-of
  "Deprecated.

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.obj.OBJModel$OBJProperty`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.obj.OBJModel$OBJProperty [^java.lang.String name]
    (OBJModel$OBJProperty/valueOf name)))

(defn get-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$OBJProperty this]
    (-> this (.getName))))

(defn valid?
  "Deprecated.

  value - `net.minecraftforge.client.model.obj.OBJModel$OBJState`

  returns: `boolean`"
  (^Boolean [^OBJModel$OBJProperty this ^net.minecraftforge.client.model.obj.OBJModel$OBJState value]
    (-> this (.isValid value))))

(defn get-type
  "Deprecated.

  returns: `java.lang.Class<net.minecraftforge.client.model.obj.OBJModel$OBJState>`"
  (^java.lang.Class [^OBJModel$OBJProperty this]
    (-> this (.getType))))

(defn value-to-string
  "Deprecated.

  value - `net.minecraftforge.client.model.obj.OBJModel$OBJState`

  returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$OBJProperty this ^net.minecraftforge.client.model.obj.OBJModel$OBJState value]
    (-> this (.valueToString value))))

