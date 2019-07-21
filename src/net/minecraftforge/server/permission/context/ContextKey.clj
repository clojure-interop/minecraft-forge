(ns net.minecraftforge.server.permission.context.ContextKey
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context ContextKey]))

(defn *create
  "id - `java.lang.String`
  c - `java.lang.Class`

  returns: `<E> net.minecraftforge.server.permission.context.ContextKey<E>`"
  ([^java.lang.String id ^java.lang.Class c]
    (ContextKey/create id c)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ContextKey this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ContextKey this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ContextKey this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-type-class
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^ContextKey this]
    (-> this (.getTypeClass))))

