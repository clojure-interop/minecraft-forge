(ns net.minecraftforge.fml.relauncher.ReflectionHelper
  "Some reflection helper code."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ReflectionHelper]))

(defn ->reflection-helper
  "Constructor."
  (^ReflectionHelper []
    (new ReflectionHelper )))

(defn *find-field
  "clazz - `java.lang.Class`
  field-names - `java.lang.String`

  returns: `java.lang.reflect.Field`"
  (^java.lang.reflect.Field [^java.lang.Class clazz ^java.lang.String field-names]
    (ReflectionHelper/findField clazz field-names)))

(defn *get-private-value
  "class-to-access - `java.lang.Class`
  instance - `E`
  field-index - `int`

  returns: `<T,E> T`"
  ([^java.lang.Class class-to-access instance ^Integer field-index]
    (ReflectionHelper/getPrivateValue class-to-access instance field-index)))

(defn *set-private-value
  "class-to-access - `java.lang.Class`
  instance - `T`
  value - `E`
  field-index - `int`

  returns: `<T,E> void`"
  ([^java.lang.Class class-to-access instance value ^Integer field-index]
    (ReflectionHelper/setPrivateValue class-to-access instance value field-index)))

(defn *get-class
  "loader - `java.lang.ClassLoader`
  class-names - `java.lang.String`

  returns: `java.lang.Class<? super java.lang.Object>`"
  ([^java.lang.ClassLoader loader ^java.lang.String class-names]
    (ReflectionHelper/getClass loader class-names)))

(defn *find-method
  "clazz - `java.lang.Class`
  instance - `E`
  method-names - `java.lang.String[]`
  method-types - `java.lang.Class`

  returns: `<E> java.lang.reflect.Method`"
  ([^java.lang.Class clazz instance method-names ^java.lang.Class method-types]
    (ReflectionHelper/findMethod clazz instance method-names method-types)))

