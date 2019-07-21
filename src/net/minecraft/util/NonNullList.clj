(ns net.minecraft.util.NonNullList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util NonNullList]))

(defn *create
  "returns: `<E> net.minecraft.util.NonNullList<E>`"
  ([]
    (NonNullList/create )))

(defn *with-size
  "size - `int`
  fill - `E`

  returns: `<E> net.minecraft.util.NonNullList<E>`"
  ([^Integer size fill]
    (NonNullList/withSize size fill)))

(defn get
  "p-get-1 - `int`

  returns: `E`"
  ([^NonNullList this ^Integer p-get-1]
    (-> this (.get p-get-1))))

(defn set
  "p-set-1 - `int`
  p-set-2 - `E`

  returns: `E`"
  ([^NonNullList this ^Integer p-set-1 p-set-2]
    (-> this (.set p-set-1 p-set-2))))

(defn add
  "p-add-1 - `int`
  p-add-2 - `E`"
  ([^NonNullList this ^Integer p-add-1 p-add-2]
    (-> this (.add p-add-1 p-add-2))))

(defn remove
  "p-remove-1 - `int`

  returns: `E`"
  ([^NonNullList this ^Integer p-remove-1]
    (-> this (.remove p-remove-1))))

(defn size
  "returns: `int`"
  (^Integer [^NonNullList this]
    (-> this (.size))))

(defn clear
  ""
  ([^NonNullList this]
    (-> this (.clear))))

