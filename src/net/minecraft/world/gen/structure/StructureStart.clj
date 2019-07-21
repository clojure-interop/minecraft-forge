(ns net.minecraft.world.gen.structure.StructureStart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStart]))

(defn ->structure-start
  "Constructor.

  chunk-x - `int`
  chunk-z - `int`"
  (^StructureStart [^Integer chunk-x ^Integer chunk-z]
    (new StructureStart chunk-x chunk-z))
  (^StructureStart []
    (new StructureStart )))

(defn write-to-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^StructureStart this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.writeToNBT tag-compound))))

(defn read-from-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^StructureStart this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readFromNBT tag-compound))))

(defn get-chunk-pos-z
  "returns: `int`"
  (^Integer [^StructureStart this]
    (-> this (.getChunkPosZ))))

(defn write-structure-components-to-nbt
  "chunk-x - `int`
  chunk-z - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^StructureStart this ^Integer chunk-x ^Integer chunk-z]
    (-> this (.writeStructureComponentsToNBT chunk-x chunk-z))))

(defn valid-for-post-process?
  "pair - `net.minecraft.util.math.ChunkPos`

  returns: `boolean`"
  (^Boolean [^StructureStart this ^net.minecraft.util.math.ChunkPos pair]
    (-> this (.isValidForPostProcess pair))))

(defn read-structure-components-from-nbt
  "world-in - `net.minecraft.world.World`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^StructureStart this ^net.minecraft.world.World world-in ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readStructureComponentsFromNBT world-in tag-compound))))

(defn get-components
  "returns: `java.util.List<net.minecraft.world.gen.structure.StructureComponent>`"
  (^java.util.List [^StructureStart this]
    (-> this (.getComponents))))

(defn generate-structure
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  structurebb - `net.minecraft.world.gen.structure.StructureBoundingBox`"
  ([^StructureStart this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox structurebb]
    (-> this (.generateStructure world-in rand structurebb))))

(defn get-chunk-pos-x
  "returns: `int`"
  (^Integer [^StructureStart this]
    (-> this (.getChunkPosX))))

(defn sizeable-structure?
  "returns: `boolean`"
  (^Boolean [^StructureStart this]
    (-> this (.isSizeableStructure))))

(defn notify-post-process-at
  "pair - `net.minecraft.util.math.ChunkPos`"
  ([^StructureStart this ^net.minecraft.util.math.ChunkPos pair]
    (-> this (.notifyPostProcessAt pair))))

(defn get-bounding-box
  "returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^StructureStart this]
    (-> this (.getBoundingBox))))

