(ns net.minecraft.tileentity.TileEntityComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityComparator]))

(defn ->tile-entity-comparator
  "Constructor."
  (^TileEntityComparator []
    (new TileEntityComparator )))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityComparator this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityComparator this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-output-signal
  "returns: `int`"
  (^Integer [^TileEntityComparator this]
    (-> this (.getOutputSignal))))

(defn set-output-signal
  "output-signal-in - `int`"
  ([^TileEntityComparator this ^Integer output-signal-in]
    (-> this (.setOutputSignal output-signal-in))))

