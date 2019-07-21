(ns net.minecraftforge.fml.common.toposort.ModSorter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.toposort ModSorter]))

(defn ->mod-sorter
  "Constructor.

  mod-list - `java.util.List`
  name-lookup - `java.util.Map`"
  (^ModSorter [^java.util.List mod-list ^java.util.Map name-lookup]
    (new ModSorter mod-list name-lookup)))

(defn sort
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^ModSorter this]
    (-> this (.sort))))

