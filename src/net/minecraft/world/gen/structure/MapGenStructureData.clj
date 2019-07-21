(ns net.minecraft.world.gen.structure.MapGenStructureData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenStructureData]))

(defn ->map-gen-structure-data
  "Constructor.

  name - `java.lang.String`"
  (^MapGenStructureData [^java.lang.String name]
    (new MapGenStructureData name)))

(defn *format-chunk-coords
  "chunk-x - `int`
  chunk-z - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer chunk-x ^Integer chunk-z]
    (MapGenStructureData/formatChunkCoords chunk-x chunk-z)))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^MapGenStructureData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MapGenStructureData this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn write-instance
  "tag-compound-in - `net.minecraft.nbt.NBTTagCompound`
  chunk-x - `int`
  chunk-z - `int`"
  ([^MapGenStructureData this ^net.minecraft.nbt.NBTTagCompound tag-compound-in ^Integer chunk-x ^Integer chunk-z]
    (-> this (.writeInstance tag-compound-in chunk-x chunk-z))))

(defn get-tag-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MapGenStructureData this]
    (-> this (.getTagCompound))))

