(ns net.minecraftforge.fml.common.functions.GenericIterableFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.functions GenericIterableFactory]))

(defn ->generic-iterable-factory
  "Constructor."
  (^GenericIterableFactory []
    (new GenericIterableFactory )))

(defn *new-casting-iterable
  "input - `java.util.Iterator`
  type - `java.lang.Class`

  returns: `<T> java.lang.Iterable<T>`"
  ([^java.util.Iterator input ^java.lang.Class type]
    (GenericIterableFactory/newCastingIterable input type)))

