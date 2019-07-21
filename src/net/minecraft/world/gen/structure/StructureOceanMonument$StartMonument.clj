(ns net.minecraft.world.gen.structure.StructureOceanMonument$StartMonument
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonument$StartMonument]))

(defn ->start-monument
  "Constructor.

  world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`"
  (^StructureOceanMonument$StartMonument [^net.minecraft.world.World world-in ^java.util.Random random ^Integer chunk-x ^Integer chunk-z]
    (new StructureOceanMonument$StartMonument world-in random chunk-x chunk-z))
  (^StructureOceanMonument$StartMonument []
    (new StructureOceanMonument$StartMonument )))

(defn generate-structure
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  structurebb - `net.minecraft.world.gen.structure.StructureBoundingBox`"
  ([^StructureOceanMonument$StartMonument this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox structurebb]
    (-> this (.generateStructure world-in rand structurebb))))

(defn valid-for-post-process?
  "pair - `net.minecraft.util.math.ChunkPos`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonument$StartMonument this ^net.minecraft.util.math.ChunkPos pair]
    (-> this (.isValidForPostProcess pair))))

(defn notify-post-process-at
  "pair - `net.minecraft.util.math.ChunkPos`"
  ([^StructureOceanMonument$StartMonument this ^net.minecraft.util.math.ChunkPos pair]
    (-> this (.notifyPostProcessAt pair))))

(defn write-to-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^StructureOceanMonument$StartMonument this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.writeToNBT tag-compound))))

(defn read-from-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^StructureOceanMonument$StartMonument this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readFromNBT tag-compound))))

