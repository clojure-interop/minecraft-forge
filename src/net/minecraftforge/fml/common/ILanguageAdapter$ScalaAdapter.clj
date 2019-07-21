(ns net.minecraftforge.fml.common.ILanguageAdapter$ScalaAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ILanguageAdapter$ScalaAdapter]))

(defn ->scala-adapter
  "Constructor."
  (^ILanguageAdapter$ScalaAdapter []
    (new ILanguageAdapter$ScalaAdapter )))

(defn get-new-instance
  "container - `net.minecraftforge.fml.common.FMLModContainer`
  scala-object-class - `java.lang.Class`
  class-loader - `java.lang.ClassLoader`
  factory-marked-annotation - `java.lang.reflect.Method`

  returns: `java.lang.Object`

  throws: java.lang.Exception"
  (^java.lang.Object [^ILanguageAdapter$ScalaAdapter this ^net.minecraftforge.fml.common.FMLModContainer container ^java.lang.Class scala-object-class ^java.lang.ClassLoader class-loader ^java.lang.reflect.Method factory-marked-annotation]
    (-> this (.getNewInstance container scala-object-class class-loader factory-marked-annotation))))

(defn supports-statics
  "returns: `boolean`"
  (^Boolean [^ILanguageAdapter$ScalaAdapter this]
    (-> this (.supportsStatics))))

(defn set-proxy
  "target - `java.lang.reflect.Field`
  proxy-target - `java.lang.Class`
  proxy - `java.lang.Object`

  throws: java.lang.IllegalArgumentException"
  ([^ILanguageAdapter$ScalaAdapter this ^java.lang.reflect.Field target ^java.lang.Class proxy-target ^java.lang.Object proxy]
    (-> this (.setProxy target proxy-target proxy))))

(defn set-internal-proxies
  "mod - `net.minecraftforge.fml.common.ModContainer`
  side - `net.minecraftforge.fml.relauncher.Side`
  loader - `java.lang.ClassLoader`"
  ([^ILanguageAdapter$ScalaAdapter this ^net.minecraftforge.fml.common.ModContainer mod ^net.minecraftforge.fml.relauncher.Side side ^java.lang.ClassLoader loader]
    (-> this (.setInternalProxies mod side loader))))

