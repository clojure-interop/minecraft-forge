(ns net.minecraftforge.fml.common.toposort.ModSortingException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.toposort ModSortingException]))

(defn ->mod-sorting-exception
  "Constructor.

  string - `java.lang.String`
  node - `T`
  visited-nodes - `java.util.Set`"
  (^ModSortingException [^java.lang.String string node ^java.util.Set visited-nodes]
    (new ModSortingException string node visited-nodes)))

(defn get-exception-data
  "returns: `<T> net.minecraftforge.fml.common.toposort.ModSortingException$SortingExceptionData<T>`"
  ([^ModSortingException this]
    (-> this (.getExceptionData))))

