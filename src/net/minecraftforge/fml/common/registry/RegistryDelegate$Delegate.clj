(ns net.minecraftforge.fml.common.registry.RegistryDelegate$Delegate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry RegistryDelegate$Delegate]))

(defn ->delegate
  "Constructor.

  referent - `T`
  type - `java.lang.Class`"
  (^RegistryDelegate$Delegate [referent ^java.lang.Class type]
    (new RegistryDelegate$Delegate referent type)))

(defn get
  "Description copied from interface: RegistryDelegate

  returns: The referred object - `T`"
  ([^RegistryDelegate$Delegate this]
    (-> this (.get))))

(defn name
  "Description copied from interface: RegistryDelegate

  returns: The name - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^RegistryDelegate$Delegate this]
    (-> this (.name))))

(defn type
  "Description copied from interface: RegistryDelegate

  returns: The type of delegate - `java.lang.Class<T>`"
  (^java.lang.Class [^RegistryDelegate$Delegate this]
    (-> this (.type))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegistryDelegate$Delegate this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegistryDelegate$Delegate this]
    (-> this (.hashCode))))

