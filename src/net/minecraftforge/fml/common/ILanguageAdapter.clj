(ns net.minecraftforge.fml.common.ILanguageAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ILanguageAdapter]))

(defn get-new-instance
  "container - `net.minecraftforge.fml.common.FMLModContainer`
  object-class - `java.lang.Class`
  class-loader - `java.lang.ClassLoader`
  factory-marked-annotation - `java.lang.reflect.Method`

  returns: `java.lang.Object`

  throws: java.lang.Exception"
  (^java.lang.Object [^ILanguageAdapter this ^net.minecraftforge.fml.common.FMLModContainer container ^java.lang.Class object-class ^java.lang.ClassLoader class-loader ^java.lang.reflect.Method factory-marked-annotation]
    (-> this (.getNewInstance container object-class class-loader factory-marked-annotation))))

(defn supports-statics
  "returns: `boolean`"
  (^Boolean [^ILanguageAdapter this]
    (-> this (.supportsStatics))))

(defn set-proxy
  "target - `java.lang.reflect.Field`
  proxy-target - `java.lang.Class`
  proxy - `java.lang.Object`

  throws: java.lang.IllegalArgumentException"
  ([^ILanguageAdapter this ^java.lang.reflect.Field target ^java.lang.Class proxy-target ^java.lang.Object proxy]
    (-> this (.setProxy target proxy-target proxy))))

(defn set-internal-proxies
  "mod - `net.minecraftforge.fml.common.ModContainer`
  side - `net.minecraftforge.fml.relauncher.Side`
  loader - `java.lang.ClassLoader`"
  ([^ILanguageAdapter this ^net.minecraftforge.fml.common.ModContainer mod ^net.minecraftforge.fml.relauncher.Side side ^java.lang.ClassLoader loader]
    (-> this (.setInternalProxies mod side loader))))

