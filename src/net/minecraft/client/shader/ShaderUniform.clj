(ns net.minecraft.client.shader.ShaderUniform
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader ShaderUniform]))

(defn ->shader-uniform
  "Constructor.

  name - `java.lang.String`
  type - `int`
  count - `int`
  manager - `net.minecraft.client.shader.ShaderManager`"
  (^ShaderUniform [^java.lang.String name ^Integer type ^Integer count ^net.minecraft.client.shader.ShaderManager manager]
    (new ShaderUniform name type count manager)))

(defn *parse-type
  "type-name - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.String type-name]
    (ShaderUniform/parseType type-name)))

(defn set-uniform-location
  "uniform-location-in - `int`"
  ([^ShaderUniform this ^Integer uniform-location-in]
    (-> this (.setUniformLocation uniform-location-in))))

(defn get-shader-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ShaderUniform this]
    (-> this (.getShaderName))))

(defn set
  "m-00 - `float`
  m-01 - `float`
  m-02 - `float`
  m-03 - `float`
  m-10 - `float`
  m-11 - `float`
  m-12 - `float`
  m-13 - `float`
  m-20 - `float`
  m-21 - `float`
  m-22 - `float`
  m-23 - `float`
  m-30 - `float`
  m-31 - `float`
  m-32 - `float`
  m-33 - `float`"
  ([^ShaderUniform this ^Float m-00 ^Float m-01 ^Float m-02 ^Float m-03 ^Float m-10 ^Float m-11 ^Float m-12 ^Float m-13 ^Float m-20 ^Float m-21 ^Float m-22 ^Float m-23 ^Float m-30 ^Float m-31 ^Float m-32 ^Float m-33]
    (-> this (.set m-00 m-01 m-02 m-03 m-10 m-11 m-12 m-13 m-20 m-21 m-22 m-23 m-30 m-31 m-32 m-33)))
  ([^ShaderUniform this ^Float p-148081-1 ^Float p-148081-2 ^Float p-148081-3 ^Float p-148081-4]
    (-> this (.set p-148081-1 p-148081-2 p-148081-3 p-148081-4)))
  ([^ShaderUniform this ^Float p-148095-1 ^Float p-148095-2 ^Float p-148095-3]
    (-> this (.set p-148095-1 p-148095-2 p-148095-3)))
  ([^ShaderUniform this ^Float p-148087-1 ^Float p-148087-2]
    (-> this (.set p-148087-1 p-148087-2)))
  ([^ShaderUniform this ^Float p-148090-1]
    (-> this (.set p-148090-1))))

(defn set-safe
  "p-148092-1 - `float`
  p-148092-2 - `float`
  p-148092-3 - `float`
  p-148092-4 - `float`"
  ([^ShaderUniform this ^Float p-148092-1 ^Float p-148092-2 ^Float p-148092-3 ^Float p-148092-4]
    (-> this (.setSafe p-148092-1 p-148092-2 p-148092-3 p-148092-4))))

(defn upload
  ""
  ([^ShaderUniform this]
    (-> this (.upload))))

