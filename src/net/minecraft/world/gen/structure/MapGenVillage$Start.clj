(ns net.minecraft.world.gen.structure.MapGenVillage$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenVillage$Start]))

(defn ->start
  "Constructor.

  world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  x - `int`
  z - `int`
  size - `int`"
  (^MapGenVillage$Start [^net.minecraft.world.World world-in ^java.util.Random rand ^Integer x ^Integer z ^Integer size]
    (new MapGenVillage$Start world-in rand x z size))
  (^MapGenVillage$Start []
    (new MapGenVillage$Start )))

(defn sizeable-structure?
  "returns: `boolean`"
  (^Boolean [^MapGenVillage$Start this]
    (-> this (.isSizeableStructure))))

(defn write-to-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^MapGenVillage$Start this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.writeToNBT tag-compound))))

(defn read-from-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^MapGenVillage$Start this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readFromNBT tag-compound))))

