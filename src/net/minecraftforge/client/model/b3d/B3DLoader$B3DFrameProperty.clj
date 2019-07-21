(ns net.minecraftforge.client.model.b3d.B3DLoader$B3DFrameProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DLoader$B3DFrameProperty]))

(def INSTANCE
  "Enum Constant.

  Deprecated.

  type: net.minecraftforge.client.model.b3d.B3DLoader$B3DFrameProperty"
  B3DLoader$B3DFrameProperty/INSTANCE)

(defn *values
  "Deprecated.

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.b3d.B3DLoader$B3DFrameProperty[]`"
  ([]
    (B3DLoader$B3DFrameProperty/values )))

(defn *value-of
  "Deprecated.

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.b3d.B3DLoader$B3DFrameProperty`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.b3d.B3DLoader$B3DFrameProperty [^java.lang.String name]
    (B3DLoader$B3DFrameProperty/valueOf name)))

(defn get-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^B3DLoader$B3DFrameProperty this]
    (-> this (.getName))))

(defn valid?
  "Deprecated.

  value - `net.minecraftforge.client.model.b3d.B3DLoader$B3DState`

  returns: `boolean`"
  (^Boolean [^B3DLoader$B3DFrameProperty this ^net.minecraftforge.client.model.b3d.B3DLoader$B3DState value]
    (-> this (.isValid value))))

(defn get-type
  "Deprecated.

  returns: `java.lang.Class<net.minecraftforge.client.model.b3d.B3DLoader$B3DState>`"
  (^java.lang.Class [^B3DLoader$B3DFrameProperty this]
    (-> this (.getType))))

(defn value-to-string
  "Deprecated.

  value - `net.minecraftforge.client.model.b3d.B3DLoader$B3DState`

  returns: `java.lang.String`"
  (^java.lang.String [^B3DLoader$B3DFrameProperty this ^net.minecraftforge.client.model.b3d.B3DLoader$B3DState value]
    (-> this (.valueToString value))))

