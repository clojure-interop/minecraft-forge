(ns net.minecraft.util.ClassInheritanceMultiMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ClassInheritanceMultiMap]))

(defn ->class-inheritance-multi-map
  "Constructor.

  base-class-in - `java.lang.Class`"
  (^ClassInheritanceMultiMap [^java.lang.Class base-class-in]
    (new ClassInheritanceMultiMap base-class-in)))

(defn add
  "p-add-1 - `T`

  returns: `boolean`"
  (^Boolean [^ClassInheritanceMultiMap this p-add-1]
    (-> this (.add p-add-1))))

(defn remove
  "p-remove-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ClassInheritanceMultiMap this ^java.lang.Object p-remove-1]
    (-> this (.remove p-remove-1))))

(defn contains
  "p-contains-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ClassInheritanceMultiMap this ^java.lang.Object p-contains-1]
    (-> this (.contains p-contains-1))))

(defn get-by-class
  "clazz - `java.lang.Class`

  returns: `<S> java.lang.Iterable<S>`"
  ([^ClassInheritanceMultiMap this ^java.lang.Class clazz]
    (-> this (.getByClass clazz))))

(defn iterator
  "returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^ClassInheritanceMultiMap this]
    (-> this (.iterator))))

(defn size
  "returns: `int`"
  (^Integer [^ClassInheritanceMultiMap this]
    (-> this (.size))))

