(ns net.minecraft.server.dedicated.PropertyManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.dedicated PropertyManager]))

(defn ->property-manager
  "Constructor.

  properties-file - `java.io.File`"
  (^PropertyManager [^java.io.File properties-file]
    (new PropertyManager properties-file)))

(defn get-properties-file
  "returns: `java.io.File`"
  (^java.io.File [^PropertyManager this]
    (-> this (.getPropertiesFile))))

(defn get-string-property
  "key - `java.lang.String`
  default-value - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^PropertyManager this ^java.lang.String key ^java.lang.String default-value]
    (-> this (.getStringProperty key default-value))))

(defn get-boolean-property?
  "key - `java.lang.String`
  default-value - `boolean`

  returns: `boolean`"
  (^Boolean [^PropertyManager this ^java.lang.String key ^Boolean default-value]
    (-> this (.getBooleanProperty key default-value))))

(defn has-property?
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^PropertyManager this ^java.lang.String key]
    (-> this (.hasProperty key))))

(defn get-int-property
  "key - `java.lang.String`
  default-value - `int`

  returns: `int`"
  (^Integer [^PropertyManager this ^java.lang.String key ^Integer default-value]
    (-> this (.getIntProperty key default-value))))

(defn generate-new-properties
  ""
  ([^PropertyManager this]
    (-> this (.generateNewProperties))))

(defn remove-property
  "key - `java.lang.String`"
  ([^PropertyManager this ^java.lang.String key]
    (-> this (.removeProperty key))))

(defn get-long-property
  "key - `java.lang.String`
  default-value - `long`

  returns: `long`"
  (^Long [^PropertyManager this ^java.lang.String key ^Long default-value]
    (-> this (.getLongProperty key default-value))))

(defn set-property
  "key - `java.lang.String`
  value - `java.lang.Object`"
  ([^PropertyManager this ^java.lang.String key ^java.lang.Object value]
    (-> this (.setProperty key value))))

(defn save-properties
  ""
  ([^PropertyManager this]
    (-> this (.saveProperties))))

