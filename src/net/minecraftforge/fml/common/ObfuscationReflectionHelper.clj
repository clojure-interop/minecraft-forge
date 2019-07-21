(ns net.minecraftforge.fml.common.ObfuscationReflectionHelper
  "Some reflection helper code."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ObfuscationReflectionHelper]))

(defn ->obfuscation-reflection-helper
  "Constructor."
  (^ObfuscationReflectionHelper []
    (new ObfuscationReflectionHelper )))

(defn *get-private-value
  "class-to-access - `java.lang.Class`
  instance - `E`
  field-index - `int`

  returns: `<T,E> T`"
  ([^java.lang.Class class-to-access instance ^Integer field-index]
    (ObfuscationReflectionHelper/getPrivateValue class-to-access instance field-index)))

(defn *remap-field-names
  "class-name - `java.lang.String`
  field-names - `java.lang.String`

  returns: `java.lang.String[]`"
  ([^java.lang.String class-name ^java.lang.String field-names]
    (ObfuscationReflectionHelper/remapFieldNames class-name field-names)))

(defn *set-private-value
  "class-to-access - `java.lang.Class`
  instance - `T`
  value - `E`
  field-index - `int`

  returns: `<T,E> void`"
  ([^java.lang.Class class-to-access instance value ^Integer field-index]
    (ObfuscationReflectionHelper/setPrivateValue class-to-access instance value field-index)))

