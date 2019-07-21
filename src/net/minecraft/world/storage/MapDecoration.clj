(ns net.minecraft.world.storage.MapDecoration
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage MapDecoration]))

(defn ->map-decoration
  "Constructor.

  type-in - `net.minecraft.world.storage.MapDecoration$Type`
  x-in - `byte`
  y-in - `byte`
  rotation-in - `byte`"
  (^MapDecoration [^net.minecraft.world.storage.MapDecoration$Type type-in ^Byte x-in ^Byte y-in ^Byte rotation-in]
    (new MapDecoration type-in x-in y-in rotation-in)))

(defn get-image
  "returns: `byte`"
  (^Byte [^MapDecoration this]
    (-> this (.getImage))))

(defn get-type
  "returns: `net.minecraft.world.storage.MapDecoration$Type`"
  (^net.minecraft.world.storage.MapDecoration$Type [^MapDecoration this]
    (-> this (.getType))))

(defn get-x
  "returns: `byte`"
  (^Byte [^MapDecoration this]
    (-> this (.getX))))

(defn get-y
  "returns: `byte`"
  (^Byte [^MapDecoration this]
    (-> this (.getY))))

(defn get-rotation
  "returns: `byte`"
  (^Byte [^MapDecoration this]
    (-> this (.getRotation))))

(defn render-on-frame
  "returns: `boolean`"
  (^Boolean [^MapDecoration this]
    (-> this (.renderOnFrame))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MapDecoration this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MapDecoration this]
    (-> this (.hashCode))))

