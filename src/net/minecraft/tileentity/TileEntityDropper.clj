(ns net.minecraft.tileentity.TileEntityDropper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityDropper]))

(defn ->tile-entity-dropper
  "Constructor."
  (^TileEntityDropper []
    (new TileEntityDropper )))

(defn *register-fixes-dropper
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityDropper/registerFixesDropper fixer)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityDropper this]
    (-> this (.getName))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityDropper this]
    (-> this (.getGuiID))))

