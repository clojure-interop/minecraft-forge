(ns net.minecraftforge.fml.relauncher.ModListHelper$JsonModList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher ModListHelper$JsonModList]))

(defn ->json-mod-list
  "Constructor."
  (^ModListHelper$JsonModList []
    (new ModListHelper$JsonModList )))

(defn repository-root
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ModListHelper$JsonModList this]
    (-> this .-repositoryRoot)))

(defn mod-ref
  "Instance Field.

  type: java.util.List<java.lang.String>"
  (^java.util.List [^ModListHelper$JsonModList this]
    (-> this .-modRef)))

(defn parent-list
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ModListHelper$JsonModList this]
    (-> this .-parentList)))

